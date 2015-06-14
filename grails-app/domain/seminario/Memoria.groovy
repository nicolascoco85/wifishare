package seminario

class Memoria extends Componente{

	
    static constraints = {
    }

    Memoria (String capacidad, 	String velocidad, String conector ){

    	this.capacidad= capacidad
    	this.velocidad= velocidad
    	this.conector= conector
    }


    boolean Compatible (Mother mother){

        return (mother.tipo_memoria == this.conector)
    }
}
