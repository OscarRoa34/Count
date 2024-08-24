public class App {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        run();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("\nTiempo de ejecución: " + duration + " nanosegundos");
        System.out.println("Tiempo de ejecución: " + duration / 1_000_000.0 + " milisegundos");
        System.out.println("Tiempo de ejecución: " + duration / 1_000_000_000.0 + " segundos");
    }

    public static void run() {
        StringBuilder datos = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            datos.append(i);
        }
        System.out.println(datos);
    }
}