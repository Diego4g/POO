#include <iostream>
#include <string>
using namespace std;

class DiarioClasse{
  string nomeDaDisciplina;

  public:
    DiarioClasse(string nome){
      setNomeDaDisciplina(nome);
    }

  void setNomeDaDisciplina(string name){
    nomeDaDisciplina = name;
  }

  string getNomeDaDisciplina(){
    return nomeDaDisciplina;
  }
  
  void mostraMensagem(){
    cout << "Seja Bem-vindo ao Diario de Classe de"
         << getNomeDaDisciplina() << endl;
  }

};

int main(){
  DiarioClasse meuDiario1("BCC221 - POO");
  DiarioClasse meuDiario2("BCC326 - PDI");

  cout << "Diario de Classe da disciplina: "
       << meuDiario1.getNomeDaDisciplina() << endl
       << "Diario de Classe da Disciplina: "
       << meuDiario2.getNomeDaDisciplina() << endl;
  return 0;
}