#ifndef RELOGIO_H
#define RELOGIO_H

class Relogio{
  int h, m, s;
  public:
    Relogio(int = 0, int = 0, int = 0);
    ~Relogio();
    void setHora(int,int,int);
    void printHora();
    friend void alteraHMS(Relogio&);

};

#endif