package casino;

public class Carta {
  private Naipe naipe;
  private Valor valor;

  public Carta(Naipe naipe, Valor valor) {
    this.naipe = naipe;
    this.valor = valor;
  }

  public Naipe getNaipe() {
    return naipe;
  }

  public Valor getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return "{" + valor + " de " + naipe +  "}";
  }
}
