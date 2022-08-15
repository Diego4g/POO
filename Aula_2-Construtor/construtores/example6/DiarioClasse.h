#ifndef DIARIOCLASSE_H
#define DIARIOCLASSE_H
#include <string>

using namespace std;

class DiarioClasse {
  string nomeDaDisciplina;

  public:
    DiarioClasse(string="");
    ~DiarioClasse();
    void setNome(string nome);
    std::string getNome();
    void mostraMensagem();
};

#endif