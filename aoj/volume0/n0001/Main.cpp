#include<iostream>
#include<algorithm>

using namespace std;

const int SIZE = 10;

int main() {

    int mountains[SIZE];

    for (int i = 0; i < SIZE; i++) {
        cin >> mountains[i];
    }

    sort(mountains, mountains + SIZE);

    cout << mountains[SIZE - 1] << endl;
    cout << mountains[SIZE - 2] << endl;
    cout << mountains[SIZE - 3] << endl;

}
