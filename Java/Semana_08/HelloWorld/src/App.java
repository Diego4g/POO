
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello World!");
        //Adicao.adicao();
        //Welcome.welcome();
        //Welcome2.init();
        //int y = 5;
        //System.out.println(y);
        //System.out.println("y+2="+y+2); // saida y+2=52
        //System.out.println("y+2="+(y+2)); // saida y+2=7
        //vetores();
        /* 
        Contador teste1 = new Contador();
        Contador teste2 = new Contador();
        Contador.contar();
        Contador.contar();
        Contador.contar();
        teste1.contar2();
        teste2.contar2();
        */

        //ForAprimorado();

        
        System.out.println(media(1.0,2.0,3.0));
        double myArray[] = {1.0,2.0,3.0};
        System.out.println(media2(myArray));
        

    }
    
    public static void vetores() {
        int TAMANHO = 10;
        int c[] = new int[TAMANHO];
        for(int i = 0; i < c.length; i++)
            System.out.printf("%d", c[i]);
    }

    public static void ForAprimorado(){
        int vet [] = {1,2,5,10,15,20,32};

        for(int i: vet) {
            System.out.printf( "%d\n",i);
        }
    }

    public static double media(double ... numeros) {
        double total = 0;

        for (double d: numeros)
            total += d;

        return total/numeros.length;
    }

    public static double media2(double [] numeros){
        double total = 0;
        for(double i:numeros)
            total += i;

        return total/numeros.length;
    }
}
