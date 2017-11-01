#include <algorithm>
#include <iostream>

using namespace std;

int main() {

    int sides[4];
    cin >> sides[0] >> sides[1] >> sides[2] >> sides[3];

    for (int i = 0; i < 4; i++) {
        cin >> sides[i];
    }

    sort(sides, sides + 4);

    if (sides[0] == sides[1] && sides[2] == sides[3]) {
        cout << "yes" << endl;
    } else {
        cout << "no" << endl;
    }

    return 0;

}
