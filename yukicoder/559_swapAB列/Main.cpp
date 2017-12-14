#include <iostream>
#include <string>

using namespace std;

int main() {

    string S;
    cin >> S;

    int aCount = 0;
    int numSwap = 0;

    for (int i = 0; i < S.length(); i++) {

        if (S[i] == 'A') {
            numSwap += i - aCount;
            aCount++;
        }

    }

    cout << numSwap << endl;

    return 0;

}
