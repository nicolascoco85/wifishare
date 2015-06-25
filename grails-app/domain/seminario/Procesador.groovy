package seminario

class Procesador extends Componente{

	String arquitectura // 32-64 bit
	TipoSocket socket
    static constraints = {
    }

    Procesador (String arquitectura, TipoSocket socket){

    	   	this.arquitectura= arquitectura
            this.socket = socket
    	    
    }

    boolean Compatible(Mother mother){
    
        return mother.tieneSocket(tipoSocket)
    }

    void agregarseA(Mother mother) {
        this.mother.agregarProcesador(this)

    }
}
