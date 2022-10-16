public class Conta {
  private String nome;
  private Double saldo;

  public Conta(){};
  

  public Conta(String nome, Double saldo) {
    this.nome = nome;
    this.saldo = saldo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo > 0 ? saldo : 0;
  }

  public Double getSaldo() {
    return this.saldo;
  }

  public void Deposita(Double valor) {
    this.saldo = this.saldo + valor;
  }

  public void print() {
    System.out.println("Nome: " + this.nome + "\nSaldo: " + this.saldo);
  }
}
