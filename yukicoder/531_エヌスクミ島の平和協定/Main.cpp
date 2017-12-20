#include <iostream>

using namespace std;

int main() {

    int n, m;
    cin >> n >> m;

    if (n <= m) {
        cout << 1 << endl;
        return 0;
    }

    if (n % 2 == 0 && n / 2 <= m) {
        cout << 2 << endl;
    } else {
        cout << -1 << endl;
    }

    return 0;

}
