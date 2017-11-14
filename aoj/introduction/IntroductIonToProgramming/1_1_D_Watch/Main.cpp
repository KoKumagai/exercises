#include <iostream>

using namespace std;

int main() {

    int x;
    cin >> x;

    int h, m, s;
    h = x / 60 / 60;
    m = x / 60 % 60;
    s = x % 60;

    cout << h << ":" << m << ":" << s << endl;

    return 0;

}
