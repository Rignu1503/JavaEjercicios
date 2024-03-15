public class Estudiante {

    private int id;
    private String nombre;
    private String email;

    public Estudiante(int id, java.lang.String nombre, java.lang.String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    @Override
    public java.lang.String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", email=" + email +
                '}';
    }
}
