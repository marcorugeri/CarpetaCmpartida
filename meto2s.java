public class meto2s {

    String nombre;
    int edad;
    
    public static void main(String[] args) {

        persona persona1 = new persona();

        persona1.edad = 33; 
        persona1.nombre = "marco"; 
        
        //System.out.println(persona1.getNombre());
        
        /*persona1.setNombre("Eduardo");
        System.out.println(persona1.setNombre());*/


    }

    
    
    /*public String getNombre(){

        return this.nombre;

    }*/

    public void setNombre(String Nombre){

        this.nombre = Nombre;
    }

}
/* 

    - metodos ed accesos (Getters):

    public tipoDato GetAtributo(){

        return this.atributo;
    }


    - metodos modificadores (Setters):

    public void setAtributo(TipoDato nuevoAtributo){

        this.atributo 0 nuevoAtributo;
    }

*/
