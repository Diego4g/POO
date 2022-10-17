package polimorfismo.veiculo;

public class Moto implements Veiculo {
  public Moto() {}

  public void verificarLista() {
    System.out.println("Verifica Moto");
  }

  public void reparar() {
    System.out.println("Reparar Moto");
  }

  public void limpa() {
    System.out.println("Limpar Moto");
  }
}
