import java.util.Date;

/**
 * Write a description of class Gallina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gallina extends Animales
{
    //Atributos
    private String colorHuevos;

    public Gallina(int id, String nombre, double peso, Date nacimiento, String colorHuevos) {
        super(id, nombre, peso, "Gallina", nacimiento);
        this.colorHuevos = colorHuevos;
    }

    
    //getters & setters
    public String getColorHuevos(){
        return colorHuevos;
    }
    
    public void setColorHuevos(String colorHuevos){
        this.colorHuevos = colorHuevos;
    }
    
    //operational methods
    
}
