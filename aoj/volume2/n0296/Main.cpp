#include <iostream>

using namespace std;

int main() {

    int oneYenCoin, fiveYenCoin, tenYenCoin, fiftyYenCoin, oneHundredYenCoin, fiveHundredYenCoin;
    cin >> oneYenCoin >> fiveYenCoin >> tenYenCoin >> fiftyYenCoin >> oneHundredYenCoin >> fiveHundredYenCoin;

    int total = oneYenCoin + (fiveYenCoin * 5) + (tenYenCoin * 10) + (fiftyYenCoin * 50) + (oneHundredYenCoin * 100) + (fiveHundredYenCoin * 500);

    if (total >= 1000) {
        cout << 1 << endl;
    } else {
        cout << 0 << endl;
    }

    return 0;

}
