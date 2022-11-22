
package prueba;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class SystemProperties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombreSO = "os.name";
        String versionSO = "os.version";
        String arquitecturaSO = "os.arch";
        String NombreUsuarioSO = "user.name";
        String Directoriohome = "user.home";
        String DirUsuario = "user.dir";
        String VersionJava = "java.version";
        String DirectorioJavaHome = "java.home";
        String RutaJava = "java.class.path";
        String JavaVendor = "java.vendor";
        String JavaVendorUrl = "java.vendor.url";
        
        
        System.out.println("\nInformación sobre el SO: ");
        
        System.out.println("\nNombre del SO: "+ System.getProperty(nombreSO));
        
        System.out.println("Version del SO: "+ System.getProperty(versionSO));
        
        System.out.println("Arquitectura del SO: "+ System.getProperty(arquitecturaSO));
        
        System.out.println("Nombre del usuario del SO: "+ System.getProperty(NombreUsuarioSO));

        System.out.println("Directorio Home del usuario: "+ System.getProperty(Directoriohome));
        
        System.out.println("Directorio donde está el usuario: "+ System.getProperty(DirUsuario));
        
        System.out.println("Version de Java: "+ System.getProperty(VersionJava));
        
        System.out.println("Directorio Home de Java: "+ System.getProperty(DirectorioJavaHome));
        
        System.out.println("Ruta de archivos java: "+ System.getProperty(RutaJava));
        
        System.out.println("Vendor de Java: "+ System.getProperty(JavaVendor));

        System.out.println("URL del vendor de Java: "+ System.getProperty(JavaVendorUrl));

    }

}
