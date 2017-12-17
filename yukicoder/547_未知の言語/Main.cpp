#include <iostream>
#include <string>

using namespace std;

int main() {

    int N;
    cin >> N;

    string S[N];
    string T[N];

    for (int i = 0; i < N; i++) {
        cin >> S[i];
    }

    for (int i = 0; i < N; i++) {
        cin >> T[i];
    }

    for (int i = 0; i < N; i++) {

        if (S[i] != T[i]) {
            cout << i + 1 << endl;
            cout << S[i] << endl;
            cout << T[i] << endl;
            break;
        }

    }

    return 0;

}
