import java.util.concurrent.Callable;

public class SistemaNavegacion implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1200); // Simula procesamiento
        return "🛰️ Navegación: trayectoria corregida con éxito.";
    }
}