#include <iostream>
#include <string>
using namespace std;

class Vendas{
  float valor;
  int pecas;

  public:
/*     Vendas(int p=-1, float v=-1.0){
      //valor = v;
      //pecas = p;
      this->valor= v;
      this->pecas= p;
    } */
    Vendas(int p=-1, float v=-1.0):valor(v),pecas(p){}

  float getValor(){
    return valor;
  }

  int getPecas(){
    return pecas;
  }
};

int main(){
  Vendas a,b(10,10);

  cout << a.getPecas() << endl
       << a.getValor() << endl
       << b.getPecas() << endl
       << b.getValor() << endl;
       

  return 0;
}