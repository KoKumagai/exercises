#include <iostream>

using namespace std;

int main() {

    int a, b, c;
    cin >> a >> b >> c;

    int numberOfDivisors = 0;

    for (int i = a; i <= b; i++) {

        if (c % i == 0) {
            numberOfDivisors++;
        }

    }

    cout << numberOfDivisors << endl;

    return 0;

}
