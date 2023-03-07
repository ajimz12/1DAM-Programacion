

package tema5.ejercicio05;

/**
 *
 * @author Alvaro <alvarojimgil12@gmail.com>
 */
public class Rascacielos extends Edificio{
    
    //ATRIBUTO
    private int altura;
    
    /**
     * Constructor con par?metros
     * 
     * @param d direccion de edificio
     * @param np numero de plantas del edificio
     * @param a altura de rascacielos
     */
    public Rascacielos(String d,int np, int a){

    super(d, np);

        if (a < 0) {
            
            throw new IllegalArgumentException("La altura est? en valores negativos");
         
        }else{
            
            this.altura= a;
        }

    }
    
    public int setAltura(int np){
        
        return 10 * np;
    }
    
    /**
     * Obtiene altura del rascacielos
     * 
     * @return altura del rascacielos
     */
    public int getAltura(){
        
        return this.altura;
    };

}
