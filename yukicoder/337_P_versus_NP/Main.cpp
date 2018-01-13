#include <iostream>

using namespace std;

int main() {

    int N, P;
    cin >> N >> P;

    if (P == (N * P)) {
        cout << "=" << endl;
    } else {
        cout << "!=" << endl;
    }

    return 0;

}
