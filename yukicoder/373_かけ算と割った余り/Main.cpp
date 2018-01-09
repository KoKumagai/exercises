#include <iostream>

using namespace std;

int main() {

    long long A, B, C, D;
    cin >> A >> B >> C >> D;

    cout << A * B % D * C % D << endl;

    return 0;

}
