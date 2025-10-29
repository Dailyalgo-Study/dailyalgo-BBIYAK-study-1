#include <string>
#include <vector>

using namespace std;

string solution(string hangul_numbers)
{
    vector<vector<string>> replace_strings =
    {
        {"°ø", "0"}, {"¿µ", "0"},
        {"ÀÏ", "1"}, {"ÇÏ³ª", "1"},
        {"ÀÌ", "2"}, {"µÑ", "2"},
        {"»ï", "3"}, {"¼Â", "3"},
        {"»ç", "4"}, {"³Ý", "4"},
        {"¿À", "5"}, {"´Ù¼¸", "5"},
        {"À°", "6"}, {"¿©¼¸", "6"},
        {"Ä¥", "7"}, {"ÀÏ°ö", "7"},
        {"ÆÈ", "8"}, {"¿©´ü", "8"},
        {"±¸", "9"}, {"¾ÆÈ©", "9"}
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
