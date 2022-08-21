#include "Gerente.h"
#include <iostream>
#include <iomanip>

using namespace std;

Gerente::Gerente(string nome, double salario, string usuario, string senha): Funcionario(nome,salario), usuario(usuario), senha(senha){}

Gerente::~Gerente(){}

string Gerente::getUsuario() const {
  return this->usuario;
}

void Gerente::setUsuario(string usuario) {
  this->usuario = usuario;
}

string Gerente::getSenha() const {
  return senha;
}

void Gerente::setSenha(string senha) {
  senha = senha;
}

double Gerente::calculaBonificacao(){
  return getSalario()*0.6 + 100;
}

ostream& operator<<(ostream& out, const Gerente& gerente) {
  out << "\nnome: "<< gerente.getNome() 
      << "\nsalario: " << gerente.getSalario()
      << "\nusuario: " << gerente.usuario << endl;
  return out;
}