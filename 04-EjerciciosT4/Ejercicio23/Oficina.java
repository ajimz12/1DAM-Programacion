/*
 */
package ejercicio05.oficina;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
import ejercicio04.Persona.Persona;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;

public class Oficina {

    //ATRIBUTOS
    
    private String nombre;
    private ArrayList<Persona> trabajadores;

    //METODOS
    //POR DEFECTO
    
    private Oficina() {

        this.trabajadores = new ArrayList<Persona>();
        this.nombre = "Industrias DAW";

        trabajadores.add(new Persona("Ana Diaz Diaz",
                33333333, 'P', 1200,
                LocalDate.of(1985, 05, 21)));
        trabajadores.add(new Persona("Luis Lopez Lopez",
                22222222, 'J', 1000,
                LocalDate.of(1985, 05, 21)));
        trabajadores.add(new Persona("Antonio Perez Perez",
                11111111, 'H', 900,
                LocalDate.of(1985, 05, 21)));
    }

    //
    
    private Oficina(String n) {

        this.nombre = n;
        trabajadores = null;

    }

    private Oficina(String n, int t) {

        this.nombre = n;

        if (t <= 0 || t > 3) {

            this.trabajadores = new ArrayList<Persona>();

        } else if (t == 1) {

            this.trabajadores.add(new Persona("Antonio P�rez P�rez", 11111111,
                    'H', 900, LocalDate.of(2000, Month.FEBRUARY, 28)));

        } else if (t == 2) {

            this.trabajadores.add(new Persona("Luis L�pez L�pez", 22222222,
                    'J', 1000, LocalDate.of(1995, Month.SEPTEMBER, 10)));
            this.trabajadores.add(new Persona("Antonio P�rez P�rez", 11111111,
                    'H', 900, LocalDate.of(2000, Month.FEBRUARY, 28)));

        } else if (t == 3) {

            this.trabajadores.add(new Persona("Luis L�pez L�pez", 22222222,
                    'J', 1000, LocalDate.of(1995, Month.SEPTEMBER, 10)));
            this.trabajadores.add(new Persona("Antonio P�rez P�rez", 11111111,
                    'H', 900, LocalDate.of(2000, Month.FEBRUARY, 28)));
            this.trabajadores.add(new Persona("Ana D�az D�az", 33333333,
                    'P', 1200, LocalDate.of(1985, Month.MAY, 21)));

        }else if(t > 3){
            
            IllegalArgumentException e = new IllegalArgumentException("El tipo debe ser menor que 3 y mayor o igual a 0");
            throw e;
        }

    }

    //GETTERS
    public ArrayList<Persona> getTrabajadores() {

        return this.trabajadores;

    }

    public double getSueldoMedio() throws Exception {

        if (trabajadores.size() > 0) {

            double total = 0;
            if (trabajadores.size()>0) {
                
                for (int x = 0; x < trabajadores.size(); x++) {
                    
                    total += trabajadores.get(x).getSueldo();
                }
                
            }
                total = total / trabajadores.size();
                return total;
                
            } else {
                
                Exception e = new Exception("En la oficina no existe "
                        + "ning�n trabajador");
                throw e;
            }

        }


    @Override
    public String toString() {

        String aux = "Nombre: " + this.nombre + "\n";

        for (int x = 0; x < trabajadores.size(); x++) {
            aux = String.valueOf(x);
        }
        return aux;

    }
    
    public static Oficina getOficinaVacia(){
        
        return new Oficina("Vacia",0);
        
    }
    
    public static Oficina getOficinaPeque�a(){
        
        return new Oficina("Peque�a",1);
        
    }
    
    public static Oficina getOficinaMediana(){
        
        return new Oficina("Mediana",2);
        
    }
    
    public static Oficina getOficinaGrande(){
        
        return new Oficina("Grande",3);
        
    }
    
 
    //SETTERS
    public void setNombreOficina(String n) {

        this.nombre = n;

    }

    public void a�adirEmpleado(Persona p) {

        trabajadores.add(p);

    }

    public void a�adirEmpleado(String nombre, int dni, char letra, double sueldo,
            LocalDate fechaNac) {

        Persona p = new Persona(nombre, dni, letra, sueldo, fechaNac);

    }
    

}
