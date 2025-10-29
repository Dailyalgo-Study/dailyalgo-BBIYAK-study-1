#include <string>
#include <vector>

using namespace std;

string solution(string hangul_numbers)
{
    vector<vector<string>> replace_strings =
    {
        {"��", "0"}, {"��", "0"},
        {"��", "1"}, {"�ϳ�", "1"},
        {"��", "2"}, {"��", "2"},
        {"��", "3"}, {"��", "3"},
        {"��", "4"}, {"��", "4"},
        {"��", "5"}, {"�ټ�", "5"},
        {"��", "6"}, {"����", "6"},
        {"ĥ", "7"}, {"�ϰ�", "7"},
        {"��", "8"}, {"����", "8"},
        {"��", "9"}, {"��ȩ", "9"}
    };

    sort(begin(replace_strings), end(replace_strings), [](const auto& a, const auto& b)
        {
            return a[0].length() > b[0].length();
        });

    for (const auto& pair : replace_strings)
    {
        const string& hangul = pair[0];
        const string& num = pair[1];
        size_t pos = 0;

        while ((pos = hangul_numbers.find(hangul, pos)) != string::npos)
        {
            hangul_numbers.replace(pos, hangul.length(), num);
            pos += num.length();
        }
    }

    return hangul_numbers;
}
