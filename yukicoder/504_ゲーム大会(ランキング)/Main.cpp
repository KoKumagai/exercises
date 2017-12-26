#include <iostream>

using namespace std;

int main() {

    int n, scoreK;
    cin >> n >> scoreK;

    int rank = 1;

    cout << rank << endl;

    for (int i = 1; i < n; i++) {

        int scoreOthers;
        cin >> scoreOthers;

        if (scoreOthers > scoreK) {
            rank++;
        }

        cout << rank << endl;

    }

    return 0;

}
