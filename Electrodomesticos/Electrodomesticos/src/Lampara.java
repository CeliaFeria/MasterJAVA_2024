
// Definición de la clase Lámpara
// extends para decir que son clases hijas y heredan de Electrodomestico
    public class Lampara extends Electrodomestico{
        // Atributos de la clase

        private int intensidad;    // Nivel de intensidad de la luz de la lámpara
        private String color;      // Color de la luz emitida por la lámpara

        // Constructor de la clase Lampara
        public Lampara() {
            // Inicializa la lámpara apagada, con intensidad media (50) y luz blanca
            super(true);//super sirve para referenciar a la clase padre
            this.intensidad = 50;
            this.color = "blanca";
        }

        // Método para cambiar la intensidad de la luz
        public void cambiarIntensidad(int nuevaIntensidad) {
            if (nuevaIntensidad >= 0 && nuevaIntensidad <= 100) {
                intensidad = nuevaIntensidad;
                System.out.println("Nueva intensidad ajustada a " + intensidad + ".");
            } else {
                System.out.println("Intensidad inválida. Debe estar entre 0 y 100.");
            }
        }

        // Método para cambiar el color de la luz
        public void cambiarColor(String nuevoColor) {
            color = nuevoColor;
            System.out.println("Color de la lámpara cambiado a " + color + ".");
        }

        // Método para obtener el estado actual de la lámpara
        public String obtenerEstado() {
            return "Lámpara " +(this.isEncendido() ? "encendida" : "apagada") +
                    ", Intensidad: " + intensidad + ", Color: " + color;
        }

    }

