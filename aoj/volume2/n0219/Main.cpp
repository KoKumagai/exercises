#include <iostream>

using namespace std;

int main() {

    while (true) {

        int n;
        cin >> n;

        if (n == 0) {
            break;
        }

        int numIceCreams[10] = {0};

        for (int i = 0; i < n; i++) {

            int num;
            cin >> num;
            numIceCreams[num]++;

        }

        for (int i = 0; i < 10; i++) {

            if (numIceCreams[i] == 0) {
                cout << "-" << endl;
                continue;
            }

            for (int j = 0; j < numIceCreams[i]; j++) {
                cout << "*";
            }

            cout << endl;

        }

    }

    return 0;

}
