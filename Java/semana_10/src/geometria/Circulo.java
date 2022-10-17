package geometria;

public class Circulo extends Ponto {
  
  protected double raio;

  public Circulo(float x, float y, double raio) {
    super(x, y);
    this.raio = raio;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public double area() {
    return Math.PI * raio * raio;
  }

  @Override
  public String toString() {
    return  ("\nCirculo {" + "centro=" + super.toString() + "Raio=" + raio + "}\n");
  }
  
}
