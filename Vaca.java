import java.util.Date;

/**
 * Write a description of class Vaca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vaca extends Animales
{
    //Atributos
    public int produccionLeche;
    
    public Vaca(int id, String nombre, double peso, Date nacimiento, int produccionLeche) {
        super(id, nombre, peso, "Vaca", nacimiento);
        this.produccionLeche = produccionLeche;
    }

    
    //getters & setters
    public int getProduccionLeche(){
        return produccionLeche;
    }
    
    public void setProduccionLeche(int produccionLeche){
        this.produccionLeche = produccionLeche;
    }
    
    
}
