#include <iostream>

using namespace std;

int main() {

    int AGE;
    cin >> AGE;

    if (15 <= AGE) {
        cout << AGE - 7 << endl;
    } else {
        cout << -1 << endl;
    }

    return 0;

}
