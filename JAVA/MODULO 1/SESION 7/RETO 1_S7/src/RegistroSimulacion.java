import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {

    public static void main(String[] args) {
        // Paso 2: Definir la ruta
        Path rutaCarpeta = Paths.get("src/Solucion_Reto_01/config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        // Paso 3: Crear un String con los parámetros
        String parametros = "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8\n";

        try {
            // Paso 4: Crear la carpeta
            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectory(rutaCarpeta);
                System.out.println(" Carpeta 'config' creada.");
            }

            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println(" Archivo de parámetros escrito correctamente.");

            // Paso 5: Validar
            if (Files.exists(rutaArchivo)) {
                System.out.println(" El archivo fue creado exitosamente en: " + rutaArchivo.toAbsolutePath());

                // Paso 6: Leer y mostar
                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println(" Contenido del archivo:");
                System.out.println(contenidoLeido);
            } else {
                System.out.println(" El archivo no fue creado.");
            }

        } catch (IOException e) {
            System.out.println(" Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}