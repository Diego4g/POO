#include <iostream>
#include "Retangulo.h"

using namespace std;

int main(){

  Retangulo R1, R2;

  R1.setValores(2,3);

  R2 = duplicaAmiga(R1);

  cout << R2.calculaArea() << endl;

  return 0;
}