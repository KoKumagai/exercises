#include <iostream>

using namespace std;

int main() {

    int N, K;
    cin >> N >> K;

    if (K == 0 || K > N) {
        cout << 0 << endl;
        return 0;
    }

    if (N % 2 == 1 && K == (N + 1) / 2) {
        cout << N - 1 << endl;
    } else {
        cout << N - 2 << endl;
    }

    return 0;

}
