package ordenacao;

public class Conta implements Comparable<Conta> {
  private int num;
  private String nome;
  private double saldo;

  public Conta() {
    this(0,"",0.0);
  }
  public Conta(int num, String nome, double saldo) {
    this.num = num;
    this.nome = nome;
    this.saldo = saldo;
  }

  @Override
  public int compareTo(Conta c) {
    if(this.num < c.num)
      return -1;
    else if (this.num > c.num)
      return 1;
    else
      return 0;
  }
  
  @Override
  public String toString() {
    return "Conta [num=" + num + ", nome=" + nome + ", saldo=" + saldo + "]";
  }
  public int getNum() {
    return num;
  }
  public void setNum(int num) {
    this.num = num;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public double getSaldo() {
    return saldo;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

}
