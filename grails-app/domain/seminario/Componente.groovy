package seminario

class Componente {

	String nombre
	String marca
	String origen
	String especificaciones// detalle particular

    static constraints = {
    }

    Componente(String nombre, String marca, String origen, String especificaciones){
    
		this.nombre = nombre
		this.marca = marca
		this.origen = origen
		this.especificaciones = especificaciones
		}

}
