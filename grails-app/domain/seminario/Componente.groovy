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
 
class Procesador extends Componente{

	String velocidad
	String arquitectura // 32-64 bit
	String tipo // dual core- celeron- sempron
	String socket
	}

class Memoria extends Componente{

	String capacidad
	String velocidad
	String tipo_slot
	}

class Mother extends Componente{

	String socket
	String tipo_slot_memoria
	String cantidad_de_slot_memoria
	String extension_conector // pci, pci express, sata, ide
	String integrado // vga, PS/2, serial, puerto paralelo, puertos usb, Lan, jacks audio
	}

class Placa extends Componente{
	String extension_conector
	String velocidad
	String tipo_de_placa // video audio red ¿justifica otra herencia?
	}

	


}
