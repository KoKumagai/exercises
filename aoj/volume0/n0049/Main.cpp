#include <iostream>

using namespace std;

int main() {

    int id;
    char comma;
    string bloodType;
    int a = 0, b = 0, ab = 0, o = 0;

    while (cin >> id >> comma >> bloodType) {

        if (bloodType == "A") {
            a++;
        }

        if (bloodType == "B") {
            b++;
        }

        if (bloodType == "AB") {
            ab++;
        }

        if (bloodType == "O") {
            o++;
        }

    }

    cout << a << endl;
    cout << b << endl;
    cout << ab << endl;
    cout << o << endl;

    return 0;

}
