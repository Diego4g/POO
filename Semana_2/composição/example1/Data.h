#ifndef DATA_H
#define DATA_H

class Data{
  int dia,mes,ano;

  public:
    Data(int=0,int=0,int=0);
    virtual ~Data();
    void setDia(int);
    void setMes(int);
    void setAno(int);
    double getDia() const;
    double getMes() const;
    double getAno() const;
};

#endif