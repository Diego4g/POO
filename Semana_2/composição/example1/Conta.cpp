
#include "Conta.h"
#include "Cliente.h"
#include "Data.h"
#include "iostream"
using namespace std;

Conta::Conta(int numConta, int saldo, Cliente& cliente , Data& data){
  this->numConta = numConta;
  this->saldo = saldo;
  this->contarrentista = cliente;
  this->data = data;
}

Conta::~Conta(){}

bool Conta::depositar(double deposito){
  if(deposito > 0){
    this->saldo += deposito;
    return true;
  }
  else{
    return false;
  }
}

bool Conta::saque(double saque){
  if(this->saldo > saque && saque > 0){
    saldo -= saque;
    return true;
  }
  else{
    return false;
  }
}

bool Conta::transferencia(Conta& conta, double valor){
  if(this->saque(valor)){
    conta.depositar(valor);
    return true;
  }

  else{
    return false;
  }

}

void Conta::mostrarDados()const{
  cout << "\nnome: " << this->contarrentista.getNome()
       << "\nsaldo: " << this->getSaldo();
}

void Conta::setNumConta(int num){
  this->numConta = num;
}

double Conta::getNumConta()const{
  return this->numConta;
}

void Conta::setSaldo(int saldo){
  this->saldo = saldo;
}

double Conta::getSaldo()const{
  return this->saldo;
}

void Conta::setCliente(Cliente& cliente){
  //this->contarrentista = cliente;
  this->setCliente(cliente);
}

Cliente Conta::getCliente()const{
 return this->contarrentista;
}

void Conta::setData(Data& data){
  this->data = data;
}

Data Conta::getData()const{
  return data;
}

