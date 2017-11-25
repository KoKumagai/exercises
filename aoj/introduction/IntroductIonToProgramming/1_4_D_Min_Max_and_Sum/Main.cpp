#include <iostream>

using namespace std;

int main() {

    int n;
    cin >> n;

    int min = 1000000;
    int max = -1000000;
    long sum = 0;

    for (int i = 0; i < n; i++) {

        int a;
        cin >> a;

        sum += a;

        if (a < min) {
            min = a;
        }

        if (a > max) {
            max = a;
        }

    }

    cout << min << ' ' << max << ' ' << sum << endl;

    return 0;

}
