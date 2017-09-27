#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

int main() {

    double x = 0;
    double y = 0;

    int theta = 90;

    while (1) {

        int distance, angle;
        scanf("%d,%d", &distance, &angle);

        if (distance == 0 && angle == 0) {
            break;
        }

        double radius = theta * M_PI / 180.0;

        x += distance * cos(radius);
        y += distance * sin(radius);

        theta -= angle;

    }

    cout << (int) x << endl << (int) y << endl;

    return 0;

}
