#include <iostream>

using namespace std;

int main() {

    int a, b, c;
    char comma;

    int rectangles = 0;
    int parallelograms = 0;

    while (cin >> a >> comma >> b >> comma >> c) {

        if (a * a + b * b == c * c) {
            rectangles++;
        }

        if (a == b) {
            parallelograms++;
        }

    }

    cout << rectangles << endl << parallelograms << endl;

}
