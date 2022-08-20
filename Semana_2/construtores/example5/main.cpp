#include <iostream>
#include <string>

using namespace std;

class Numero {
  int valor;

  public:
    Numero(int n){ 
      valor = n;
    }
    int getNumero(){
      return valor;
    }
};


int main(){

  Numero vet[3] = {Numero(0), Numero(1), Numero(3)};
  for (int i = 0; i < 3; i++)
  {
    cout << vet[i].getNumero() << endl;
  }
  
  return 0;
 };


