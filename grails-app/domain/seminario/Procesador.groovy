package seminario

class Procesador extends Componente{

	String velocidad
	String arquitectura // 32-64 bit
	String tipo // dual core- celeron- sempron
	String socket

    static constraints = {
    }

    Procesador (String velocidad,String arquitectura,String tipo,String socket){

    	this.velocidad= velocidad
    	this.arquitectura= arquitectura
    	this.tipo= tipo
    	this.socket = socket
    
    }
}
