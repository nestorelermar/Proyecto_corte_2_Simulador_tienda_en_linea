package Comportamientos;

import interfaces.ComportamientoNavegacion;
import java.util.Scanner;
import taller_simulador_tienda_en_linea.Producto;

public class NavegacionFiltroProductos implements ComportamientoNavegacion {

    String Seleccion_producto;
    Scanner entrada = new Scanner(System.in);

    @Override
    public void navegacionTiendaEnLinea() {

        Producto producto = new Producto();
        boolean verificar = false;
        System.out.print("\nIngrese el nombre del producto: ");
        Seleccion_producto = entrada.next();
        
        for (Producto mostrarTodos : producto.listaProductos()) {           
            if (mostrarTodos.getNombre().equalsIgnoreCase(Seleccion_producto)) {  
                System.out.println("..............................");
                System.out.println("Nombre producto: " + mostrarTodos.getNombre());
                System.out.println("..............................\n");
                verificar = true;
            }
            
        }
        
        if(verificar != false){
            System.out.println("----------------------------------");
            System.out.println("Producto encontrado exitosamente!!");
            System.out.println("----------------------------------\n");
        } else {
            System.out.println("----------------------------");
            System.out.println("No se encontro el producto!!");
            System.out.println("----------------------------\n");
        }
        

    }

}
