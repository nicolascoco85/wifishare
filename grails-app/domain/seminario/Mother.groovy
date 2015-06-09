package seminario

class Mother extends Componente{

	String socket
	String tipo_slot_memoria
	String cantidad_de_slot_memoria
	String extension_video // pci express - agp
	String extension_red //pci
	String extension_audio//pci

    static constraints = {
     }

     Mother(String socket, String tipo, String cant, 
    	String ext_video, String ext_red, String ext_audio) {

     	this.socket = socket
     	this.tipo_slot_memoria = tipo
     	this.cantidad_de_slot_memoria = cant
     	this.extension_video = ext_video
     	this.extension_audio = ext_audio
     	this.extension_red = ext_red

    }

}
