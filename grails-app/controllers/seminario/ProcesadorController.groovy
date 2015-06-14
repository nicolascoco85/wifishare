package seminario

class ProcesadorController {
	static scaffold = true

    def index() { 

    	render "Procesador"
    }

    def compatible (Mother mother){

 		return mother.socket == this.socket
	}

}
