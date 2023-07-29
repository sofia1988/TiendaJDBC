package tiendajdbc.servicio;

import tiendajdbc.Dominio.Producto;
import tiendajdbc.Persistencia.ProductoDao;

public class ServicioProducto {

    private ProductoDao dao;

    public ServicioProducto() {
        this.dao = new ProductoDao();
    }

    public void crearproducto(int codigo, String nombre) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            //Creamos el usuario
            Producto producto = new Producto();

            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(500);
            producto.setCodigoFabricante(2);

            dao.guardarProducto(producto);//daoproducto

        } catch (Exception e) {
            throw e;
        }
    }
}
