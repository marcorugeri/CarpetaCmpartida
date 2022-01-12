import java.util.Scanner;

public class operadores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n1,n2,resulSuma,resulMulti,resulDiv,resulResta;
       System.out.println("Dame 2 Numeros");
       n1 = sc.nextInt();
       n2 = sc.nextInt();
       
       resulSuma = n1 + n2;
       resulDiv = n1 / n2;
       resulMulti = n1 * n2;
       resulResta = n1 - n2;

       System.out.println("\tlos resultados son los siguientes:***");
       System.out.println("\tsuma:"+resulSuma);
       System.out.println("\tresta:"+resulResta);
       System.out.println("\tdivision:"+resulDiv);
       System.out.println("\tmultiplicacion:"+resulMulti);





    }
    
}
