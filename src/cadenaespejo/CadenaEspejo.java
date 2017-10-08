
package cadenaespejo;

import java.util.Scanner;


public class CadenaEspejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scan = new Scanner(System.in);
		String palabra;
		int posicion;
		char caracter;
		System.out.println("Ingrese la palabra");
		palabra = scan.next();
		posicion = palabra.length() - 2;
		while (posicion >= 0){
			caracter = palabra.charAt(posicion);
			palabra = palabra + caracter;
			posicion--;
		}
		System.out.println(" la Palabra espejo es : " + palabra);
	}
}
    
    
