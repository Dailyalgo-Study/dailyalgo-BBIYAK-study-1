#include <string>
#include <vector>
#include <unordered_map>
#include <iostream>
using namespace std;

string solution(string hangul_numbers) {
	string answer = "";
	unordered_map<string, char> umap2 = {
		{"ÇÏ³ª", '1'}, {"´Ù¼¸", '5'}, {"¿©¼¸", '6'}, {"ÀÏ°ö", '7'},
		{"¿©´ü", '8'}, {"¾ÆÈ©", '9'}
	};
	unordered_map<string, char> umap1 = {
		{"°ø", '0'}, {"¿µ", '0'}, {"ÀÏ", '1'}, {"ÀÌ", '2'}, {"µÑ", '2'},
		{"»ï", '3'}, {"¼Â", '3'}, {"»ç", '4'}, {"³Ý", '4'}, {"¿À", '5'},
		{"À°", '6'}, {"Ä¥", '7'}, {"ÆÈ", '8'}, {"±¸", '9'}
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
