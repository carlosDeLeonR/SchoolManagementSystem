import java.util.ArrayList;
import java.util.HashMap;

public class Main {




    private static class Estudiante {
        private int id;
        private String nombre;
        private String apellido;
        private String estado;

        public Estudiante(int id, String nombre, String apellido, String estado) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.estado = estado;
        }

        public String getEstado(){

            return estado;
        }
        public String toString() {
            return "Estudiante{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", estado='" + estado + '\'' +
                    '}';
        }
    }

    private static class Curso {
        private int id;
        private String nombre;
        private String descripcion;
        private int numeroCreditos;
        private String version;

        public Curso(int id, String nombre, String descripcion, int numeroCreditos, String version) {
            this.id = id;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.numeroCreditos = numeroCreditos;
            this.version = version;
        }

        public String toString() {
            return "Curso{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", descripcion='" + descripcion + '\'' +
                    ", numeroCreditos=" + numeroCreditos +
                    ", version='" + version + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        HashMap<Curso, ArrayList<Estudiante>> lista = new HashMap<>();

        Estudiante estudiante1 = new Estudiante(1, "Carlos", "De Leon", "matriculado");
        Estudiante estudiante2 = new Estudiante(2, "Andres", "Rodriguez", "graduado");

        Curso curso1 = new Curso(1, "matematica", "algebra avanzada", 3, "3.9");
        Curso curso2 = new Curso(2, "lenguaje", "learning eanglish", 4, "2.7");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        cursos.add(curso1);
        cursos.add(curso2);

        lista.put(curso1, new ArrayList<>());
        lista.get(curso1).add(estudiante1);
        lista.get(curso1).add(estudiante2);

        lista.put(curso2, new ArrayList<>());
        lista.get(curso2).add(estudiante2);

        System.out.println();
        for (Curso curso : lista.keySet()) {
            System.out.println("Curso: " + curso);
            System.out.println("Estudiantes activos:");
            for (Estudiante estudiante : lista.get(curso)) {

                if (estudiante.getEstado().equals("matriculado")) {
                    System.out.println(estudiante);
                } else {

                }
            }
            System.out.println("graduados:");
            for (Estudiante estudiante : lista.get(curso)) {

                if (estudiante.getEstado().equals("matriculado")) {

                } else {
                    System.out.println(estudiante);
                }
            }
            System.out.println("");

        }


    }
}
