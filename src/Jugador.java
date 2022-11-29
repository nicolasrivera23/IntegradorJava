public class Jugador extends Persona {

    private double cotizacionMercado = 0.0;

    public void setCotizacionMercado(double c) {
        this.cotizacionMercado = c;
    }

    public double getCotizacionMercado() {
        return this.cotizacionMercado;
    }

    public String toString() {
        return "Nombre Completo: " + getNombre() + " " + getApellido() + "\n" +
                "Sueldo: " + getSueldo() + "\n" +
                "Cotización en el mercado: " + getCotizacionMercado();
    }

}
