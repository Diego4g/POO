#include "Cliente.h"

using namespace std;

Cliente::Cliente(string nome, string endereco, string cpf){
  this->nome = nome;
  this->endereco = endereco;
  this->cpf = cpf;
}

Cliente::~Cliente(){}

void Cliente::setNome(string nome){
  this->nome = nome;
}
void Cliente::setEndereco(string endereco){
  this->endereco = endereco;
}
void Cliente::setCpf(string cpf){
  this->cpf = cpf;
}

string Cliente::getNome() const{
  return this->nome;
}
string Cliente::getEndereco() const{
  return this->endereco;
}
string Cliente::getCpf() const{
  return this->cpf;
}