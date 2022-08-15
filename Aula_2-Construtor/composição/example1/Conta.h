#include "Cliente.h"
#include "Data.h"

using namespace std;

class Conta{
  int numConta, saldo;
  Cliente contarrentista;
  Data data;

  public:
    Conta(int, int, Cliente&, Data&);
    virtual ~Conta();
    bool depositar(double);
    bool saque(double);
    bool transferencia(Conta&, double);

    void setNumConta(int);
    void setSaldo(int);
    void setCliente(Cliente&);
    void setData(Data&);

    double getNumConta() const;
    void mostrarDados()const;
    double getSaldo()const;
    Cliente getCliente() const;
    Data getData() const;
};