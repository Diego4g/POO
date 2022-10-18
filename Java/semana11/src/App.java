import java.util.*;

import ordenacao.Conta;

public class App {
  
    public static void main(String[] args) {
      List<Conta> contas = new ArrayList<>();
      insere(contas);
  
      Collections.sort(contas);
      print("Ordena pelo numero de conta", contas);
  
      Comparator<Conta> com = new Comparator<>() {
        @Override
        public int compare(Conta c1, Conta c2) {
          String nome1 = c1.getNome();
          String nome2 = c2.getNome();
          return nome1.compareTo(nome2);
        }
      };
  
      Collections.sort(contas, com);
      print("Ordena pelo nome da conta", contas);
  
      Collections.sort(contas, new Comparator<Conta>() {
        @Override
        public int compare(Conta o1, Conta o2) {
        /* 
          double saldo1 = o1.getSaldo();
          double saldo2 = o2.getSaldo();
          if(saldo1 > saldo2) return 1;
          else if(saldo1 < saldo2) return -1;
          else return 0;
        */
        Double saldo1 = o1.getSaldo();
        Double saldo2 = o2.getSaldo();

        return saldo1.compareTo(saldo2);
        }
      });
  
      print("Ordena pelo saldo de conta", contas);
    }
  public static void print(String titulo, Collection<Conta> collection) {
    System.out.println(titulo);

    for (Conta i: collection) {
      System.out.println(i);
    }
  }

  public static void insere(Collection<Conta> collection) {
    Conta obj = new Conta(266,"Marco", 500.45);
    collection.add(obj);
    Conta obj2 = new Conta(29,"Pedro", 1909.00);
    collection.add(obj2);
    Conta obj3 = new Conta(101,"Andre", 200.00);
    collection.add(obj3);
  }

}
