package seminario

class Memoria extends Componente{

	String capacidad
	String velocidad
	String tipo_slot
	

    static constraints = {
    }

    Memoria (String capacidad, 	String velocidad, String tipo_slot ){

    	this.capacidad= capacidad
    	this.velocidad= velocidad
    	this.tipo_slot= tipo_slot
    }
}
