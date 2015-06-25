package seminario

abstract class Componente {

	
	//String conector
	String velocidad
	String detalle
	String tipo

    static constraints = {
    }

   
	abstract boolean esCompatibleCon (Mother mother)// renombrar metodo esCompatibleCon

}
