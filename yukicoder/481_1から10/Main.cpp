#include <iostream>

using namespace std;

int main() {

    for (int i = 1; i <= 9; i++) {

        int num;
        cin >> num;

        if (num != i) {
            cout << i << endl;
            return 0;
        }

    }

    cout << 10 << endl;

    return 0;

}
