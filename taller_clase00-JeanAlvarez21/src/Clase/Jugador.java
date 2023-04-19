
package Clase;

public class Jugador {
    private int cedula;
    private String nombre, apellido;
    private byte edad;
    
    public Jugador() {
        this.cedula = 33016244;
        this.nombre = "Lionel";
        this.apellido = "Messi";
        this.edad = 35;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }    
    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public byte getEdad() {
        return edad;
    }

    
    public void info(){
        System.out.println("C.I: " + cedula);
        System.out.println("Nombre:  " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad +" años \n");
    }
    
    public void caminar(){
        System.out.println(nombre + " " + apellido + " suele salir a caminar.");
    }
    
    public void correr(){
        System.out.println(nombre + " " + apellido + " suele correr mucho en la cancha.");
    }
    
    public void viajar(){
        System.out.println(nombre + " " + apellido + " suele viajar con su familia.");
    }
}    

    
    
 