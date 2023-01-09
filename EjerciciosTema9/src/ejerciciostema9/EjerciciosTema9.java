/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciostema9;

/**
 *
 * @author Wilmer Alexander Varon Rodriguez
 */
public class EjerciciosTema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente myCliente = new Cliente();
        
        myCliente.setNombre("Wilmer Varon");
        myCliente.setEdad(34);
        myCliente.setTelefono(320123454);
        myCliente.setCredito("Consumo");
        
    System.out.println("El nombre es: "+ myCliente.getNombre()+" edad: "+myCliente.getEdad()+" Telefono: "+myCliente.getTelefono()+" El tipo de Credito es: "+myCliente.getCredito());
        
            Trabajador myEmpleado = new Trabajador();
        
        myEmpleado.setNombre("Peipito Perez");
        myEmpleado.setEdad(25);
        myEmpleado.setTelefono(320123454);
        myEmpleado.setSalario(1000000);
        
    System.out.println("El nombre es: "+ myEmpleado.getNombre()+" edad: "+myEmpleado.getEdad()+" Telefono: "+myEmpleado.getTelefono()+" El Salario es: "+myEmpleado.getSalario());
    }
    
}

class Persona{
private int edad;
private String nombre;
private int telefono;

    Persona() {   
    }

        public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
   } 
    class Cliente extends Persona{
        private String Credito;

        public String getCredito() {
            return Credito;
        }

        public void setCredito(String Credito) {
            this.Credito = Credito;
        }
        
        
    }
    class Trabajador extends Persona{
        private int Salario;

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
        

    }


