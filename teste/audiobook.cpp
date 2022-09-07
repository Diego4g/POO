#include "audiobook.h"
#include <iostream>
#include <list>
#include "livro.h"
using std::cout;
using namespace std;

AudioBook::AudioBook() {
    Livro();
    setDuracao(0.0);
    setFormatoAudio("");
}

AudioBook::AudioBook(
    vector<string> escritores,
    vector<string> capitulos,
    vector<string> keywords,
    string titulo,
    int anoPublicacao,
    string idiomaOriginal,
    float duracao,
    string formatoAudio) : 
    Livro(escritores, capitulos, keywords, titulo, anoPublicacao, idiomaOriginal),
    duracao (duracao),
    formatoAudio (formatoAudio) {}

void AudioBook::setDuracao(float duracao){
    this->duracao = duracao;
}

float AudioBook::getDuracao() const{
    return duracao;
}

void AudioBook::setFormatoAudio(string formatoAudio){
    this->formatoAudio = formatoAudio;
}

string AudioBook::getFormatoAudio() const{
    return formatoAudio;
}

/* ostream& operator<<(ostream& out, const AudioBook& audiobook ) {

        out << audiobook.getTitulo() << endl
            << audiobook.getAnoPublicacao() << endl
            << audiobook.getIdiomaOriginal() << endl
            << audiobook.duracao << endl
            << audiobook.formatoAudio<< endl;

    return out;   
} */