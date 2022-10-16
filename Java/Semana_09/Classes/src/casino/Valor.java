package casino;

public enum Valor {
  A( 1 ) , DOIS ( 2 ) , TRES ( 3 ) , QUATRO( 4 ) , CINCO ( 5 ) , SEIS ( 6 ) , SETE ( 7 ) , OITO ( 8 ) , NOVE( 9 ) , DEZ( 10 ) , JACK ( 11 ) , QUEEN( 12 ) , KING ( 13 );

  private final int valor_carta;

  Valor(int valor) {
    valor_carta = valor;
  }

  public final int getValor(){
    return valor_carta;
  }
}
