#include <iostream>
#include <string>

using namespace std;

int main() {

    string S;
    cin >> S;

    if (S.find("575") != string::npos) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }

    return 0;

}
