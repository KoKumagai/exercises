#include <iostream>

using namespace std;

int main() {

    int gole, perBigJump;
    cin >> gole >> perBigJump;

    int bigJump = gole / perBigJump;
    int smallJump = gole % perBigJump;

    int jumpMin = bigJump + smallJump;

    cout << jumpMin << endl;

    return 0;

}
