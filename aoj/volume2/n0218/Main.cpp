#include <iostream>

using namespace std;

int main() {

    while (true) {

        int n;
        cin >> n;

        if (n == 0) {
            break;
        }

        for (int i = 0; i < n; i++) {

            int math, english, japanese;
            cin >> math >> english >> japanese;

            if (math == 100 || english == 100 || japanese == 100) {
                cout << 'A' << endl;
                continue;
            }

            if (90 <= (math + english) / 2) {
                cout << 'A' << endl;
                continue;
            }

            if (80 <= (math + english + japanese) / 3) {
                cout << 'A' << endl;
                continue;
            }

            if (70 <= (math + english + japanese) / 3) {
                cout << 'B' << endl;
                continue;
            }

            if ((50 <= (math + english + japanese) / 3) && (80 <= math || 80 <= english)) {
                cout << 'B' << endl;
                continue;
            }

            cout << 'C' << endl;

        }

    }

    return 0;

}
