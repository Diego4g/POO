package polimorfismo.employee;

public class EmpregadoComissionado extends Empregado {

  private double vendas, comissao;

  public EmpregadoComissionado(String nome, String sobrenome, String documento, double vendas, double comissao) {
    super(nome,sobrenome,documento);
    this.vendas = vendas;
    this.comissao = comissao;
  }

  public void setvendas(double vendas) {
    this.vendas = vendas;
  }

  public void setcomissao(double comissao) {
    this.comissao = comissao;
  }

  @Override
  public double salario() {
    return vendas * comissao;
  }

  @Override
  public String toString() {
    return super.toString() + "Total em vendas: " + this.vendas + "Comissão: " + comissao;
  }
  
}
