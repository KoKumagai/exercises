#include <iostream>

using namespace std;

int main() {

    int nums[5];

    for (int i = 0; i < 5; i++) {
        cin >> nums[i];
    }

    for (int i = 0; i < 5; i++) {

        for (int j = 0; j < 4; j++) {

            if (nums[j] < nums[j + 1]) {

                int tmp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = tmp;

            }

        }

    }

    for (int i = 0; i < 4; i++) {
        cout << nums[i] << " ";
    }

    cout << nums[4] << endl;

}
