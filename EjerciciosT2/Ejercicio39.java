
package ejercicio39;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Ejercicio39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String nombreSO = "os.name";
        String versionSO = "os.version";
        String arquitecturaSO = "os.arch";
        String NombreUsuarioSO = "user.name";
        String Dirtemporal = "java.io.tmpdir";
       
        



        System.out.println("-----Información sobre el SO-----");
        
        System.out.println("Nombre del SO: "+ System.getProperty(nombreSO));

        System.out.println("Version del SO: "+ System.getProperty(versionSO));

        System.out.println("Arquitectura del SO: "+ System.getProperty(arquitecturaSO));
        
        System.out.println("Nombre del usuario actual: "+ System.getProperty(NombreUsuarioSO));
   
        System.out.println(System.getProperty(Dirtemporal));
    
    }

}
