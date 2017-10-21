#include <iostream>

using namespace std;

int main() {

    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {

        int stone;
        int player;
        cin >> stone >> player;

        int winner = stone % player;

        if (winner == 0) {
            winner = player;
        }

        cout << winner << endl;

    }

    return 0;

}
