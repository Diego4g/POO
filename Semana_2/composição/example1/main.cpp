#include "Conta.h"
#include "iostream"
using namespace std;

int main(){
  Cliente cli1("Manoel Dias", "Rua A", "111.111.111-11");
  Cliente cli2("Diego Ferreira", "Rua B", "222.222.222-22");
  Data data1(1,3,2019), data2(23,5,2019);
  Conta conta1(100,500.0,cli1,data1);
  Conta conta2(101,1000.0,cli2,data2);
  conta1.mostrarDados();
  conta2.mostrarDados();
  conta1.transferencia(conta2,200.0);
  cout << "\nApos a transferencia";
  conta1.mostrarDados();
  conta2.mostrarDados();
  return 0;
}