package polimorfismo.employee;

public class EmpregadoHorista extends Empregado {

  private double valor, horas;

  public EmpregadoHorista(String nome, String sobrenome, String documento, double valor, double horas) {
    super(nome,sobrenome,documento);
    this.valor = valor;
    this.horas = horas;
  }

  public void setvalor(double valor) {
    this.valor = valor;
  }

  public void setHoras(double horas) {
    this.horas = horas;
  }

  @Override
  public double salario() {
    if(horas <= 40)
      return valor * horas;
    else
      return 40*valor + (horas-40)*valor*1.5;
  }

  @Override
  public String toString() {
    return super.toString() + "Horas trabalhadas: " + this.horas + "Valor pro hora: " + valor;
  }
}
