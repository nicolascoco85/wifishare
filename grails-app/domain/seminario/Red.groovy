package seminario

class Red {
	String nombre
	String barrio
	String contrasena
	long longitud
	long latitud
	String privacidad
	int ranking
	

    static constraints = {
	nombre blank: false, nullable:false
	contrasena blank: false, nullable:false
    }
    
    Red(def cmd){
	
	this.nombre= cmd.nombre
	this.contrasena= cmd.contrasena
	this.barrio=c md.barrio

	}

    
}
