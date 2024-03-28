package taller_simulador_tienda_en_linea;

import Comportamientos.NavegacionFiltroProductos;
import Comportamientos.NavegacionTodosLosProductos;
import abstracts.Navegacion;
import java.util.Scanner;

public class Inicio_tienda_en_linea {
    
    /*Proyecto 3: Simulador de Tienda en Línea
    Descripción:
    El proyecto de Simulador de Tienda en Línea es una aplicación de consola que simula una
    tienda en línea donde los usuarios pueden navegar por diferentes productos, agregar
    productos al carrito de compras y realizar pedidos. Los usuarios podrán ver detalles de los
    productos, como su nombre, descripción y precio, así como realizar búsquedas y filtrar
    productos por categoría.
    Reglas del Juego:
        • Los usuarios pueden navegar por diferentes productos disponibles en la tienda.
        • Los usuarios pueden ver detalles de un producto específico, como su nombre,
        descripción y precio.
        • Los usuarios pueden agregar productos al carrito de compras y especificar la
        cantidad deseada.
        • Los usuarios pueden ver el contenido actual de su carrito de compras, así como el
        precio total de los productos en él.
        • Los usuarios pueden realizar pedidos, completando la información de envío y pago.*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion_menu, cantidad_producto;
        String Seleccion_producto;

        Navegacion navegacionFiltroProductos = new Navegacion(new NavegacionFiltroProductos());
        Navegacion navegacionTodosLosProductos = new Navegacion(new NavegacionTodosLosProductos());
        Producto producto = new Producto();
        CarroCompras carrito = new CarroCompras();

        System.out.println("Bienvenido a la tienda en linea\n");
        producto.listaProductos(); // Inicializo los datos de los productos

        do {
            System.out.println("------------------\n"
                    + "| Menu Principal |\n"
                    + "------------------"
                    + "\nEscriba el número que corresponde de la opción a elegir: \n"
                    + "\n1. Para Navegar por los productos"
                    + "\n2. Para Filtrar producto"
                    + "\n3. Para Ver detalles"
                    + "\n4. Para Agregar productos al carrito"
                    + "\n5. Para Mostrar productos del carrito"
                    + "\n6. Para Pagar productos"
                    + "\n7. Para Salir");
            System.out.print("Opción: ");
            
            opcion_menu = entrada.nextInt();
            
            if (opcion_menu == 7) 
                break;

            switch (opcion_menu) {
                case 1: // Navegar por los productos
                    navegacionTodosLosProductos.navegacionTiendaEnLinea();
                    break;
                case 2: // Filtrar producto
                    navegacionFiltroProductos.navegacionTiendaEnLinea();
                    break;
                case 3: // Ver Detalles
                    System.out.println("\nIngrese el nombre del producto: ");
                    System.out.print("Producto: ");
                    Seleccion_producto = entrada.next();
                    producto.VerDetallesProducto(Seleccion_producto);
                    break;
                case 4: // Agregar productos al carrito
                    System.out.println("\nNombres productos Disponibles: \nIngrese uno de los nombres de producto que se le indican en esta lista\n");
                    producto.listaProductos.clear();
                    producto.listaProductos();
                    // Se listan los productos para tener una referencia.
                    for (Producto mostrarTodos : producto.listaProductos) {                      
                        System.out.print("|"+mostrarTodos.getNombre());
                    }
                    System.out.println("\n");
                    System.out.println("\nIngrese el nombre del producto: ");
                    System.out.print("Producto: ");
                    Seleccion_producto = entrada.next();

                    System.out.println("\nIngrese la cantidad del producto: ");
                    System.out.print("Cantidad: ");
                    cantidad_producto = entrada.nextInt();
                    carrito.AgregarProductosCarrito(Seleccion_producto, cantidad_producto);
                    break;
                case 5: // Mostrar productos carrito
                    carrito.MostrarProductosCarrito();
                    break;
                case 6: // Realizar pedido
                    carrito.RealizarPedido();
                    break;
                default:
                    System.out.println("\nError, seleccione los números del menu para acceder a las opciones.\n");
            }

        } while (true);

    }

}
