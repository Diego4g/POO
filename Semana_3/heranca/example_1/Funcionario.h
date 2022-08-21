#ifndef FUNCIONARIO_H
#define FUNCIONARIO_H

#include <iostream>

using namespace std;

class Funcionario {
  string nome;
  double salario;

  public:
    Funcionario(string ="", double = 0.0);
    ~Funcionario();
    double calculaBonificacao();
    string getNome()const;
    void setNome(string nome);
    double getSalario()const;
    void setSalario(double salario);

    friend ostream& operator<<(ostream&, const Funcionario&);
};

#endif