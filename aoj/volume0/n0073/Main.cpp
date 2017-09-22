#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

int main() {

    double x, h;

    while (cin >> x >> h) {

        if (x == 0 && h == 0) {
            break;
        }

        double heightTriangle = sqrt(x * x / 4 + h * h);
        double areaTriangle = x * heightTriangle / 2;

        double areaSquare = x * x;

        double surfaceAreaCone = areaSquare + areaTriangle * 4;

        printf("%lf\n", surfaceAreaCone);

    }

    return 0;

}
