#include <iostream>
using namespace std;

class DiarioClasse {
  public:
  void mostraMensagem(){
      cout << "Seja Bem-vindo ao Diario de Classe" << endl;
  }
};

int main() {
  DiarioClasse meuDiario;
  meuDiario.mostraMensagem();
  return 0;
}