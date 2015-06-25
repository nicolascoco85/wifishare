package seminario

class Socket {

	TipoSocket tipoSocket;
    Procesador procesador;

    static constraints = {

    }

    boolean libre() {
        return procesador == null
    }

    void agregarProcesador(Procesador procesador) {
        this.procesador = procesador
    }

    boolean tieneTipoSocket(TipoSocket socketComponente) {
        return tipoSocket.equals(socketComponente)
    }

}
