#include "Funcionario.h"
#include "Gerente.h"

using namespace std;

int main(){

  Funcionario func1("Gustavo Costa", 12456.00);
  Funcionario func2("Manoel Travis", 10000.00);

  cout << func1 << func2;

  Gerente gerente("Sandra Sion", 30000.00, "sion", "senh2");

  cout << gerente;
  cout << "Bonificacao: "
       << gerente.calculaBonificacao() << endl;

  return 0;
};