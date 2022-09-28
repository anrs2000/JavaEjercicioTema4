package EjerciciosCursoJava;

public class EjercicioTema4 {
    public static void main(String[] args) {

        class SmartDevice {
            String conexion;
            int bateria;
            int almacenamiento;
            public void pantallaTactil() {}

            public SmartDevice() {}

            public SmartDevice(String conexion, int bateria, int almacenamiento) {
                this.conexion = conexion;
                this.bateria = bateria;
                this.almacenamiento = almacenamiento;
            }
        }

        class SmartPhone extends SmartDevice {
            public void llamar() {}
            public void enviarMensajes() {}
            public void descargarApps() {}
            public void escucharMusica() {}
            String color;

            public SmartPhone() {}

            public SmartPhone(String conexion, int bateria, int almacenamiento, String color) {
                super(conexion, bateria, almacenamiento);
                this.color = color;
            }
        }

        class SmartWatch extends SmartDevice {
            public void contarPasos() {}
            public void frecuenciaCardiaca() {}
            public void alarma() {}
            public void medirEntrenamiento() {}
            String colorCorrea;


            public SmartWatch() {}

            public SmartWatch(String conexion, int bateria, int almacenamiento, String colorCorrea) {
                super(conexion, bateria, almacenamiento);
                this.colorCorrea = colorCorrea;
            }
        }

        SmartPhone onePlus = new SmartPhone("WiFi y bluetooth", 5000, 60, "blanco o negro");
        System.out.println("Las caracteristicas del onePlus son" + " una conexion " + onePlus.conexion + ", una bateria de " + onePlus.bateria + " mA, " + "una capacidad de almacenamiento de " + onePlus.almacenamiento + " GB y lo tenemos en los colores " + onePlus.color);


        SmartWatch galaxyWatch = new SmartWatch("bluetooth", 900, 10, "azul");
        System.out.println("Las caracteristicas del galaxyWatch son" + " una conexion " + galaxyWatch.conexion + ", una bateria de " + galaxyWatch.bateria + " mA, " + "una capacidad de almacenamiento de " + galaxyWatch.almacenamiento + " GB y una correa de color " + galaxyWatch.colorCorrea);


    }
}