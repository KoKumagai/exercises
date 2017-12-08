#include <cmath>
#include <iostream>

using namespace std;

bool isPrime(int n) {

    if (n == 2) {
        return true;
    }

    if (n < 2 || n % 2 == 0) {
        return false;
    }

    for (int i = 3; i <= sqrt(n); i += 2) {

        if (n % i == 0) {
            return false;
        }

    }

    return true;

}

int main() {

    int n;
    cin >> n;

    int count = 0;

    for (int i = 0; i < n; i++) {

        int num;
        cin >> num;

        if (isPrime(num)) {
            count++;
        }

    }

    cout << count << endl;

    return 0;

}
