#include <iostream>
#include "Ponto.h"

using namespace std;

int main() {
  Ponto P(2,3), P2(P), P3;
/*   P.print();
  P++;
  P.print();
  P3 = P.operator+(P2);
  P3 = P + P2;
  P3.print();

  if (P3 == P)
    cout << "Iguais" << endl;
  else
    cout << "Diferentes" << endl;
 */

  cout << "Digite coordenadas: ";
  cin >> P3;
  cout << P;

  cout << P++ << P + P2 << P3;
  return 0;
}