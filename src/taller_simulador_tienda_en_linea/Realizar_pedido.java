package taller_simulador_tienda_en_linea;

import java.util.Scanner;

public class Realizar_pedido {
    
    private String nombre;
    private String correo;
    private String direccion;
    private String celular;
    private String cuenta;
    private String cod_seguridad;
    
    public Realizar_pedido(){}

    Scanner entrada = new Scanner(System.in);
    
    public void RealizarNuevoPedido(){
        System.out.println("\nPorfavor llene el siguiente formulario:");
        System.out.println(".........................................");
        System.out.print("Ingrese su nombre completo: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese su correo electronico: ");
        correo = entrada.nextLine();
        System.out.print("Ingrese su direccion para la entrega del paquete: ");
        direccion = entrada.nextLine();
        System.out.print("Ingrese su numero de celular: ");
        celular = entrada.nextLine();
        System.out.print("Ingrese su numero de cuenta: ");
        cuenta = entrada.nextLine();
        System.out.print("Ingrese su numero de seguridad: ");
        cod_seguridad = entrada.nextLine();
        System.out.println("\n*****************\nCompra exitosa !!\n*****************\n");
        System.out.println("Gracias por comprar en su tienda en linea.");
    }
    
}
