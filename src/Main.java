import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        ArrayList<Clase> listaClases = new ArrayList<>();
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        while (true) {
            System.out.flush();
            /*Menú*/
            System.out.println("== Gestión de Alumnado ==");
            System.out.println("\n1-Crear alumno");
            System.out.println("\n2-Crear clase");
            System.out.println("\n3-Modificar alumno");
            System.out.println("\n4-Modificar clase");
            System.out.println("\n\n5-Salir");

            System.out.println("\nSelecciona una opción: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    creacionAlumno(sc, listaAlumnos, listaClases);
                    break;
                case 2:
                    creacionClase(sc, listaClases);
                    break;
                case 3:
                    modificarAlumno(sc, listaAlumnos, listaClases);
                    break;
                case 4:
                    modificarClase(sc, listaClases);
                    break;
                case 5:
                    System.exit(0); // Salida del programa
                default:
                    System.out.println("Has especificado una opción inválida!");
            }
        }
    }

    public static void creacionAlumno(Scanner sc, ArrayList<Alumno> listaAlumnos, ArrayList<Clase> listaClases) {
        System.out.flush();
        System.out.println("=== Creación de alumno ===");
        System.out.println("\n¿Cuantos alumnos quieres crear?: ");
        int numeroAlumnos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("Introduce el nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Introduce los apellidos: ");
            String apellidos = sc.nextLine();

            System.out.println("Introduce la edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Introduce el dni: ");
            String dni = sc.nextLine();

            int contador = -1;
            System.out.println(" || Clases ||");
            for (Clase c : listaClases) {
                contador++;
                System.out.println("Indice: " + contador + " Curso: " + c.curso);
            }
            System.out.println("Selecciona el curso: ");
            int curso = sc.nextInt();
            sc.nextLine();

            Alumno nuevoAlumno = new Alumno(nombre, apellidos, edad, dni, listaClases.get(curso));
            System.out.println(nuevoAlumno);
            System.out.println("¿Quieres crear el alumno? [S/N]: ");
            String opcion = sc.nextLine();
            switch (opcion.toLowerCase()) {
                case "s":
                    listaAlumnos.add(nuevoAlumno);
                    System.out.println("Alumno " + nuevoAlumno.nombre + " creado con éxito!");
                    break;
                case "n":
                    break;
            }
        }
    }

    public static void creacionClase(Scanner sc, ArrayList<Clase> listaClases) {
        System.out.flush();
        System.out.println("=== Creación de clases ===");
        System.out.println("\n¿Cuantos clases quieres crear?: ");
        int numeroClases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numeroClases; i++) {
            System.out.println("Introduce curso: ");
            String curso = sc.nextLine();

            System.out.println("Introduce el número: ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.println("Introduce la capacidad máxima: ");
            int capacidadMaxima = sc.nextInt();

            listaClases.add(new Clase(curso, numero, capacidadMaxima));
        }
    }

    public static void modificarAlumno(Scanner sc, ArrayList<Alumno> listaAlumnos, ArrayList<Clase> listaClases) {
        System.out.flush();
        System.out.println("== Modificación de Alumno ==");
        int contador = -1;
        System.out.println("\n|| Alumnos ||");
        for (Alumno a : listaAlumnos) {
            contador++;
            System.out.println("Indice: " + contador + " Alumno: " + a.nombre);
        }
        System.out.println("Selecciona el alumno: ");
        int alumno = sc.nextInt();
        sc.nextLine();

        if(alumno < listaAlumnos.size() && alumno >= 0) {
            Alumno alumnoAModificar = listaAlumnos.get(alumno);

            System.out.println("Introduce el nombre: ");
            String nombreNuevo = sc.nextLine();
            alumnoAModificar.nombre = nombreNuevo;

            System.out.println("Introduce los apellidos: ");
            String apellidosNuevo = sc.nextLine();
            alumnoAModificar.apellido = apellidosNuevo;

            System.out.println("Introduce la edad: ");
            int edadNuevo = sc.nextInt();
            alumnoAModificar.edad = edadNuevo;

            System.out.println("Introduce el dni: ");
            String dniNuevo = sc.nextLine();
            sc.nextLine();
            alumnoAModificar.dni = dniNuevo;

            int contadorClases = -1;
            System.out.println(" || Clases ||");
            for (Clase c : listaClases) {
                contadorClases++;
                System.out.println("Indice: " + contadorClases + " Curso: " + c.curso);
            }
            System.out.println("Selecciona el curso: ");
            int cursoNuevo = sc.nextInt();
            sc.nextLine();
            alumnoAModificar.clase = listaClases.get(cursoNuevo);
        }
        else{
            System.out.println("Has especificado un alumno inexistente!");
        }
    }

    public static void modificarClase(Scanner sc, ArrayList<Clase> listaClases) {
        System.out.flush();
        System.out.println("== Modificación de Clase ==");
        int contador = -1;
        System.out.println("\n|| Clases ||");
        for (Clase c : listaClases) {
            contador++;
            System.out.println("Indice: " + contador + " Clase: " + c.curso);
        }
        System.out.println("Selecciona la clase: ");
        int clase = sc.nextInt();
        sc.nextLine();

        if(clase < listaClases.size() && clase >= 0){
            Clase claseAModificar = listaClases.get(clase);

            System.out.println("Introduce el curso: ");
            String cursoNuevo = sc.nextLine();
            claseAModificar.curso = cursoNuevo;

            System.out.println("Introduce el número: ");
            int numeroNuevo = sc.nextInt();
            claseAModificar.numero = numeroNuevo;

            System.out.println("Introduce la capacidad máxima: ");
            int capacidadNueva = sc.nextInt();
            claseAModificar.capacidadMaxima = capacidadNueva;
        }
        else{
            System.out.println("Has especificado una clase inexistente!");
        }
    }
}