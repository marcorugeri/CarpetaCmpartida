
public class Funciones {

    static int numero;
    public static void main(String[] args) {
        int n1 = 5, n2 = 10, resultado;
        numero = 4;
        resultado = n1 + n2 + numero;
        System.out.println("El resultado es: "+resultado);
        suma(n1, n2);
    }

    public static void suma(int n1, int n2){
    
       numero = 15;
       int result = n1 + n2 + numero;
       System.out.println("El resultado es: "+result);

    }



}
