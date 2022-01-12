public class ejercicio {

    static String nombre = "Yoiner";

    public static void main(String[] args) {

        System.out.println("Hola " + nombre);
        nombre = "Marco";
        System.out.println(nombre);

    }

    public ejercicio() {
        nombre = "Marco";
        return;
    }
}
