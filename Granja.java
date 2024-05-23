
/**
 * Write a description of class CopyOfCliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Granja{
    //Atributos
    public List<Animales> animales;

    public Granja() {
        this.animales = new ArrayList<>();
    }

    public void addAnimal(Animales animal) {
        animales.add(animal);
    }

    //getters & setters
    public List getAnimales(){
        return animales;
    }
    
    public void setAnimales(List animales){
        this.animales = new ArrayList<>();
    }
    

    //operational methods
    public int calcularEdad(Animales animal) {
        // Calcular la edad según la fecha de nacimiento.
        Date actualDate = new Date();
        long diferenciaEnMillas = Math.abs(actualDate.getTime() - animal.getNacimiento().getTime());
        long diferencia = diferenciaEnMillas / (24 * 60 * 60 * 1000);
        return (int) (diferencia / 365);
    }

    public int contarAnimalesPorTipo(String tipo) {
        int contador = 0;
        for (Animales animal : animales) {
            if (animal.getTipo().equalsIgnoreCase(tipo)) {
                contador++;
            }
        }
        return contador;
    }
    
    public void registrarCliente(){
        System.out.println("El animales del usuario es: " + getAnimales());
    }
    public void agregarAnimal(){
        
    }
}

