package seminario

class Usuario {

	String nombre
	String contrasena
	String correo
	String direccion

    static constraints = {
    }
    
    Usuario(String nombre, String contrasena, String correo, String direccion){
    
		this.nombre = nombre
		this.contrasena = contrasena
		this.correo = correo
		this.direccion = direccion
		}

class Cliente extends Usuario{

	String profesion
	}

class Proveedor extends Usuario{

	String tipo_venta // minorista- mayorista
	String tipo_facturacion // efectivo, cuotas
	String envio
	}

class PrestadorDeServicio extends Usuario{

	String tipo_servicio // reparador y/o armador de pc 
	String tipo_facturacion
	String atencion_a_domicilio   
	}


}
