import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> listaProducto;

    public Inventario(){
        this.listaProducto = new ArrayList<>();

    }

    public Producto buscarPorNombre(String nombreBuscar){
        for(Producto objProducto : this.listaProducto){
            if(objProducto.getNombre().equalsIgnoreCase(nombreBuscar)){
                return objProducto;
            }
        }
        return null;
    }

    //Metodos
    public void agregarProducto(Producto producto){

        this.listaProducto.add(producto);
    }

    public boolean eliminarProducto(int id){
        return listaProducto.removeIf(producto -> producto.getId() == id);
    }

    public void listarProductos(){
        for (Producto producto : this.listaProducto){
            System.out.println("ID: "+ producto.getId() + "\n" + "Nombre: " + producto.getNombre() + "\n" + "Precio: " + producto.getPrecio() + "\n");
        }
    }
}
