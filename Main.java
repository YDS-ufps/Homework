
/**
 * Write a description of class a here.
 * 
 * @author (your nombre) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una granja
        Granja g = new Granja();

        // Agregar algunos animales
        g.addAnimal(new Gallina(1, "Gallina 1", 2.5, new Date(), "Blanca"));
        g.addAnimal(new Gallina(2, "Gallina 2", 2.7, new Date(), "Marrón"));
        

        // Calcular la edad de un animal
        Animales animal = g.animales.get(0);
        int edad = g.calcularEdad(animal);
        System.out.println("La edad de " + animal.getNombre() + " es: " + edad + " años.");

        // Contar animales por tipo
        System.out.println("Cantidad de Gallinas: " + g.contarAnimalesPorTipo("Gallina"));
        System.out.println("Cantidad de Vacas: " + g.contarAnimalesPorTipo("Vaca"));
        System.out.println("Cantidad de Cerdos: " + g.contarAnimalesPorTipo("Cerdo"));
    }
}
