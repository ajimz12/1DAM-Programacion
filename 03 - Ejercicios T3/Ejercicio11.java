package tema.pkg3.ejs;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
import java.util.*;
import java.io.*;

public class Ejercicio11 {

    public static void main(String[] args) {

        boolean repetir = true;
        String ruta = "c:/pruebas/(poner el dni).txt";
        char opcion;
        int dni;
        String nombre;
        String direccion;
        int numtlf;

        while (repetir) {

            System.out.println("1. Añadir nuevo alumno");
            System.out.println("2. Ver los datos de un alumno");
            System.out.println("3. Salir");

            System.out.println("Elegir una opción (1,2 o 3): ");
            opcion = new Scanner(System.in).next().charAt(0);

            if (opcion == '1') {

                System.out.println("¿Cúal es tu DNI? ");
                dni = new Scanner(System.in).nextInt();

                System.out.println("Cúal es tu nombre? ");
                nombre = new Scanner(System.in).nextLine();

                System.out.println("¿Cúal es tu dirección?");
                direccion = new Scanner(System.in).nextLine();

                System.out.println("¿Cúal es tu número de teléfono?");
                numtlf = new Scanner(System.in).nextInt();

                try {

                    PrintWriter salida
                            = new PrintWriter(ruta);

                    salida.println(dni);
                    salida.println(nombre);
                    salida.println(direccion);
                    salida.println(numtlf);
                    salida.close();

                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else if (opcion == '2') {

                System.out.println("");

                System.out.println("¿Cúal es tu DNI? ");
                dni = new Scanner(System.in).nextInt();

                try {

                    BufferedReader br = new BufferedReader(new FileReader(ruta));
                    String linea;

                    while ((linea = br.readLine()) != null) {

                        System.out.println(linea);
                    }

                } catch (Exception e) {

                    e.printStackTrace();
                }

            } else if (opcion == '3') {

                System.out.println("Saliendo del programa...");
                repetir = false;

            } else {

                System.out.println("Lo siento, no entiendo lo que has puesto,"
                        + " vuelve a introducirlo: ");

            }

        }

    }

}
