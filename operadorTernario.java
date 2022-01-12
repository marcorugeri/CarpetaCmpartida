import java.util.Scanner;

public class operadorTernario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int n1, n2;
        float n1, n2, n3, promedio;

        /*System.out.println("Hola vamos a probar esto, por favor introduce un numero");
        n1 = sc.nextInt();
        System.out.println("introduce otro numero");
        n2 = sc.nextInt();
        System.out.println(n1 == n2 ? "el numero es igual" : "el numero no es igual");*/

        /*boolean seCumplio = 5 > 4 ? true : false;
        String texto = n1 == n2 ? "son iguales" : "no son iguales";
        System.out.println(texto);*/

        System.out.print("introduce tu primera nota: ");
        n1 = sc.nextFloat();
        System.out.print("introduce tu segunda nota: ");
        n2 = sc.nextFloat();
        System.out.print("introduce tu tercera nota: ");
        n3 = sc.nextFloat();

        promedio = (n1+n2+n3)/3;

        System.out.println(promedio >= 6 ? "aprobo con "+promedio : "reporbo con: "+promedio);        


    }
    
}
