package polimorfismo.veiculo;

import java.util.Random;

public class Oficina {
  private int num = 0;

  private final Random r = new Random();

  public Oficina() {}

  public Veiculo proximo() {
    Veiculo v;
    num = r.nextInt(2);

  if(num == 0){
    v = new Automovel();
  }
  else{
    v = new Moto();
  }
  return v;
  
  }

  public void manter(Veiculo v) {
    v.verificarLista();
    v.reparar();
    v.limpa();
  }

  public int getNum() {
    return num;
  }


}
