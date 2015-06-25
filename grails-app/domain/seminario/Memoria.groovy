package seminario

class Memoria extends Componente{

    String capacidad
	
    static constraints = {
    }

    Memoria (String capacidad){

    	this.capacidad= capacidad
    }


    boolean Compatible (Mother mother){

        return (mother.tipo_memoria == this.conector)
    }
}
