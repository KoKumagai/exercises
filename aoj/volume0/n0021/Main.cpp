#include <iostream>

using namespace std;

int main() {

    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {

        float x1, y1, x2, y2, x3, y3, x4, y4;
        cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x4 >> y4;

        float slope1 = (y1 - y2) / (x1 - x2);
        float slope2 = (y3 - y4) / (x3 - x4);

        if (slope1 == slope2) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }

    }

    return 0;

}
