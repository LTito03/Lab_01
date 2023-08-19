/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona_01;

/**
 *
 * @author LOUISMAN
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    
    public Persona(String nombre, String apellido, String dni)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;       
    }
    //Constructor
    public Persona (String nombre)
    {
        this.nombre = nombre;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
     public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }
    public void setApellido (String apellido)
    {
        this.apellido = apellido;
    }
    public void setDNI (String dni)
    {
        this.dni = dni;
    }
    public String getNombre()
    {
        if(this.nombre == null)
            return"SIN NOMBRE";
        return this.nombre;
    }
    public String getApellido()
    {
        if(this.apellido == null)
            return "SIN APELLIDO";
        return this.apellido;
    }
    public String getDNI()
    {
        if(this.dni == null)
            return "SIN DNI";
        return this.dni;
    }
    public int getEdad()
    {
        return this.edad;
    }
    //Mostrar datos
    public String getContenidoConsola(){
       return""
       + "El nombre es: " + this.getNombre()
       +"\nEl apellido es:"+ this.getApellido()
       +"\nEl DNI es: "+ this.getDNI()
       +"\nLa edad es: "+ this.getEdad();
    }   
}
