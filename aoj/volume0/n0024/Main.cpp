#include <iostream>

using namespace std;

int main() {

    double velocity;

    while (cin >> velocity) {

        double time = velocity / 9.8;
        double fallDistance = 4.9 * time * time;

        int floorCount = 1;

        while (1) {

            double height = 5 * floorCount - 5;

            if (fallDistance <= height) {
                break;
            }

            floorCount++;

        }

        cout << floorCount << endl;

    }

    return 0;

}
