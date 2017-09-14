#include <iostream>
#include <string>

using namespace std;

int main() {

    string str;
    getline(cin, str);

    for (int i = 0; i < str.size(); i++) {

        if (i < str.size() - 4 && str[i] == 'a' && str[i + 1] == 'p' && str[i + 2] == 'p' && str[i + 3] == 'l' && str[i + 4] == 'e') {
            str[i] = 'p';
            str[i + 1] = 'e';
            str[i + 2] = 'a';
            str[i + 3] = 'c';
            str[i + 4] = 'h';
        } else if (i < str.size() - 4 && str[i] == 'p' && str[i + 1] == 'e' && str[i + 2] == 'a' && str[i + 3] == 'c' && str[i + 4] == 'h') {
            str[i] = 'a';
            str[i + 1] = 'p';
            str[i + 2] = 'p';
            str[i + 3] = 'l';
            str[i + 4] = 'e';
        }

    }

    cout << str << endl;

    return 0;

}
