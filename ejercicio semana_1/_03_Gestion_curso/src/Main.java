import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Intancias
        Scanner  objScan = new Scanner(System.in);
        GestionCurso objGestion = new GestionCurso();

        int option = 0;

        do {
            System.out.println("""
                    MENU DE OPCIONES
                    1.  Administrar cursos.
                    2. Administrar estudiantes
                    3. Salir""");
            option= objScan.nextInt();

            switch (option){
                case 1:
                    int  option2 = 0;
                    do {
                        System.out.println("""
                            MENU DE CURSOS
                            1. Crear curso
                            2. Buscar curso por codigo
                            3. Listar cursos
                            4. Salir
                            """);
                        option2 = objScan.nextInt();
                        switch (option2){
                            case 1:
                                objGestion.guardarCurso(objScan);
                                break;
                            case 2:
                                System.out.println("Ingresa el codigo del curso. ");
                                String codigo = objScan.next();
                                System.out.println(objGestion.buscarPorCodigo(codigo).toString());
                        }


                    }while (option2 != 4);
                    break;
            }
        }while (option != 3);



    }

}