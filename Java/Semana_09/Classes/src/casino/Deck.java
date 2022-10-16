package casino;
import java.util.Random;
public class Deck {
  private Carta[] cartas;
  private static final Random randomNumber = new Random();

  public Deck() {
    cartas = new Carta[52];
    fill();
  }

  private void fill() {
    int i = 0;

    for (Naipe naipe: Naipe.values()) {
      for (Valor valor: Valor.values()){
        cartas [i] = new Carta(naipe, valor);
        i++;
      }
    }
  }

  public void shuffle() {
    for (int i = 0; i < cartas.length; i++) {
      int troca = randomNumber.nextInt(52);
      Carta tmp = cartas[i];
      cartas[i] = cartas[troca];
      cartas[troca] = tmp;
    }
  }

  @Override
  public String toString() {
    String str = "";
    int num = 0;
    for (int i=0; i < 4; i++) {
      for (int j = 0; j < 13; j++)
        str += (cartas[num++].toString() + " ");
        str += "\n";
    }
    return str;
  }
}
