package polimorfismo.employee;

public class EmpregadoAssalariado extends Empregado {

  public double salarioSemanal;

  public EmpregadoAssalariado(String nome, String sobrenome, String documento, double salarioSemanal) {
    super(nome,sobrenome,documento);
    this.salarioSemanal = salarioSemanal;
  }

  public void setSalarioSemanal(double salarioSemanal) {
    this.salarioSemanal = salarioSemanal;
  }

  @Override
  public double salario() {
    return salarioSemanal;
  }

  @Override
  public String toString() {
    return super.toString() + "Salario semanal: " + this.salarioSemanal;
  }
  
}
