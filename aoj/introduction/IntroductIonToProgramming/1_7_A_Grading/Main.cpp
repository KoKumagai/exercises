#include <iostream>

using namespace std;

int main() {

    while (true) {

        int m, f, r;
        cin >> m >> f >> r;

        if (m == -1 && f == -1 && r == -1) {
            break;
        }

        if (m == -1 || f == -1) {
            cout << 'F' << endl;
            continue;
        }

        if (m + f >= 80) {
            cout << 'A' << endl;
            continue;
        }

        if (m + f >= 65) {
            cout << 'B' << endl;
            continue;
        }

        if (m + f >= 50) {
            cout << 'C' << endl;
            continue;
        }

        if (m + f >= 30) {

            if (r >= 50) {
                cout << 'C' << endl;
            } else {
                cout << 'D' << endl;
            }

            continue;

        }

        cout << 'F' << endl;

    }

    return 0;

}
