public class ProductoEspesifico extends Producto {

    private String categoria;
    private String marca;

    public ProductoEspesifico(int id, String nombre, Double precio, String categoria, String marca) {
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ProductoEspesifico{" +
                "categoria='" + categoria + '\n' +
                ", marca='" + marca + '\n' +
                '}';
    }
}
