#include <iostream>
#include "Retangulo.h"

using namespace std;


Retangulo::Retangulo(double largura, double comprimento){
  this->largura = largura;
  this->comprimento = comprimento;
}

Retangulo::~Retangulo(){}

void Retangulo::setValores(double largura, double comprimento){
  this->largura = largura;
  this->comprimento = comprimento;
}

double Retangulo::calculaArea(){
  return this->largura * this->comprimento;
}

Retangulo duplicaAmiga(Retangulo& R){
  Retangulo tmp;
  tmp.largura = 2 * R.largura;
  tmp.comprimento = 2 * R.comprimento;

  return tmp;
}


