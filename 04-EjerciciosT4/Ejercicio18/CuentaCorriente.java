/*
 */
package ejercicio07.CuentaCorriente;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class CuentaCorriente {

    //ATRIBUTOS
    private int numero;
    private double saldo;

    //METODOS CONSTRUCTORES
    public CuentaCorriente() {

        this.numero = (int) (Math.random() * 1000 + 0);
        this.saldo = 0;
    }

    public CuentaCorriente(int n) {

        this.numero = n;
        this.saldo = 0;
    }

    public CuentaCorriente(int n, double s) {

        this.numero = n;
        this.saldo = s;

    }

    //SETTERS
    public void retirarDinero(int cantidad) throws Exception {

        if (cantidad <= saldo) {

            this.saldo = this.saldo - cantidad;

        } else {

            Exception e = new Exception("El saldo es menor que la cantidad ingresada");
            throw e;

        }
    }

    public void añadirDinero(int cantidad) {

        this.saldo = cantidad + this.saldo;

    }

    //GETTERS
    public double getSaldo() {

        return this.saldo;

    }

    public double getNumero() {

        return this.numero;

    }

}
