#include <iostream>
#include "RelogioFriend.h"

Relogio::Relogio(int h, int m, int s): h(h), m(m), s(s){}

void Relogio::setHora(int h, int m, int s){
  this->h = h;
  this->m = m;
  this->s = s;
}

void Relogio::printHora(){
  std::cout << h << ":" << m << ":" << s << std::endl;
}

void alteraHMS(Relogio& r){
  r.h = 10;
  r.m = 5;
  r.s = 0;
}

Relogio::~Relogio(){}