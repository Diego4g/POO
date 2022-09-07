#ifndef LIVRO_H_INCLUDED
#define LIVRO_H_INCLUDED
#include <string>
#include <vector>
#include <list>
#include <map>

using std::string;
using namespace std;

// Criação da classe Livroo
class Livro{
    vector<string> escritores;
    vector<string> capitulos;
    vector<string> keywords;
    string titulo;
    int anoPublicacao;
    string idiomaOriginal;
    //map<int, AudioBook> Ab;

    public:
        // Construtores
        Livro(vector<string>,
            vector<string>,
            vector<string>,
            string = "",
            int = 0,
            string = ""
            );
        Livro();

        // Getters e setters
        void setEscritores(vector<string>);
        vector<string> getEscritores() const;

        void setTitulo(string);
        string getTitulo() const;

        void setCapitulos(vector<string>);
        vector<string> getCapitulos() const;

        void setAnoPublicacao(int);
        int getAnoPublicacao() const;

        void setIdiomaOriginal(string);
        string getIdiomaOriginal() const;

        void setKeywords(vector<string>);
        vector<string> getKeywords() const;

        friend ostream& operator<<(ostream& out, const Livro&);
};
#endif