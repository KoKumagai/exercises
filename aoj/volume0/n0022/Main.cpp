#include <iostream>

using namespace std;

int main() {

    while (1) {

        int n;
        cin >> n;

        if (n == 0) {
            break;
        }

        int sum = 0;
        int max;

        for (int i = 0; i < n; i++) {

            int a;
            cin >> a;

            if (i == 0) {
                max = a;
            }

            if (a < (sum + a)) {
                sum += a;
            } else {
                sum = a;
            }

            if (max < sum) {
                max = sum;
            }

        }

        cout << max << endl;

    }

    return 0;

}
