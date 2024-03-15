public class Main {
    public static void main(String[] args) {

        GestionEmpleado gestionEmpleado = new GestionEmpleado();

        Empleado empleado1 = new EmpleadoPermanente("juan", 30, 1, 3000, 5);
        Empleado empleado2 = new EmpleadoTemporal("maria", 25, 2, 2500, "31/12/2024");

        gestionEmpleado.agregarEmpleado(empleado1);
        gestionEmpleado.agregarEmpleado(empleado2);

        gestionEmpleado.mostrarEmpleados();

        gestionEmpleado.eliminarEmpleado(1);

        System.out.println("\nDespues de eliminar: ");
        gestionEmpleado.mostrarEmpleados();
    }
}