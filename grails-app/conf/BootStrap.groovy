import seminario.*

class BootStrap {

    def init = { servletContext ->
    
  	 new Usuario("pablo", "cosso", "pcfiuba@fi.uba.ar", "La Boca" ).save(failOnError:true)
	 new Usuario("mauricio", "ciancio", "mcfiuba@fi.uba.ar", "San Telmo" ).save(failOnError:true)
	 new Usuario("alan", "picazzo", "apfiuba@fi.uba.ar", "Barracas" ).save(failOnError:true)

	 new Componente("Fx5500", "Nvidia", "China", "AGP" ).save(failOnError:true)
	 new Componente("Mem DRR2","Kingtone", "Malasia", "Garantia de por Vida" ).save(failOnError:true)
	 new Componente("M3A-Pro", "Asus", "China", "Lider en tecnologia" ).save(failOnError:true)


    }
    def destroy = {
    }
}
