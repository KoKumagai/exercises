#include <iostream>

using namespace std;

int main() {

    bool isPrime[1000000];

    for (int i = 2; i < 1000000; i++) {
        isPrime[i] = true;
    }

    for (int i = 2; i * i < 1000000; i++) {

        if (isPrime[i]) {

            for (int j = i * i; j < 1000000; j += i) {
                isPrime[j] = false;
            }

        }

    }

    int numberOfPrime[1000000] = {0};

    for (int i = 1; i < 1000000; i++) {

        if (isPrime[i]) {
            numberOfPrime[i] = numberOfPrime[i - 1] + 1;
        } else {
            numberOfPrime[i] = numberOfPrime[i - 1];
        }

    }

    int n;

    while (cin >> n) {
        cout << numberOfPrime[n] << endl;
    }

    return 0;

}
