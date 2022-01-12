public class OpDeComparacion {

    public static void main(String[] args) {
        
        //omparadores de operaciones

        int x=4, y=9;
        boolean resultados;

        //menor que
        resultados = x < y;
        System.out.println("menor que:"+resultados);
        
        //menor o igual que
        resultados = x <= y;
        System.out.println("menos o igual que:"+resultados);
        
        //mayor que
        resultados = x > y;
        System.out.println("mayor que:"+resultados);
        
        //mayor o igual que
        resultados = x >= y;
        System.out.println("mayor o igual que:"+resultados);
        
        //igualdad
        resultados = x == y;
        System.out.println("igual que:"+resultados);
        
        //desigualdad
        resultados = x != y;
        System.out.println("desigual que:"+resultados);

    }
    
}
