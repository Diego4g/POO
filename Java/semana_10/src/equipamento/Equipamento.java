package equipamento;

public class Equipamento {
  private boolean ligado;

  public Equipamento() {
    this.ligado = false;
  }

  public void desliga() {
    this.ligado = false;
  }

  public void liga() {
    this.ligado = true;
  }

  @Override
  public String toString() {
    return "Equipamento [ligado=" + ligado + "]";
  }
}
