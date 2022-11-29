public class Persona {

    private String nombre;
    private String apellido;
    private double sueldo;
    private Domicilio domicilio;

    public Persona() {}

    public Persona(String n, String a, double s) {
        this.nombre = n;
        this.apellido = a;
        this.sueldo = s;
    }

    //Método setter para nombre
    public void setNombre(String n) {
        this.nombre = n;
    }

    //Método getter para nombre
    public String getNombre() {
        return this.nombre;
    }

    //Método setter para apellido
    public void setApellido(String a) {
        this.apellido = a;
    }

    //Método getter para apellido
    public String getApellido() {
        return this.apellido;
    }

    public void setSueldo(double s) {
        this.sueldo = s;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String toString() {
        return "Nombre Completo: " + getNombre() + " " + getApellido() + "\n" +
               "Sueldo: " + getSueldo();
    }
}
