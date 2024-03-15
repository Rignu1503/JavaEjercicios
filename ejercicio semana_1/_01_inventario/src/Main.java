public class Main {
    public static void main(String[] args) {

    Inventario objInventario = new Inventario();

    Producto pro1 = new Producto(1 ,"laipz", 200.0);
    Producto pro2 = new Producto(2, "Su Mama", 100.0);


    objInventario.agregarProducto(pro1);
    objInventario.agregarProducto(pro2);

        System.out.println("LIsta de producto");
        objInventario.listarProductos();

        //objInventario.eliminarProducto(1);
        System.out.println("Despues de eliminar");
        objInventario.listarProductos();

        System.out.println(objInventario.buscarPorNombre("Su mama"));


    }
}