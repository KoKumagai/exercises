#include <iostream>

using namespace std;

int main() {

    while (1) {

        int num;
        cin >> num;

        if (num == 0) {
            break;
        }

        int tailZero = 0;

        for (int i = 5; i <= num; i *= 5) {
            tailZero += num / i;
        }

        cout << tailZero << endl;

    }

    return 0;

}
