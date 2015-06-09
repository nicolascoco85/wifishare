package seminario

class MemoriaController {

    def index() { 

    	render "Memorias"
    }

    def compatible (Mother mother){

 		return mother.tipo_slot_memoria == this.tipo_slot
	}

}
