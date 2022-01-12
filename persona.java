public class persona {

    //atributos

    String nombre;
    int edad;
    float estatura; 

    //metodo
    public static void main(String[] args) {
        
        persona persona1 = new persona(31, "kimberly", 1.67f);

        System.out.println(persona1.edad);
        
                
        /*System.out.println("tu edad es: "+persona1.edad);
        System.out.println("te llamas: "+persona1.nombre);
        System.out.println("y mides: "+persona1.estatura);*/

        //MostrarHola(); //<-- los objetos estaticos pueden ser llamados directamente
        //persona1.MostrarHola2(); //<-- para llamar a un objeto creado sin static hay que llamarlo con un objeto creado previamente

        persona persona2 = new persona(18,"juan"); //<- se crea un nuevo objeto y se le dan atributos con el metodo constructor

        /*System.out.println("la edad es: "+persona2.edad);
        System.out.println("El nombre es: "+persona2.nombre);*/

        persona persona3 = new persona(33, "Marco", 1.74f);

        /*System.out.println("tu edad es: "+persona3.edad);
        System.out.println("te llamas: "+persona3.nombre);
        System.out.println("y mides: "+persona3.estatura);*/

        persona1.dameEdad();
        persona2.dameEdad();
        persona3.dameEdad();

      
    }

    public persona(int edad, String name, Float estatura){
         this.nombre = name;
         this.edad = edad; 
         this.estatura = estatura; 


    }

    public persona(int edad, String name){ //<-- se crea un objeto declarando los atributos directamente en el metodo contructor para ser asignados

        this.nombre = name;
        this.edad = edad;

    }

    //public = modificador de acceso
    //static = es que es estatico (para ejecutarlo, no necesitamos ejemplar de clase o instancia)
    //void = tipo de retorno (no va aregresar nada)

    public persona() {
    }

    public static void MostrarHola(){

        System.out.println("hola desde public static void MostarHola");

    }

    public void MostrarHola2(){

        System.out.println("hola2 desde public static void MostarHola");

    }

    public void dameEdad(){

        System.out.println(this.edad);
    }

    public char[] getEdad() {
        return null;
    }
    
}

/*

    this //<-- se usa para hacer referencia a una llamada o metodo, no sirve con Static

*/

/*
    metodo constructor

    public nombreClases(parametros){

    ---
    asignar valores a los atributos con los parametros dados
    ---
    lineas que queremos que se ejecuten al crear un objeto
    ---

    }
*/