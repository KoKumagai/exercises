#include <iostream>

using namespace std;

int main() {

    int i = 0;

    while (true) {

        int x;
        cin >> x;

        if (x == 0) {
            break;
        }

        cout << "Case " << ++i << ": " << x << endl;

    }

    return 0;

}
