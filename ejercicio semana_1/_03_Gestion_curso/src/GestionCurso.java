import java.util.ArrayList;
import java.util.Scanner;

public class GestionCurso {

    private ArrayList<Curso> listaCurso;

    public GestionCurso() {
        this.listaCurso = new ArrayList<>();
    }

    public void guardarCurso(Scanner objScan) {
        System.out.println("Agregar curso");


        System.out.println("Ingresa el nombre del curso: ");
        String nombre = objScan.next();

        System.out.println("Ingresa el codigo del curso: ");
        String codigo = objScan.next();

        if (this.buscarPorCodigo(codigo) != null) {
            System.out.println("El codigo ya existe");
        } else {
            //Creamos el curso
            Curso objCurso = new Curso(codigo,nombre);
            this.listaCurso.add(objCurso);
        }
    }

    public Curso buscarPorCodigo(String codigoBuscar) {
        for (Curso cursoTemp : this.listaCurso) {
            if (cursoTemp.getCodigo().equalsIgnoreCase(codigoBuscar)) {
                return cursoTemp;
            }
        }
        return null;
    }


    public ArrayList<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(ArrayList<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }


}

