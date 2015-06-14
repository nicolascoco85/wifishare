import seminario.*

class BootStrap {

    def init = { servletContext ->
    
  	 new Usuario("pablo", "cosso", "pcfiuba@fi.uba.ar", "La Boca" ).save(failOnError:true)
	 new Usuario("mauricio", "ciancio", "mcfiuba@fi.uba.ar", "San Telmo" ).save(failOnError:true)
	 new Usuario("alan", "picazzo", "apfiuba@fi.uba.ar", "Barracas" ).save(failOnError:true)

	/* new Componente("Fx5500", "Nvidia","AGP" ).save(failOnError:true)
	 new Componente("Mem DRR2","Kingtone","Garantia de por Vida" ).save(failOnError:true)
	 new Componente("M3A-Pro", "Asus", "Lider en tecnologia" ).save(failOnError:true)*/

	/* new Mother("775", "DDR2", "PCI Express","PCI", "PCI").save(failOnError:true) 
	 new Mother("AM2+", "DDR3","AGP","PCI", "PCI").save(failOnError:true) 
	 new Mother("AM2+", "DDR3","PCI Express","PCI", "PCI").save(failOnError:true) 

	 new Memoria("2GB", "1600","DDR2").save(failOnError:true) 
	 new Memoria("4GB", "1800","DDR3").save(failOnError:true)
	 new Memoria("1GB", "1200","DDR400").save(failOnError:true)

	 new Procesador ("2.3 Ghz", "x64","Core Duo","775").save(failOnError:true)
	 new Procesador ("1.7 Ghz", "x86","Sempron","AM2+").save(failOnError:true)
	 new Procesador ("3.0 Ghz", "x64","Pentium 4","775").save(failOnError:true)

	 new Placa ("PCI","10-100Mb/s", "Red").save(failOnError:true)
	 new Placa ("PCI Express","30Gb/s", "Video").save(failOnError:true)
	 new Placa ("PCI","44000hz", "audio").save(failOnError:true)*/

    }
    def destroy = {
    }
}
