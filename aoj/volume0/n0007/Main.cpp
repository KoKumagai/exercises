#include<iostream>

using namespace std;

int main() {

    int debt = 100000;

    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {

        debt = debt * 1.05;

        int fraction = debt % 1000;

        if (fraction > 0) {
            debt = debt - fraction + 1000;
        }

    }

    cout << debt << endl;

    return 0;

}
