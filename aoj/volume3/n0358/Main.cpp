#include <iostream>

using namespace std;

int main() {

    int m, f, b;
    cin >> m >> f >> b;

    if (m >= b) {
        cout << 0 << endl;
    } else if (m + f >= b) {
        cout << b - m << endl;
    } else {
        cout << "NA" << endl;
    }

    return 0;

}
