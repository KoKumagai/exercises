#include <iostream>

using namespace std;

int main() {

    bool cards[4][14] = {{0}};

    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {

        char suit;
        int rank;
        cin >> suit >> rank;

        switch (suit) {
            case 'S':
                cards[0][rank] = true;
                break;
            case 'H':
                cards[1][rank] = true;
                break;
            case 'C':
                cards[2][rank] = true;
                break;
            case 'D':
                cards[3][rank] = true;
                break;
        }

    }

    for (int i = 0; i < 4; i++) {
        for (int j = 1; j < 14; j++) {

            if (cards[i][j] == false) {

                switch (i) {
                    case 0:
                        cout << "S " << j << endl;
                        break;
                    case 1:
                        cout << "H " << j << endl;
                        break;
                    case 2:
                        cout << "C " << j << endl;
                        break;
                    case 3:
                        cout << "D " << j << endl;
                        break;
                }

            }

        }
    }

    return 0;

}
