
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    //Atributos
    private String nombre;
    private String direccion;
    private String email;
    private int telefono;
    private int identificacion;

    public Cliente(String nombre, String direccion,int telefono, String email)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.identificacion = identificacion;
    }

    //getters & setters
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public int getIdentificacion(){
        return identificacion;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setIdentificacion(int identificacion){
        this.identificacion = identificacion;
    }
    
    //operational methods
    public void registrarCliente(){
        System.out.println("El nombre del usuario es: " + getNombre());
        System.out.println("La direccion del usuario es: " + getDireccion());
        System.out.println("El email del usuario es: " + getEmail());
        System.out.println("El telefono del usuario es: " + getTelefono());
        System.out.println("La identificacion del usuario es: " + getIdentificacion());
    }
    
    public void validarInformacion(){
        
    }
    
    public void generarNumeroCliente(){
        
    }
    
}
