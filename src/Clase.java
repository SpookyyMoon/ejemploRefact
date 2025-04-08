public class Clase {

    public String curso;

    public int numero;

    public int capacidadMaxima;

    public Clase(String curso, int numero, int capacidadMaxima) {
        this.curso = curso;
        this.numero = numero;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getCurso() {
        return curso;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return "Curso: " + curso + "\nNúmero: " + numero + "\nCapacidad Máxima: " + capacidadMaxima;
    }
}
