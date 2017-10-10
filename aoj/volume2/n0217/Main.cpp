#include <iostream>

using namespace std;

int main() {

    while (true) {

        int n;
        cin >> n;

        if (n == 0) {
            break;
        }

        int id = 0;
        int distanceMax = 0;

        for (int i = 0; i < n; i++) {

            int idCur;
            cin >> idCur;

            int distanceFirst, distanceSecond;
            cin >> distanceFirst >> distanceSecond;
            int distanceSum = distanceFirst + distanceSecond;

            if (distanceMax < distanceSum) {

                id = idCur;
                distanceMax = distanceSum;

            }

        }

        cout << id << " " << distanceMax << endl;

    }

    return 0;

}
