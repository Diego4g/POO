package casino;

public enum Naipe {
  COPAS(0),PAUS(1), OUROS(2), ESPADAS(3);
  
  private final int naipe;

  Naipe(int valor) {
    naipe = valor;
  }

  public final int getNaipe () {
    return naipe;
  }

}
