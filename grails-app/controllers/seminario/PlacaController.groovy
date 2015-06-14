package seminario

class PlacaController {
	static scaffold = true

   def index() { 
    	render "Placa"
    }

    def compatible (Mother mother){

 		return TRUE // resolver si son placa de video audio o red.
	}
}
