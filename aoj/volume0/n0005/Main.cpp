#include <iostream>

using namespace std;

int gcd(int a, int b) {

    int tmp = a % b;

    while (tmp != 0) {

        a = b;
        b = tmp;
        tmp = a % b;

    }

    return b;

}

int lcm(int a, int b) {
    return a / gcd(a, b) * b;
}

int main() {

    int a, b;

    while (cin >> a >> b) {

        cout << gcd(a, b) << " " << lcm(a, b) << endl;

    }

}
