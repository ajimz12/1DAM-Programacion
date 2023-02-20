package ejercicio22.Fraccion;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Fraccion {

    //ATRIBUTOS
    private int numerador;
    private int denominador;

    //METODOS
    public Fraccion(int n, int d) {

        this.numerador = n;
        this.denominador = d;

    }

    //GETTERS
    public int getNumerador() {

        return this.numerador;

    }

    public int getDenominador() {

        return this.denominador;

    }

    public double getValorReal() {

        double real = this.numerador / this.denominador;
        return real;
    }

    public Fraccion getInversa() {

        return new Fraccion(denominador, numerador);

    }

    //SUMA DE FRACCIONES
    public static Fraccion sumar(Fraccion a, Fraccion b) {

        return new Fraccion(a.numerador * b.denominador + b.numerador
                * a.denominador, a.numerador * b.denominador);

    }

    //MULTIPLICACION DE FRACCIONES
    public static Fraccion multiplicar(Fraccion a, Fraccion b) {

        return new Fraccion(a.numerador * b.numerador, a.denominador
                * b.denominador);

    }

    //DIVISION DE FRACCIONES
    public static Fraccion dividir(Fraccion a, Fraccion b) {

        return multiplicar(a, b.getInversa());

    }
    
    @Override 
    public String toString(){
        
        String aux;
        
        aux = numerador + "/" + denominador;
        
        return aux;
        
        
    }

}
