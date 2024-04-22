public class Television extends Electrodomestico{

    private int canal;
    private int volumen;
    private boolean subtitulos;

    public Television(){
        super(true);
        this.canal = 1;
        this.volumen = 30;
        this.subtitulos = false;
    }

    public void cambiarCanal(int nuevoCanal) {
        canal = nuevoCanal;
        System.out.printf("El nuevo canal es: %d", canal);
    }

    public void cambiarVolumen(int nuevoVolumen) {
        volumen = nuevoVolumen;
        System.out.printf("El nuevo volumen es: %d", volumen);
    }

    public String EncenderSubtitulo() {
        subtitulos = true;
        String estadoSub = "encendido";
        return estadoSub;
    }

    public String obtenerEstado() {

        return "Television " +(this.isEncendido() ? "encendido" : "apagado") +
                ", Canal: " + canal + ", Volumen: " + volumen + ", Subtitulos: "+
                (subtitulos? "encendido" : "apagado");
    }

}
