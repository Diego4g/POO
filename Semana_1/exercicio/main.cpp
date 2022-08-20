#include <iostream>
using namespace std;

class Conta{
  int numConta;
  double saldo;
  // para simplificar, as classes Cliente e data 
  // serão tratadas como strings
  string cliente;
  string data;


  public:
    Conta(int numConta, double saldo, string cliente, string data){
      this->numConta = numConta;
      this->saldo = saldo;
      this->cliente = cliente;
      this->data = data;
    }
    bool depositar(double valor){
      if (valor > 0){
        saldo += valor;
        return true;
      }
      return false;
    }
    bool saque(double valor){
      if(saldo > valor && valor > 0){
        saldo -= valor;
        return true;
      }
      return false;
    }
    bool transferencia(Conta& destino, double valor){
      if(saque(valor)){
        destino.depositar(valor);
        return true;
      }
      return false;
    }
    void mostrarDados() const{
      cout << "\nNome do cliente: " << this->cliente << " ";
      cout << "\nNumero da conta: " << this->numConta << " ";
      cout << "\nSaldo da conta: " << this->saldo << " ";
      cout << "\nData de criação da conta: " << this->data << "\n";
      
    }
};

int main(){
  Conta conta1(100,500.0,"Diego Ferreira", "01/03/2022");
  Conta conta2(101,1000.0,"Aladin", "02/12/2022");
  conta1.mostrarDados();
  conta2.mostrarDados();
  conta1.transferencia(conta2,200.0);
  conta1.mostrarDados();
  conta2.mostrarDados();
  return 0;
};