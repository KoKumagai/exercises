#include <iostream>

using namespace std;

int main() {

    string input;
    char ball = 'A';

    while (cin >> input) {

        char change1 = input[0];
        char change2 = input[2];

        if (ball == change1) {
            ball = change2;
        } else if (ball == change2) {
            ball = change1;
        }

    }

    cout << ball << endl;

    return 0;

}
