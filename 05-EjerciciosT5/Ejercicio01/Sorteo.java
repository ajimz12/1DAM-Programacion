
package tema5.ejercicio01;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
public class Sorteo {
    
    //PROPIEDADES
    
    private double dineroCupon;
    private int pagosRealizados;
    private int pagosPendientes;
    private int totalParticipantes;
    private double dineroRecogido;
    
    /**
     * Constructor con par�metros
     * 
     * @param dineroCupon El valor del cup�n 
     * @param totalPersonas El total de participantes del sorteo
     */
    
    public Sorteo(double dineroCupon,int totalPersonas){
        
         this.totalParticipantes = totalPersonas;
         this.pagosPendientes = this.totalParticipantes;
         this.dineroCupon = dineroCupon;
         
                 
    }
    
    /**
     * Se registra el pago de uno de los participantes
     * Se suma el dinero de un cupon al total de dinero recogido
     * Se suman los pagos realizados y se restan los pendientes
     * 
     */
   
    public void registrarPago(){
        
        this.pagosRealizados++;
        this.pagosPendientes--;
        
        this.dineroRecogido+=this.dineroCupon;
                        
        
    }
    
    /**
     * Se apunta a un nuevo participante
     * Se a�ade uno a pagos pendientes
     * 
     */
    
    public void apuntarNuevoParticipante(){
        
        this.totalParticipantes++;
        this.pagosPendientes++;
        
    }
    
    /**
     * Se a�ade o cambia el valor del cup�n
     * 
     * @param dineroCupon Valor del cup�n
     */
    
    public void setDineroCupon(double dineroCupon){
        
    }
    

    /**
     * Se obtiene el valor del cup�n
     * 
     * @return Valor del cup�n
     */
    
    public double getDineroCupon(){
        
        return this.dineroCupon;
    }
    
    /**
     * Se obtiene el total de participantes
     * 
     * @return El total de participantes
     */
    
    public int getTotalParticipantes(){
        
        return this.totalParticipantes;
    }
    
    /**
     * Se obtiene el total de pagos pendientes
     * 
     * @return Total de pagos pendientes
     */
    
    public int getPendientes(){
        
        return this.pagosPendientes;
    }
    
    /**
     * Se obtiene el total de pagos realizados
     * 
     * @return Total de pagos realizados
     */
    
    public int getRealizados(){
        
        return this.pagosRealizados;

    }
    
    /**
     * Obtiene el total del dinero recogido
     * 
     * @return Total de dinero recogido
     */
    
    public double getDineroRecogido(){
        
        return this.dineroRecogido;
    }
    
    /**
     * Muestra informaci�n general del sorteo
     * 
     * @return Cadena de caracteres con info del sorteo
     */
    
    @Override
    public String toString(){
        
        String aux;
        
        aux = "Participantes totales: " + this.totalParticipantes + 
                "| Pagos realizados:  " + this.pagosRealizados + " | Pagos pendientes: "
                + "" + this.pagosPendientes + " | Valor cup�n: " + this.dineroCupon +
                "| Dinero recogido: " + this.dineroRecogido;
        
        return aux;
        
    }
    
}
