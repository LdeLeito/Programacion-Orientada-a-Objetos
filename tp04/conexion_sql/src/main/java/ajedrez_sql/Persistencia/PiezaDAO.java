package ajedrez_sql.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ajedrez_sql.Modelo.*;

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
        switch (pieza.getTipo()) {
            case "Rey":
                return 1;
            case "Reina":
                return 2;
            case "Torre":
                return 3;
            case "Alfil":
                return 4;
            case "Caballo":
                return 5;
            case "Peon":
                return 6;
            default:
                throw new IllegalArgumentException("Tipo desconocido: " + pieza.getTipo());
        }
    }

    private int obteneridColor(Pieza pieza) {
        // Como solo tengo dos colores, puedo retornar 1 para blanco y 2 para negro
        if (pieza.getColor() == Color.BLANCO) {
            return 1;
        } else {
            return 2;
        }
    }
}