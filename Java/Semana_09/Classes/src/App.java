import java.util.Scanner;
import casino.*;
public class App {
    public static void main(String[] args) throws Exception {

        // Exemplo GradeBook

        /* 
        GradeBook myGradeBook = new GradeBook("BCC221");

        System.out.printf("Initial course name is: " + myGradeBook.getCourseName() +"\n");
        */

        // Exemplo conta
        /* 
        Scanner input = new Scanner(System.in);

        Conta c1 = new Conta();
        Conta c2 = new Conta("Aladin", 10000.0);

        System.out.print("Digite nome: ");
        String nome = input.nextLine();
        System.out.print("Digite saldo: ");
        double saldo = input.nextDouble();

        c1.setNome(nome);
        c1.setSaldo(saldo);

        c1.print();
        c2.print();

        c2.Deposita(1.0);

        c2.print();
        */   
        
        // Exemplo random
        /* 
        System.out.println("Frequencia com Math.random: ");
        Random.myRandomMath(5, 10);
         */

        // Exemplo craps
        /* 
        Craps jogo = new Craps();

        jogo.play();
        */

        // Exemplo OpçõesMenu
        /* 
        for (OpcoesMenu op : OpcoesMenu.values()){
            TestadoraEnum.escolheOpcao(op);
        }
        */

        // Exemplo casino

        Deck deck = new Deck();
        System.out.println(deck);
        
        deck.shuffle();
        System.out.println("Embaralhando ...");
        System.out.println(deck);
    }
}
