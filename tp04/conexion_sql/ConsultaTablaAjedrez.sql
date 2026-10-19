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