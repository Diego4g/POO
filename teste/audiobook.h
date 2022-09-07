#ifndef AUDIOBOOK_H_INCLUDED
#define AUDIOBOOK_H_INCLUDED

#include "livro.h"

#include <string>
#include <vector>
using std::string;
using namespace std;

class AudioBook : public Livro
{
    float duracao;
    string formatoAudio;

    public:
        AudioBook();

        AudioBook(
        vector<string>,
        vector<string>,
        vector<string>,
        string = "",
        int = 0,
        string = "",
        float = 0.0,
        string = ""
        );

        void setDuracao(float);
        float getDuracao() const;

        void setFormatoAudio(string);
        string getFormatoAudio() const;

        friend ostream& operator<<(ostream& out, const AudioBook&);

};

#endif