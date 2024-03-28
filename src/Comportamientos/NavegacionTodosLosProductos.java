package Comportamientos;

import interfaces.ComportamientoNavegacion;
import taller_simulador_tienda_en_linea.Producto;

public class NavegacionTodosLosProductos implements ComportamientoNavegacion {

    Producto producto = new Producto();
    
    @Override
    public void navegacionTiendaEnLinea() {       
        System.out.println("\nProductos disponibles: \n");
        System.out.println("Productos");
        producto.listaProductos().clear();
        int contador = 1;
        for(Producto mostrarTodos : producto.listaProductos()){
            //System.out.println("|------------------------|");
            System.out.println(contador+". "+mostrarTodos.getNombre());       
            contador++;
        }
        System.out.println("\n");
    }
    
}
