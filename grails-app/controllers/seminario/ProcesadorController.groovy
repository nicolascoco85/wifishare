package seminario

class ProcesadorController {

    def index() { 

    	render "Procesador"
    }

    def compatible (Mother mother){

 		return mother.socket == this.socket
	}

}
