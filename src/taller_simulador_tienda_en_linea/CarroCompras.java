package taller_simulador_tienda_en_linea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarroCompras extends Producto {

    private int cantidad;
    private int precio_total_por_producto = 0;
    private int precio_total;

    public CarroCompras(String nombre, String descripcion, int precio, int cantidad) {
        super(nombre, descripcion, precio);
        this.cantidad = cantidad;
    }

    public CarroCompras() {
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_total_por_producto() {
        return precio_total_por_producto;
    }

    public void setPrecio_total_por_producto(int precio_total_por_producto) {
        this.precio_total_por_producto = precio_total_por_producto;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }

    List<CarroCompras> carritoCompras = new ArrayList<>();

    public void AgregarProductosCarrito(String Seleccion_producto, int cantidad_producto) {

        boolean verificar = false;

        for (Producto producto : listaProductos()) {
            if (producto.getNombre().equalsIgnoreCase(Seleccion_producto)) {
                producto.setCantidad(cantidad_producto);
                carritoCompras.add(new CarroCompras(producto.getNombre(), producto.getDescripcion(), producto.getPrecio(), cantidad_producto));
                verificar = true;
                break;
            }
        }

        //Condicion para mandar mensajes informativos
        if (verificar == true) {
            System.out.println("................................");
            System.out.println("Producto Agregado exitosamente!!");
            System.out.println("................................\n");
            RealizarPedido();
            System.out.println("\n");

        } else {
            System.out.println("....................................................................");
            System.out.println("No se encontró el Producto, Por favor ingrese un producto valido!!");
            System.out.println("....................................................................\n");
        }
    }

    public void RealizarPedido() {
        Realizar_pedido realizar_pedido = new Realizar_pedido();
        Scanner entrada = new Scanner(System.in);

        if (carritoCompras.isEmpty()) {
            System.out.println("\nNo hay productos por pagar, seleccione algunos productos en el carrito.\n");
        } else {
            System.out.println("\nSeleccione:\n1. Pagar los productos del carrito\n2. Seguir escogiendo productos");
            System.out.print("Opción: ");

            int opcion = entrada.nextInt();
            
            if (opcion == 1) {
                realizar_pedido.RealizarNuevoPedido();
                carritoCompras.clear();
            }
        }

    }

    public int Suma_precio_total_por_producto(Producto producto) {
        return producto.getCantidad() * producto.getPrecio();
    }

    public void MostrarProductosCarrito() {
        if (carritoCompras.isEmpty()) {
            System.out.println("\nEl carrito está vacío.\n");
        } else {
            int acumular_suma_total = 0, precio_total_por_producto;

            System.out.println("\nCarrito de compras:");
            for (Producto producto : carritoCompras) {
                precio_total_por_producto = Suma_precio_total_por_producto(producto);
                System.out.println(".........................................\n"
                        + "Nombre: " + producto.getNombre() + "\n"
                        + "Descripción: " + producto.getDescripcion()
                        + "\nPrecio: $" + producto.getPrecio()
                        + "\nCantidad: " + producto.getCantidad()
                        + "\nPrecio Total por producto: $" + precio_total_por_producto
                        + "\n.........................................\n");
                acumular_suma_total = acumular_suma_total + precio_total_por_producto;
            }
            System.out.println("*************************************************"
                    + "\nPrecio Total del Carrito: $" + acumular_suma_total
                    + "\n*************************************************\n");
        }
    }

}
