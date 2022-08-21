#ifndef GERENTE_H
#define GERENTE_H

#include "Funcionario.h"
#include <iostream>

using namespace std;

class Gerente: public Funcionario {

  string usuario;
  string senha;

  public:
    Gerente(string="",double=0.0, string="", string="");
    ~Gerente();

    string getUsuario()const;
    void setUsuario(string);
    string getSenha()const;
    void setSenha(string);
    double calculaBonificacao();

    friend ostream& operator<<(ostream&, const Gerente&);
  
};

#endif