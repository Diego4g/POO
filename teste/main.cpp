#include <string>
#include <sstream>
#include <algorithm>
#include <iterator>

#include <iostream>
#include <fstream>
#include <vector>
using namespace std;

#include "livro.h"
#include "audiobook.h"

int main(){

	//vector<vector<string>> readFiles(vector<string> book, vector<vector<string>> library, vector<string> escritores){
	// Lê todas as linhas de um arquivo e armazena os valores em um vetor chamado book.
	// Library é um vetor de vetores. Em cada posição tem um book armazenado.
	//vector<string> files = {"1.txt", "2.txt", "3.txt", "4.txt", "5.txt", "6.txt", "7.txt", "8.txt", "9.txt", "10.txt", "11.txt", "12.txt", "13.txt", "14.txt", "15.txt", "16.txt"};
	vector<string> book;
	vector<vector<string>> library;
	vector<string> files = {"1.txt"};
	string line;

	AudioBook obj3;
	int count;
	
	for(int i = 0; i <= (files.size()-1); i++){
		count = 0;
		ifstream file(files[i]);
		while (getline(file, line)) {

			count++;
			if(count == 1){
				if(line == "3"){
				}
			}
			if(count == 2){
					obj3.setTitulo(line);
				}
		if(count == 3){
					obj3.setEscritores({line});
			}
			if(count == 4){
					obj3.setAnoPublicacao(stoi(line));
			}
			if(count == 5){
					obj3.setIdiomaOriginal({line});
			}
			if(count == 6){
					obj3.setKeywords({line});
			}
			if(count == 7){
					obj3.setCapitulos({line});
			}
			if(count == 8){
					obj3.setDuracao(stof(line));
			} 
			if(count == 9){
					obj3.setFormatoAudio(line);
			}
		}

	}

	cout << "\n" << obj3.getTitulo();
	for (auto i: obj3.getEscritores()){
		cout << "\n" << i;
	}
	cout << "\n" << obj3.getAnoPublicacao();
	cout << "\n" << obj3.getIdiomaOriginal();
		for (auto i: obj3.getKeywords()){
		cout << "\n" <<  i;
	}
		for (auto i: obj3.getCapitulos()){
		cout << "\n" <<  i;
	}
	cout << "\n" << obj3.getDuracao();
	cout << "\n" << obj3.getFormatoAudio() << endl;

	//cout << "\n-------------------------------------------\n"; 

	//cout << obj3;

	
	return 0;
}