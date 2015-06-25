package seminario

class Mother{

	TipoSocket socket
	String tipo_memoria
	String extension_video // pci express - agp
	String extension_red //pci
	String extension_audio//pci

    static constraints = {
     }

     Mother(TipoSocket socket, String tipo,String ext_video, String ext_red, String ext_audio) {

     	this.socket = socket
     	this.tipo_memoria = tipo
     	this.extension_video = ext_video
     	this.extension_audio = ext_audio
     	this.extension_red = ext_red

    }

     boolean tieneSocket(TipoSocket socketComponente) {
        return this.socket.tieneTipoSocket(socketComponente)
    }

    void agregarProcesador(Procesador procesador) {
        if (this.socket.libre()) {
            socket.agregarProcesador(procesador)
        }

    }


}
