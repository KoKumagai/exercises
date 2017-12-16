#include <iostream>
#include <string>

using namespace std;

int main() {

    string N;
    cin >> N;

    if (N == "0") {
        cout << N << endl;
        return 0;
    }

    cout << N + "0" << endl;

    return 0;

}
