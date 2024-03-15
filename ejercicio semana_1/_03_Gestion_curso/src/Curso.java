import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> listaEStudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEStudiantes = new ArrayList<>();
    }

    private static int idEstudiante = 1;

    public void guardarEstudiante(Scanner objScan){
        System.out.println("agregar estudiante \n");
        System.out.println("ingresa el nombre del estudiante: ");
        String nombre = objScan.nextLine();

        System.out.println("ingresa el email del estudiante: ");
        String email = objScan.nextLine();

        Estudiante objEstudiante = new Estudiante(idEstudiante, nombre, email);
        idEstudiante++;

        if (listaEStudiantes.add(objEstudiante)){
            System.out.println("Estudiante agregado correctamente");

        }else {
            System.out.println("No se puedo agregarse correctamente");
        }

    }

    public void listarEstudiantes(){
        System.out.println("\n Lista de estudiante - "+this.nombre);

        if (this.listaEStudiantes.isEmpty()){
            System.out.println("El curso".concat(this.nombre).concat("No tiene estudiantes disponible"));
        }else {
            for (Estudiante estudianteTem : this.listaEStudiantes){
                System.out.println(estudianteTem.toString());
            }
        }
    }

    public void eliminarEstudiante(Scanner objScan){
        //LIstar
        this.listarEstudiantes();
        //Pedir el identificador
        System.out.println("Ingrese el id edel estudiante");
        int idEliminar = objScan.nextInt();

        //Eliminar
        if (this.listaEStudiantes.removeIf(estudiante -> estudiante.getId() == idEliminar)){
            System.out.println("Estudiante eliminado");
        }else {
            System.out.println("No existe");
        }
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEStudiantes() {
        return listaEStudiantes;
    }

    public void setListaEStudiantes(ArrayList<Estudiante> listaEStudiantes) {
        this.listaEStudiantes = listaEStudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\n' +
                ", nombre='" + nombre + '\n' +
                '}';
    }
}
