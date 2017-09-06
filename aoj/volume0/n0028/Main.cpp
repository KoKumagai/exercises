#include <iostream>

using namespace std;

int main() {

    int num;
    int numsCount[101] = {0};
    int max = 0;

    while (cin >> num) {

        numsCount[num] += 1;

        if (numsCount[num] > max) {
            max = numsCount[num];
        }

    }

    for (int i = 1; i <= 100; i++) {

        if (numsCount[i] == max) {
            cout << i << endl;
        }

    }

    return 0;

}
