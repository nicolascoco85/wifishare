package seminario

class Placa extends Componente{
	
	
    static constraints = {
    }

    Placa (String conector,String velocidad){

    	this.conector= conector
    	this.velocidad= velocidad
     }


    boolean Compatible(Mother mother){
    
        if ((mother.extension_video==this.conector) || (mother.extension_audio==this.conector))
            return TRUE
    }
}
