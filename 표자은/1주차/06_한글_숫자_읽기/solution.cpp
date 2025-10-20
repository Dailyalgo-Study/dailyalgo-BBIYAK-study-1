#include <string>
#include <vector>
#include <unordered_map>
#include <iostream>
using namespace std;

string solution(string hangul_numbers) {
	string answer = "";
	unordered_map<string, char> umap2 = {
		{"�ϳ�", '1'}, {"�ټ�", '5'}, {"����", '6'}, {"�ϰ�", '7'},
		{"����", '8'}, {"��ȩ", '9'}
	};
	unordered_map<string, char> umap1 = {
		{"��", '0'}, {"��", '0'}, {"��", '1'}, {"��", '2'}, {"��", '2'},
		{"��", '3'}, {"��", '3'}, {"��", '4'}, {"��", '4'}, {"��", '5'},
		{"��", '6'}, {"ĥ", '7'}, {"��", '8'}, {"��", '9'}
	};


	for (auto m : umap2)
	{
		if (hangul_numbers.find(m.first) != string::npos)
		{
			auto it = hangul_numbers.find(m.first);
			hangul_numbers.replace(it, m.first.length(), string(1, m.second));
		}
	}
	for (auto m : umap1)
	{
		if (hangul_numbers.find(m.first) != string::npos)
		{
			auto it = hangul_numbers.find(m.first);
			hangul_numbers.replace(it, m.first.length(), string(1, m.second));
		}
	}

	answer = hangul_numbers;
	return answer;
}
