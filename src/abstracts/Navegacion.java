package abstracts;

import interfaces.ComportamientoNavegacion;

public class Navegacion {
    
    private ComportamientoNavegacion navegacion;
    
    public Navegacion(ComportamientoNavegacion navegacion){
        this.navegacion = navegacion;
    }
    
    public void navegacionTiendaEnLinea(){
        this.navegacion.navegacionTiendaEnLinea();
    }
}
