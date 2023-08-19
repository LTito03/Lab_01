/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona_01;

/**
 *
 * @author LOUISMAN
 */
public class Persona_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Jose";
        String apellido = "Perez";
        String dni = "00001111";
        
        Persona personita = new Persona(nombre, apellido, dni);
        personita.setEdad (17);
        
        String contenido = personita.getContenidoConsola();
        System.out.println(contenido);
        
    }
    
}
