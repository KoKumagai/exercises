#include <iostream>
#include <string>

using namespace std;

int main() {

    string str;
    cin >> str;

    if (str == "ham") {
        cout << "ham" << endl;
    } else {
        cout << str + "ham" << endl;
    }

    return 0;

}
