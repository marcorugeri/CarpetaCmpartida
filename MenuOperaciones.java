import java.util.Scanner;

//Programa que muestre un menu de operacione ppara realizar operaciones aritmeticas (+,-,*,/)
//con 2 numero dados

public class MenuOperaciones {

    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);{
   
        System.out.println("\t***Bienvenido a mi programa vamos a realizar una Op Aritmetica***");

    float n1, n2, result;
    int opcion;
     
 
        System.out.print("**Ingresa el primer numero ");
        n1 = sc.nextFloat();
        System.out.print("**Ingresa el primer numero ");
        n2 = sc.nextFloat();

        do {
            System.out.println("**Ahora que quieres hacer**");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. salir");
            System.out.print("Ingresa tu Opcion: ");
            opcion = sc.nextInt();

                switch (opcion){
                    
                    case 1:
                        result = n1+n2;
                        System.out.println("la suma es: "+result);
                        break;
                    case 2:
                        result = n1 - n2;
                        System.out.println("la resta es: "+result);
                        break;
                    case 3:
                        result = n1 * n2;
                        System.out.println("la multiplicacion es: "+result);
                        break;
                    case 4:
                        result = n1 / n2;
                        System.out.println("la division es: "+result);
                        break;
                    case 5: 
                        System.out.println("**Gracias Por tu tiempo");
                        break;
                    default:
                        System.out.println("la opcion es INCORRECTA");
                        break;  
                }

        }while(opcion != 5);
        

    

    



    }
  }    
}
