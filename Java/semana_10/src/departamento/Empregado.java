package departamento;
import java.util.Objects;

public class Empregado implements Cloneable {
  private int id;
  private String nome;
  private Departamento departamento;

  public Empregado() {
  }

  public Empregado(int id, String nome, Departamento departamento) {
    this.id = id;
    this.nome = nome;
    this.departamento = departamento;
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

  public Departamento getDepartamento() {
    return this.departamento;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }

  @Override
  public String toString() {
    return "Departamento { " + "id=" + id + ", nome=" + nome + ", departamento=" + departamento + "}";
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 83 * hash + this.id;
    hash = 83 * hash + Objects.hashCode(this.nome);
    hash = 83 * hash + Objects.hashCode(this.departamento);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (this == null) return false;
    if (getClass() != obj.getClass()) return false;
    final Empregado other = (Empregado) obj;
    if(this.id != other.id) return false;
    if(!Objects.equals(this.nome, other.nome)) return false;
    return Objects.equals(this.departamento, other.departamento);
  }

  public Object clone() {
    try {
      Empregado novo = (Empregado) super.clone();
      novo.setDepartamento((Departamento)novo.getDepartamento().clone());
      return novo;
    }
    catch(CloneNotSupportedException e) {
      return null;
    }
  }
}
