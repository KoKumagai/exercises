#include <iostream>

using namespace std;

int main() {

    while (true) {

        int waterUsed;
        cin >> waterUsed;

        if (waterUsed == -1) {
            break;
        }

        int cost = 1150;

        if (waterUsed > 30) {
            cost += (waterUsed - 30) * 160;
            waterUsed -= waterUsed - 30;
        }

        if (waterUsed > 20) {
            cost += (waterUsed - 20) * 140;
            waterUsed -= waterUsed - 20;
        }

        if (waterUsed > 10) {
            cost += (waterUsed - 10) * 125;
        }

        cout << 4280 - cost << endl;

    }

    return 0;

}
