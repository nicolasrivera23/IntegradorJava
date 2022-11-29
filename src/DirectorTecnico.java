public class DirectorTecnico extends Persona {
    
    public String plantearEsquema(int nroEsquema) {
        String esquema = "";

        if(nroEsquema == 1) {
            esquema = "Estas planteando un esquema táctico de 4-4-2";
        }
        if(nroEsquema == 2) {
            esquema = "Estas planteando un esquema táctico de 5-4-1";
        }
        return esquema;
    }

}
