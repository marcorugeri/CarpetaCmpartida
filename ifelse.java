public class ifelse {

static int x, y;

public static void main(String[] args) {
    
    int x = 7;
    int y = 10; 

    /*

    Sintaxis 
    if (condicional) {
        codigo a ejecutarse en caso de que cumpla la condicion
    }

    if (condicional){
        codigo a ejecutarse en caso de que la condicional se cumpla
    } else {
        codigo a ejecutarse en caso de que la condicional no se cumpla
    }
    
    if (condicion){
        codigo a ejecutarse en caso de que la condicion se cumpla
    }else if (condicion){
        codigo a ejecutarse en caso de que la nueva condicion se cumpla
    }
    */ 

    /*if(x < y){
        System.out.println(x+" es menor que "+y);
    }/*

    /*if(x > y){
        System.out.println(x+ "es mayor que "+y);
    }else{
        System.out.println(x+ "es menor que "+y);
    }*/

    if(x < y){
        System.out.println(x+" es menor que "+y);
    }else if(x == y){
        System.out.println(x+" es igual que "+y);
    }else if(x >y){
        System.out.println(x+" es mayor que "+y);
    }
    System.out.println("Evento FInalizado.");


   
}
}