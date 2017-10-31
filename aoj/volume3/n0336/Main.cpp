#include <iostream>

using namespace std;

int main() {

    int height, radius;
    cin >> height >> radius;

    int sum = height + radius;

    if (sum == 0) {
        cout << 0 << endl;
    } else if (sum > 0) {
        cout << 1 << endl;
    } else if (sum < 0) {
        cout << -1 << endl;
    }

    return 0;

}
