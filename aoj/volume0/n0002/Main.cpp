#include <iostream>

using namespace std;

int main() {

    int a, b;

    while (cin >> a >> b) {

        int sum = a + b;

        int digit = 0;

        while (sum > 0) {

            sum /= 10;
            digit++;

        }

        cout << digit << endl;

    }

    return 0;

}
