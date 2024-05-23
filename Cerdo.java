import java.util.Date;

/**
 * Write a description of class Cerdo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cerdo extends Animales
{
    //Atributos
    private String calidadDeLaCarne;
    
    public Cerdo(int id, String nombre, double peso, Date nacimiento, String calidadDeLaCarne) {
        super(id, nombre, peso, "Cerdo", nacimiento);
        this.calidadDeLaCarne = calidadDeLaCarne;
    }
    
    
    //getters & setters
    public String getCalidadDeLaCarne(){
        return calidadDeLaCarne;
    }
    
    public void setCalidadDeLaCarne(String calidadDeLaCarne){
        this.calidadDeLaCarne = calidadDeLaCarne;
    }
    
    
    //operational methods
    public void obtenerCalidadCarne(){}
    
}
