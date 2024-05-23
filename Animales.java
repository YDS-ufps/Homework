/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;

public class Animales
{
    //Atributos
    private int id;
    private String nombre;
    private double peso;
    private String tipo;
    private Date nacimiento;

    
    public Animales(int id, String nombre, double peso, String tipo, Date nacimiento)
    {
        // initialise instance variables
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
        this.nacimiento = nacimiento;
        
    }
    
    //getters & setters
    public String getNombre(){
        return nombre;
    }
    
    public int getId(){
        return id;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public Date getNacimiento(){
        return nacimiento;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setNacimiento(Date nacimiento){
        this.nacimiento = nacimiento;
    }
    
    
    public int calcularEdad() {
        
        Date contadorDate = new Date();
        long diferenciaEnMillas = Math.abs(contadorDate.getTime() - nacimiento.getTime());
        long diferencia = diferenciaEnMillas / (24 * 60 * 60 * 1000);
        return (int) (diferencia / 365);
        
    }
    


}
