package seminario

class Ensamblador {

	Mother mother
	Procesador procesador 
	componentesElegidos = [Componente:Integer]
	


    static constraints = {
    }

    Ensamblador(Mother mother, [Componente:Integer] componentesElegidos){

    	this.mother = mother



    	/*if (!procesador.esCompatibleCon(mother)	){

    		Println("No es compatible el procesador")
    	}*/

    	// aca vendria un each de cada componente para ver compatible
    	/* si para cada componente es compatible con el mother y es menor o igual a la cantidad de 
    	lugares disponibles que tiene el mother, el ensamble sera existoso*/

    	componentesElegidos.each{

    		if (!it.esCompatibleCon(mother)){
	    		Println("No es compatible el procesador")
        	}
        }	





        

   	 }


}
