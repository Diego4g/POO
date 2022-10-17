package polimorfismo.veiculo;

public class Automovel implements Veiculo {
  
  public Automovel() {}

  @Override
  public void verificarLista() {
    System.out.println("Verifica Automovel");
  }

  @Override
  public void reparar() {
    System.out.println("Reparar Automovel");
  }

  @Override
  public void limpa() {
    System.out.println("Limpar Automovel");
  }
}
