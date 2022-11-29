public class Domicilio {

    private String calle = "";
    private String nro = "";
    private String localidad = "";


    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNro() {
        return nro;
    }
    public void setNro(String nro) {
        this.nro = nro;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String toString() {
        return "Domicilio: " + getCalle() + " " + getNro() + "\n" +
        "Localidad: " + getLocalidad();
    }
    
}
