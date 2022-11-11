/*
 */
package ejercicio05java;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Ejercicio05Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String frase = "Dabale arroz a la zorra el abad";
        esPolindromo(frase);

	}

	public static void esPolindromo(String p) {
		String fraseReversa = "";
		String frase = p.toLowerCase().trim().replace(" ", "")
				.replace(".", "").replace(",","").replace("á","a")
				.replace("é","e").replace("í","i").replace("ó","o")
				.replace("ú","u");

		
		
		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseReversa += frase.charAt(i);
		}

		if (frase.equals(fraseReversa)) {
			System.out.println("Esta frase si es polindroma");
		} else {
			System.out.println("Esta frase no es polindroma");
		}
	}
    
    
    }