package taller_simulador_tienda_en_linea;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    private String nombre;
    private String descripcion;
    private int precio;
    private int cantidad;

    List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> listaProductos() {
        listaProductos.add(new Producto("Camisa", "Camisa manga larga", 10000));
        listaProductos.add(new Producto("Chaqueta", "Chaqueta manga larga", 35000));
        listaProductos.add(new Producto("Pantalon", "Pantalon colegio", 22000));
        listaProductos.add(new Producto("Zapatos", "Zapatos elegantes", 30000));
        listaProductos.add(new Producto("Blusa", "Blusa manga corta", 12000));
        listaProductos.add(new Producto("Pantaloneta", "Pantaloneta deportiva", 15000));
        listaProductos.add(new Producto("Pijama", "Pijama acolchada", 33000));
        listaProductos.add(new Producto("Calcetines", "Conjunto de calcetines x 12", 18000));
        listaProductos.add(new Producto("Jeans", "Jeans ajustados", 20000));
        listaProductos.add(new Producto("Blusa", "Blusa manga corta", 15000));

        return listaProductos;
    }

    public Producto(String nombre, String descripcion, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto(String nombre, String descripcion, int precio, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDetalles() {
        return "Nombre: " + nombre + "\nDescripción: " + descripcion + "\nPrecio: $" + precio;
    }

    public void VerDetallesProducto(String Seleccion_producto) {

        boolean verificar = false;

        for (Producto filtro : listaProductos()) {
            if (filtro.getNombre().equalsIgnoreCase(Seleccion_producto)) {
                /*System.out.println("\nDetalles del producto:\n"
                        + ".......................................\n"
                        + "Nombre: " + filtro.getNombre() + "\n"
                        + "Descripción: " + filtro.getDescripcion() + "\n"
                        + "Precio: $" + filtro.getPrecio()
                        + "\n......................................." + "\n");*/
                System.out.println("\nDetalles del producto\n"
                    + "............................................................\n"
                    + "|Nombre            |"+"Descripción                   |"+"Precio  |"
                    + "\n------------------------------------------------------------"
                    +"\n|"+filtro.getNombre()+"            |"+filtro.getDescripcion()+"              |$"+filtro.getPrecio()+" |\n");
                verificar = true;
                break;
            }
        }

        if (verificar == false) {
            System.out.println("......................................................................");
            System.out.println("No se encontró el Producto, Por favor ingrese un producto valido!!");
            System.out.println("..................................................................\n");
        }
    }
}
