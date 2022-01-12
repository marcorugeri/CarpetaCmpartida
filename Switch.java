public class Switch {

    public static void main(String[] args) {
        
    /*
        Sintaxis

        switch (dato comparable){

        case 'a':
            codigo a ejecutar si es igual a 'a'
            break;
        
        case 2:
            codigo a ejecutar si es igual a 2
            break;
        ...

        case n:
            codigo a ejecutar si es igual a n
            break;

        default:
            codigo a ejecutar en caso de que no entre en los demas casos
            break;
        }
    */
    char caracter = 'b';

    switch(caracter){
        case 'a':
            System.out.println("la variable tiene como letra A");
            break;
        case 'b':
            System.out.println("la variable tiene como letra B");
            break;
        default:
            System.out.println("la variable tiene otra letra");
            break;

    }
        



    }
}