public class Alumno{
    public String nombre;
    public String apellido;
    public int edad;
    public String dni;
    public Clase clase;

    public Alumno(String nombre, String apellido, int edad, String dni, Clase clase){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.clase = clase;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public Clase getClase() {
        return clase;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellidos: " + apellido + "\nDNI: " + dni + "\nEdad: " +edad + "\nClase: " + clase;
    }
}
