#include "Data.h"

using namespace std;

Data::Data(int dia, int mes, int ano){
  this->dia=dia;
  this->mes=mes;
  this->ano=ano;
}

Data::~Data(){}

void Data::setDia(int dia){
  this->dia=dia;
}

void Data::setMes(int mes){
  this->mes=mes;
}

void Data::setAno(int ano){
  this->ano=ano;
}

double Data::getDia()const{
  return dia;
}

double Data::getMes()const{
  return mes;
}

double Data::getAno()const{
  return ano;
}