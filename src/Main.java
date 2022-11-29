public class Main {

    public static void main(String[] args) {
     
        Persona personaUno = new Persona();
        personaUno.setNombre("Juan");

        Persona personaDos = new Persona("Nicolás", "Otamendi", 10000);

        Jugador jugadorUno = new Jugador();
        jugadorUno.setNombre("Julián");
        jugadorUno.setApellido("Alvarez");
        jugadorUno.setSueldo(20000);
        jugadorUno.setCotizacionMercado(200000);

        DirectorTecnico dt = new DirectorTecnico();
        Domicilio dom = new Domicilio();
        dom.setCalle("Av Falsa");
        dom.setNro("1234");
        dom.setLocalidad("Springfield");

        dt.setDomicilio(dom);


        //System.out.println(personaUno);
        //System.out.println(personaDos);
        System.out.println(dt.getDomicilio());
        
    }

}