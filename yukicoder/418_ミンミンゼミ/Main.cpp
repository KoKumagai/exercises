#include <iostream>
#include <string>

using namespace std;

int main() {

    string S;
    cin >> S;

    int count = 0;

    for (int i = 0; i < S.length(); i++) {

        if (S[i] == 'n') {
            count++;
        }

    }

    cout << count << endl;

    return 0;

}
