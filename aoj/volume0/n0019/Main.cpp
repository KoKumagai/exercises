#include <iostream>

using namespace std;

int main() {

    int num;
    cin >> num;

    long long factorial = 1;

    for (int i = 1; i <= num; i++) {
        factorial *= i;
    }

    cout << factorial << endl;

    return 0;

}
