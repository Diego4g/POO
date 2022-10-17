package polimorfismo.employee;

public class EmpregadoComissionadoAssalariado extends EmpregadoComissionado {

  private double salarioMensal;

  public EmpregadoComissionadoAssalariado(String nome, String sobrenome, String documento, double vendas, double comissao, double salarioMensal) {
    super(nome, sobrenome, documento, vendas, comissao);
    this.salarioMensal = salarioMensal;
  }

  public double getSalarioMensal() {
    return salarioMensal;
  }

  public void setSalarioMensal(double salarioMensal) {
    this.salarioMensal = salarioMensal;
  }

  public double salario() {
    return getSalarioMensal() + super.salario();
  }

  @Override
  public String toString() {
    return super.toString() + "Salario Mensal: " + this.salarioMensal;
  }
  
}
