#include <iostream>

using namespace std;

int main() {

    int d;
    while (cin >> d) {

        int s = 0;

        for (int i = s; i < 600; i += d) {
            s += i * i * d;
        }

        cout << s << endl;

    }

    return 0;

}
