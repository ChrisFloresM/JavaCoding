// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persona persona_1 = new Persona();

        persona_1.setEdad(23);
        persona_1.setNombre("Luis");
        persona_1.setNumero("1234567892");

        System.out.println(persona_1.getEdad());
        System.out.println(persona_1.getNombre());
        System.out.println(persona_1.getNumero());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String numero;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}