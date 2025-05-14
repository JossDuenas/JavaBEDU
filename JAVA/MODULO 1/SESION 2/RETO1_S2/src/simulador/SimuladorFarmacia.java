import java.util.Scanner;
public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // lector de entradas
        //datos
        System.out.print("Nombre del medicamento: ");
        String nombredelmedicamento = sc.nextLine(); //lee el texto
        System.out.print("Precio Unitario: ");
        double precioUnitario = sc.nextDouble(); //double es para leer decimal
        System.out.print("Cantidad de piezas a comprar: ");
        int cantidad = sc.nextInt(); //int es para leer enteros
        // calcular total
        double totalsdesc = precioUnitario * cantidad;
        //revisar si aplica desc
        boolean ADesc = totalsdesc > 500;
        double Desc = ADesc ? totalsdesc * 0.15 : 0;
        // calcular con descuento
        double TPagar = totalsdesc - Desc;
        // Mostrar Información
        System.out.println("Resumen de Compra: ");
        System.out.println("Medicamento:" + nombredelmedicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: " + precioUnitario);
        System.out.println("Total sin descuento: " + totalsdesc);
        System.out.println("¿Aplica descuento:? " + ADesc);
        System.out.println("Descuento: $ " + Desc);
        System.out.println("Total a Pagar: " + TPagar);

    }
}