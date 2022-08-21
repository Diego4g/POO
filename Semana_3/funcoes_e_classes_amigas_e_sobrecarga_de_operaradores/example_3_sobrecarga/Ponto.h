#ifndef PONTO_H
#define PONTO_H

class Ponto {
  
  int x, y;

  public:
    Ponto(int=0, int=0);
    Ponto(const Ponto&);
    ~Ponto();
    void set(int,int);
    void set(const Ponto&);
    void print();

    Ponto& operator++();
    Ponto& operator++(int);

    Ponto operator+(const Ponto&) const;
    Ponto& operator=(const Ponto&);

    friend bool operator==(const Ponto&, const Ponto&);

    friend std::ostream& operator<<(std::ostream&, const Ponto&);

    friend std::istream& operator>>(std::istream&, Ponto&);
    
};

#endif