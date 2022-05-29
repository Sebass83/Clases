public class Main {
    public static void main(String[] args) {
        Persona daniel = new Persona();
        daniel.setNombre("Daniel Solano");
        daniel.setEdad(32);
        daniel.setTelefono("9 (54) 0351-2246372");
        System.out.println(daniel.getNombre());
        System.out.println(daniel.getEdad());
        System.out.println(daniel.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public String getEdad() {
        return "Tiene: " + edad + " anios.";
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return "Su nombre es: " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return "Su telefono es: " + telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}