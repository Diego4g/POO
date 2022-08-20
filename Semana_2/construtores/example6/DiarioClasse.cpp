#include "DiarioClasse.h"
#include <iostream>
using namespace std;

DiarioClasse::DiarioClasse(string nomeDaDisciplina):
  nomeDaDisciplina(nomeDaDisciplina){}

DiarioClasse::~DiarioClasse(){}

void DiarioClasse::setNome(string nomeDaDisciplina){
  this->nomeDaDisciplina = nomeDaDisciplina;
}

string DiarioClasse::getNome(){
  return nomeDaDisciplina;
}

void DiarioClasse::mostraMensagem(){
  cout << "Bem-vindo: " << this->getNome() << endl;
}