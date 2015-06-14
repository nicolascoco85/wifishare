package seminario

abstract class Componente {

	String modelo
	String conector
	String capacidad
	String velocidad
	String detalle
	String tipo

    static constraints = {
    }

   
	abstract boolean Compatible (Mother mother)

}
