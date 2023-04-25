package tema5.ejercicio25;

import tema5.ejercicio24.*;
import tema5.ejercicio23.*;
import java.util.Objects;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public abstract class Animal{

    //ATRIBUTOS
    private String nombre;
    private int peso;
    private boolean encerrado;

    public Animal(String n, int p) {

        this.peso = p;
        this.nombre = n;
    }

    public String getNombre() {

        return nombre;
    }

    public int getPeso() {

        return peso;
    }

    public boolean isEncerrado() {

        return encerrado;
    }

    public void setNombre(String n) {

        this.nombre = n;
    }

    public void setPeso(int p) {

        this.peso = p;
    }

    void setEncerrado(boolean b) {

        this.encerrado = b;

    }

    public abstract void emitirSonido();

    @Override
    public String toString() {

        String aux = "Nombre: " + this.nombre + "\n Peso: " + this.peso;

        return aux;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

}
