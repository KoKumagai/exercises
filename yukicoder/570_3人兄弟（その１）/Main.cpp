#include <iostream>

using namespace std;

int main() {

    int ha, hb, hc;
    cin >> ha >> hb >> hc;

    if (ha > hb && hb > hc) {
        cout << 'A' << endl;
        cout << 'B' << endl;
        cout << 'C' << endl;
    } else if (ha > hc && hc > hb) {
        cout << 'A' << endl;
        cout << 'C' << endl;
        cout << 'B' << endl;
    } else if (hb > ha && ha > hc) {
        cout << 'B' << endl;
        cout << 'A' << endl;
        cout << 'C' << endl;
    } else if (hb > hc && hc > ha) {
        cout << 'B' << endl;
        cout << 'C' << endl;
        cout << 'A' << endl;
    } else if (hc > ha && ha > hb) {
        cout << 'C' << endl;
        cout << 'A' << endl;
        cout << 'B' << endl;
    } else if (hc > hb && hb > ha) {
        cout << 'C' << endl;
        cout << 'B' << endl;
        cout << 'A' << endl;
    }

    return 0;

}
