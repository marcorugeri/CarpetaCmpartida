import java.util.Scanner;

public class EntradasDatos{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String name; 
        int n; 

            System.out.println("escribe un numero");
            n = sc.nextInt();

        sc.nextLine();

            System.out.println("escribe tu nombre");
            name = sc.nextLine();

                System.out.println("\tHOLA!!"+name);
                System.out.println("\ttu numero fue:"+n);
                System.out.println("\tY sabes quien te ama? \"YO\"!! <3");

    }


}
