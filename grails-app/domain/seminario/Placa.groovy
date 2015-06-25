package seminario

class Placa extends Componente{

    TipoConector conector
	
	
    static constraints = {
    }

    Placa (TipoConector conector){
        this.conector = conector

      }


     boolean esCompatibleCon (Mother mother){

        return mother.tieneConector(this.conector)
    }
}
