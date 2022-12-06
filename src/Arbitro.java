public class Arbitro extends Persona {

    private int edad;

    //setter
    public void setEdad(int e){
        this.edad = e;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return "Arbitro [edad=" + edad + ", nombre=" + this.getNombre() + "]";
    }

}
