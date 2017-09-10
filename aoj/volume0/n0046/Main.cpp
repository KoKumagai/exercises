#include <iostream>

using namespace std;

int main() {

    float min, max;
    cin >> min;
    max = min;

    float height;

    while (cin >> height) {

        if (height < min) {
            min = height;
        }

        if (height > max) {
            max = height;
        }

    }

    cout << max - min << endl;

    return 0;

}
