#include <iostream>
#include <string>

using namespace std;

int main() {

    int redCount = 0;
    int blueCount = 0;

    for (int i = 0; i < 3; i++) {

        string color;
        cin >> color;

        if (color == "RED") {
            redCount++;
        } else if (color == "BLUE") {
            blueCount++;
        }

    }

    if (redCount > blueCount) {
        cout << "RED" << endl;
    } else {
        cout << "BLUE" << endl;
    }

    return 0;

}
