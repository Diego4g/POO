#ifndef CLIENTE_H
#define CLIENTE_H

#include <string>
using namespace std;

class Cliente{
  string nome;
  string endereco;
  string cpf;

  public: 
    Cliente(string = "", string = "", string = "");
    virtual ~Cliente();
    void setNome(string);
    void setEndereco(string);
    void setCpf(string);

    string getNome() const;
    string getEndereco() const;
    string getCpf() const;
};
#endif