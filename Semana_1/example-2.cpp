#include <iostream>
#include <string>
using namespace std;

class Carro {
  
  string placa;
  int velocidade;
  
  public:
    void acelerar(){
      velocidade += 10;
    }
    void frear(){
      velocidade -= 10;
    }
    void setPlaca(string placa){
      this->placa = placa;
    }
    void setVelocidade(int velocidade){
      this->velocidade = velocidade;
    }
    string getPlaca() const{
      return placa;
    }
    int getVelocidade() const{
      return velocidade;
    }
    void mostrarVelocidade(){
      cout << velocidade << "Km/h\n";
    }
};

int main (){
  Carro herbie;
  herbie.setPlaca("THY-8888");
  herbie.setVelocidade(50);
  herbie.acelerar();
  cout << "\nVelocidade: "
       << herbie.getVelocidade() << "Km/h";
  cout << "\nPlaca: " << herbie.getPlaca() << "\n";
  return 0;
};