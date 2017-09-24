#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

int main() {

    int n;
    cin >> n;

    while (n--) {

        double x1, y1, x2, y2, x3, y3;

        cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3;

        double a1 = 2 * (x2 - x1);
        double b1 = 2 * (y2 - y1);
        double c1 = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;

        double a2 = 2 * (x3 - x1);
        double b2 = 2 * (y3 - y1);
        double c2 = x1 * x1 - x3 * x3 + y1 * y1 - y3 * y3;

        double px = (b1 * c2 - c1 * b2) / (b2 * a1 - b1 * a2);
        double py = (a2 * c1 - a1 * c2) / (b2 * a1 - a2 * b1);

        double r = sqrt((x1 - px) * (x1 - px) + (y1 - py) * (y1 - py));

        printf("%.3f %.3f %.3f\n", px, py, r);

    }

    return 0;

}
