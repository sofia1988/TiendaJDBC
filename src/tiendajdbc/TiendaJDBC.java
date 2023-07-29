package tiendajdbc;

import tiendajdbc.servicio.ServicioProducto;

public class TiendaJDBC {

    public static void main(String[] args) {
        ServicioProducto servicioProducto = new ServicioProducto();
        try {

            servicioProducto.crearproducto(15, "pepito");

        } catch (Exception e) {
            System.out.println("Error en el main \n" + e.getMessage());
                 e.printStackTrace();
        }

    }
}
