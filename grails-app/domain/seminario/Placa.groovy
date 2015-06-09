package seminario

class Placa extends Componente{
	
	String extension_conector
	String velocidad
	String tipo_de_placa // video audio red ¿justifica otra herencia?
	
    static constraints = {
    }

    Placa (String ext_conector,String velocidad,String tipo_de_placa ){

    	this.extension_conector= ext_conector
    	this.velocidad= velocidad
    	this.tipo_de_placa = tipo_de_placa
    }
}
