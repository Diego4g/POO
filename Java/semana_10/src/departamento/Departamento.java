package departamento;
import java.util.Objects;

public class Departamento implements Cloneable {
  private int id;
  private String nome;

  public Departamento(){}

  public Departamento(int id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Departamento { " + "id=" + id + ", nome=" + nome + "}";
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 61 * hash + this.id;
    hash = 61 * hash + Objects.hashCode(this.nome);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (this == null) return false;
    if (getClass() != obj.getClass()) return false;
    final Departamento other = (Departamento) obj;
    if(this.id != other.id) return false;
    return Objects.equals(this.nome, other.nome);
  }
   
  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

   
}
