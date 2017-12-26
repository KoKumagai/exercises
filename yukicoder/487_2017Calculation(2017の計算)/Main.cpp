#include <iostream>

using namespace std;

int main() {

    int M;
    cin >> M;

    long result = 1;

    for (int i = 0; i < 2017; i++) {
        result = result * 2017 * 2017 % M;
    }

    result += 2017;
    result %= M;

    cout << result << endl;

    return 0;

}
