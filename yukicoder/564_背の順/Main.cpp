#include <iostream>

using namespace std;

int main() {

    int H, N;
    cin >> H >> N;

    int rank = 1;

    for (int i = 0; i < N - 1; i++) {

        int h;
        cin >> h;

        if (h > H) {
            rank++;
        }

    }

    if (rank % 10 == 1) {
        cout << rank << "st" << endl;
    } else if (rank % 10 == 2) {
        cout << rank << "nd" << endl;
    } else if(rank % 10 == 3) {
        cout << rank << "rd" << endl;
    } else {
        cout << rank << "th" << endl;
    }

    return 0;

}
