package polimorfismo.employee;

public abstract class Empregado {

  String nome, sobrenome, documento;

  public Empregado(){}
  
  public Empregado(String nome, String sobrenome, String documento){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.documento = documento;
  }
  
  public abstract double salario();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  @Override
  public String toString() {
    return "Empregado [nome=" + nome + ", sobrenome=" + sobrenome + ", documento=" + documento + "]";
  }
}
