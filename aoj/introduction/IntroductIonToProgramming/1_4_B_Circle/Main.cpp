#include <cmath>
#include <cstdio>
#include <iostream>

using namespace std;

int main() {

    double r;
    cin >> r;

    double area = r * r * M_PI;
    double circumference = r * 2 * M_PI;

    printf("%lf %lf\n", area, circumference);

    return 0;

}
