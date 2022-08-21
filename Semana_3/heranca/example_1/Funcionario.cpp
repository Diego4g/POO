#include <iostream>
#include "Funcionario.h"
#include <iomanip>

using namespace std;

Funcionario::Funcionario(string nome, double salario) {
  this->nome = nome;
  this->salario = salario;
}

Funcionario::~Funcionario(){}

double Funcionario::calculaBonificacao(){
  return salario*0.1;
}

string Funcionario::getNome() const {
  return this->nome;
}

void Funcionario::setNome(string nome) {
  this->nome = nome;
}

double Funcionario::getSalario() const {
  return this->salario;
}

void Funcionario::setSalario(double salario) {
  if( salario > 0)
    this->salario = salario;
  else
    this->salario = 0.0;
}

ostream& operator<<(ostream& out, const Funcionario&  Func) {
  out << "\nnome: "<< Func.getNome() 
      << "\nsalario: " << fixed
      << setprecision(2) << Func.getSalario() << endl;
  return out;
}