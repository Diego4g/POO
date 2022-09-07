#include "livro.h"
#include <iostream>
#include <string> 
#include <vector>
#include <list>

using namespace std;
using std::cout;

Livro::Livro(vector<string> escritores, 
            vector<string> capitulos,
            vector<string> keywords,
            string titulo, 
            int anoPublicacao,
            string idiomaOriginal
            ):escritores (escritores),
                 titulo (titulo),
                 capitulos (capitulos),
                 anoPublicacao (anoPublicacao),
                 idiomaOriginal (idiomaOriginal),
                 keywords (keywords) {}

Livro::Livro(){
    setTitulo("");
    setEscritores({});
    setCapitulos({});
    setKeywords({});
    setAnoPublicacao(0);
    setIdiomaOriginal("");
}


void Livro::setEscritores(vector<string> escritores){
    this->escritores = escritores;
}

vector<string> Livro::getEscritores() const{
    return escritores;
}

void Livro::setTitulo(string titulo){
    this->titulo = titulo;
}

string Livro::getTitulo() const{
    return titulo;
}

void Livro::setCapitulos(vector<string> capitulos){
    this->capitulos = capitulos;
}

vector<string> Livro::getCapitulos() const{
    return capitulos;
}

void Livro::setAnoPublicacao(int anoPublicacao){
    this->anoPublicacao = anoPublicacao;
}

int Livro::getAnoPublicacao() const{
    return anoPublicacao;
}

void Livro::setIdiomaOriginal(string idiomaOriginal){
    this->idiomaOriginal = idiomaOriginal;
}

string Livro::getIdiomaOriginal() const{
    return idiomaOriginal;
}

void Livro::setKeywords(vector<string> keywords){
    this->keywords = keywords;
}

vector<string> Livro::getKeywords() const{
    return keywords;
}

/* ostream& operator<<(ostream& out, const Livro& livro) {
    for (auto item = livro.Ab.begin(); 
              item!= livro.Ab.end();
              item++){

    out << item->first << endl
        << item->second << endl;
        }
    return out;
} */