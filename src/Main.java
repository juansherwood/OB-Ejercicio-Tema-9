public class Main {
    public static void main(String[] args) {
        Cliente miCliente = new Cliente(25, "Juan", "103040", 10000);
        System.out.println("CLIENTE\nEdad: " + miCliente.getEdad() + "\nNombre: " + miCliente.getNombre() +
                "\nTeléfono: " + miCliente.getTelefono() + "\nCrédito: $" + miCliente.getCredito() + "\n");

        Trabajador miTrabajador = new Trabajador(37, "Andrés", "99900", 1200);
        System.out.println("TRABAJADOR\nEdad: " + miTrabajador.getEdad() + "\nNombre: " + miTrabajador.getNombre() +
                "\nTeléfono: " + miTrabajador.getTelefono() + "\nSalario: $" + miTrabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(){
    }
    public Persona(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public  Cliente(){}
    public Cliente(int edad, String nombre, String telefono, int credito){
        setEdad(edad);
        setNombre(nombre);
        setTelefono(telefono);
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
    public void setCredito(int credito){
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public Trabajador(){}
    public Trabajador(int edad, String nombre, String telefono, int salario) {
        setEdad(edad);
        setNombre(nombre);
        setTelefono(telefono);
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
