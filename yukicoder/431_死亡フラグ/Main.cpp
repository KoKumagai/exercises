#include <iostream>

using namespace std;

int main() {

    int deadFlag1, deadFlag2, deadFlag3;
    cin >> deadFlag1 >> deadFlag2 >> deadFlag3;

    int deadFlagSum = deadFlag1 + deadFlag2 + deadFlag3;

    int survivedFlag;
    cin >> survivedFlag;

    if (survivedFlag == 1 || deadFlagSum < 2) {
        cout << "SURVIVED" << endl;
    } else {
        cout << "DEAD" << endl;
    }

    return 0;

}
