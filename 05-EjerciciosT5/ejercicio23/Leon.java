


package tema5.ejercicio23;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
public class Leon extends Animal{
    
    public Leon(String n, int peso){
        
        super(n,peso);
        
    }

    @Override
    public void emitirSonido(){
        
        System.out.println("Rugido de Leon");

    };

}
