package geometria;

public class Cilindo extends Circulo {

  protected double altura;

  public Cilindo(float x, float y, double raio, double altura) {
    super(x, y, raio);
    this.altura = altura;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double area() {
    return 2* super.area() + 2*Math.PI * raio * altura;
  }

  public double volume() {
    return super.area() * altura;
  }

  @Override
  public String toString() {
    return  ("\nCilindro {" + super.toString() + "altura=" + altura + "}\n");
  }
  
}
