//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        //crear un objeto
    Scanner scanner = new Scanner(System.in);
        //Asignar saldo inicial
        var saldo = 2000.0;
        // variable para menú
        int opcion;
        // repetir hasta que sea salida
        do{
            //menú
            System.out.println("CAJERO AUTOMATICO");
            System.out.println("1. MOSTRAR SALDO");
            System.out.println("2. DEPOSITAR");
            System.out.println("3. RETIRAR");
            System.out.println("4. SALIR");
            System.out.println("SELECCIONE UNA OPCIÓN");

            // leer la op
            opcion = scanner.nextInt();
            //switch para menú
            switch (opcion){
                case  1: {
                    // saldo
                    System.out.println("TU SALDO ACTUAL ES: $" + saldo);
                }
                case 2: {
                    // depositar
                    System.out.print("INGRESA EL MONTO A DEPOSITAR: ");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0){
                        //Validación: monto > 0
                        System.out.println("EL MONTO DEBE SER MAYOR A 0");
                       // regresar al menú
                        continue;
                    }
                    //aumentar el saldo
                    saldo += deposito;
                    System.out.println("DEPOSITO REALIZADO. SALDO ACTUALIZADO: $" + saldo);
                }
                case 3: {
                    //retirar dinero
                    System.out.print("INGRESAR EL MONTO A RETIRAR: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= 0){
                        //Validación: monto > 0
                        System.out.println("EL MONTO DEBE SER MAYOR A 0");
                        // regresar al menú
                        continue;
                    }
                    if (retiro > saldo){
                        System.out.println("SALDO INSUFICIENTE. SU SALDO ES $" + saldo);

                    }   else {
                        //restar el monto del saldo
                        saldo -= retiro;
                        System.out.println("RETIRO EXITOSO. SALDO RESTANTE: $" + saldo);
                    }

                }
                case 4: {
                    // salir del programa
                    System.out.println("GRACIAS POR VISITARNOS. ¡VUELVA PRONTO!");
                }
                default: {
                    // opc no valida
                    System.out.println("OPCIÓN INVALIDA. INTENTA NUEVAMENTE. ");
                }
            }
        } while (opcion != 4);
       //Cerrar el scanner
        scanner.close();
    }
}