#ifndef RETANGULO_H
#define RETANGULO_H

#include <iostream>

using namespace std;

class Retangulo{

  double largura, comprimento;

  public:
    Retangulo(double=0.0, double = 0.0);
    ~Retangulo();
    void setValores(double,double);
    double calculaArea();
    friend Retangulo duplicaAmiga(Retangulo&);
};

#endif