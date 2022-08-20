#include <iostream>
#include <string>
#include "DiarioClasse.h"

using namespace std;

int main(){

  DiarioClasse meuDiario1("BCC221 - POO");
  DiarioClasse meuDiario2("BCC326 - PDI");

  cout << "Diario de classe da disciplina: "
       << meuDiario1.getNome() << endl
       << "Diario de Classe da disciplina: "
       << meuDiario2.getNome() << endl;

  return 0;
}