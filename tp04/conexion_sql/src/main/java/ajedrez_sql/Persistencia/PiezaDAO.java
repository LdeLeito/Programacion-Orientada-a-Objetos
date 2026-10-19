package ajedrez_sql.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ajedrez_sql.Modelo.Color;
import ajedrez_sql.Modelo.Pieza;

public class PiezaDAO {
    private final AccesoDB db;

    public PiezaDAO() {
        db = new AccesoDB();
    }

    public void insertarPieza(Pieza pieza) {
        String sql = "INSERT INTO pieza (idTipo, idColor, PosX, PosY, esCapturada) VALUES (?, ?, ?, ?, ?)";
        try (Connection conexion = db.getConexion();
                PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, obtenerIdTipo(pieza));
            ps.setInt(2, obteneridColor(pieza));
            ps.setInt(3, pieza.getX());
            ps.setInt(4, pieza.getY());
            ps.setBoolean(5, pieza.getCapturada());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("No se pudo insertar la pieza", e);
        }
    }

    private int obtenerIdTipo(Pieza pieza) {
        return switch (pieza.getTipo()) {
            case "Rey" -> 1;
            case "Reina" -> 2;
            case "Torre" -> 3;
            case "Alfil" -> 4;
            case "Caballo" -> 5;
            case "Peón" -> 6;
            default -> throw new IllegalArgumentException("Tipo desconocido: " + pieza.getTipo());
        };
    }

    private int obteneridColor(Pieza pieza) {
        // Como solo tengo dos colores, puedo retornar 1 para blanco y 2 para negro
        if (pieza.getColor() == Color.BLANCO) {
            return 1;
        } else {
            return 2;
        }
    }

    public void listarPiezas() {
        // Consulta sql
        String sql = """
                select
                p.idPieza,
                t.tipoPieza,
                c.nombreColor,
                p.posX,
                p.posY,
                p.esCapturada
                from pieza p
                inner join tipo t
                    on p.idTipo = t.idTipo
                inner join color c
                    on p.idColor= c.idColor
                """;

        try (
                Connection conexion = db.getConexion();
                PreparedStatement ps = conexion.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {

                System.out.println(
                        "ID: " + rs.getInt("idPieza")
                                + " | Pieza: " + rs.getString("tipoPieza")
                                + " | Color: " + rs.getString("nombreColor")
                                + " | PosX: " + rs.getInt("posX")
                                + " | PosY: " + rs.getInt("posY")
                                + " | Capturada: "
                                + rs.getBoolean("esCapturada"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(
                    "No se pudieron listar las piezas",
                    e);
        }
    }
}