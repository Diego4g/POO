package geometria;

public class Ponto {
  
  protected float x, y;

  public Ponto(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "Ponto [x=" + x + ", y=" + y + "]";
  }

  
}
