import seminario.*

class BootStrap {

    def init = { servletContext ->
    
     new Red(nombre:"Ncoco", contrasena:"1234",barrio:"La Boca").save()
	 new Red("Acceso Irala","ceferino", "Barracas").save()
	 new Red("Cafe Martinez","patricios123", "La Boca").save()
    }
    def destroy = {
    }
}
