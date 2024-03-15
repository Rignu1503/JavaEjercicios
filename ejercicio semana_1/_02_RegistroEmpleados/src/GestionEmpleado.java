import java.util.ArrayList;

public class GestionEmpleado {

    private ArrayList <Empleado> empleados;

    public  GestionEmpleado(){
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public boolean eliminarEmpleado(int idEmpleado){
        return empleados.removeIf(emp -> emp.getIdEmpleado() == idEmpleado);
    }

    public void mostrarEmpleados(){
        for (Empleado emp : empleados){
            System.out.println("ID empelado: " + emp.getIdEmpleado() + ", Nombre: " + emp.getNombre() + ", Salario:" + emp.getSalario());
        }
    }
}
