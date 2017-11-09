#include <iostream>
#include <string>

using namespace std;

int main() {

    const string DAYS[7] = {"thu", "fri" , "sat", "sun", "mon", "tue", "wed"};

    int x;
    cin >> x;

    string day = DAYS[x % 7];
    cout << day << endl;

    return 0;

}
