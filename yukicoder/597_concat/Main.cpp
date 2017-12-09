#include <iostream>
#include <string>

using namespace std;

int main() {

    int N;
    cin >> N;

    string conStr;

    for (int i = 0; i < N; i++) {

        string str;
        cin >> str;

        conStr += str;

    }

    cout << conStr << endl;

    return 0;

}
