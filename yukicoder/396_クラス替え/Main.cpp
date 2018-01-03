#include <iostream>

using namespace std;

int main() {

    int students, groups, hanakoRank, taroRank;
    cin >> students >> groups >> hanakoRank >> taroRank;

    if ((hanakoRank - taroRank) % (2 * groups) == 0) {
        cout << "YES" << endl;
        return 0;
    }

    if ((hanakoRank + taroRank) % (2 * groups) == 1) {
        cout << "YES" << endl;
        return 0;
    }

    cout << "NO" << endl;

    return 0;

}
