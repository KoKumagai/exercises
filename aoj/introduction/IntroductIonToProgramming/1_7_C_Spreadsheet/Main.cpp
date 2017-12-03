#include <iostream>

using namespace std;

int main() {

    int r, c;
    cin >> r >> c;

    int sheet[r + 1][c + 1] = {};

    int sum = 0;

    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {

            int num;
            cin >> num;

            sheet[i][j] = num;
            sheet[r][j] += num;
            sheet[i][c] += num;
            sum += num;

        }
    }

    sheet[r][c] = sum;

    for (int i = 0; i < r + 1; i++) {
        for (int j = 0; j < c + 1; j++) {

            cout << sheet[i][j];

            if (j < c) {
                cout << ' ';
            }

        }
        cout << endl;
    }

    return 0;

}
