package crearclase;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.awt.*;
import crearclase.animales.*;

public class CrearClase {

    

    public static void main(String[] args) {

        String nombre = "Pepito";
        int edad = 6;
        String raza = "Dalmata";
        Point posicion = new Point();
        boolean hambriento = true;
        
        Perro p0 = new Perro();
        Perro p1 = new Perro(nombre,edad,raza);
        Perro p2 = new Perro(nombre,edad,raza,posicion,
                hambriento);
        
        p0.setNombre("Paquito");
        p0.setHambriento(false);
        
        System.out.println("Nombre perro 0: "+p0.getNombre());
        System.out.println("Tiene hambre el perro 0?: "+p0.getHambriento());
        
        
    }

}
