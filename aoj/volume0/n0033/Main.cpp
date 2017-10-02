#include <iostream>
#include <string>

using namespace std;

int main() {

    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {

        int cylinder1 = 0;
        int cylinder2 = 0;

        string answer = "YES";

        for (int j = 0; j < 10; j++) {

            int ball;
            cin >> ball;

            if (ball > cylinder1) {
                cylinder1 = ball;
            } else if (ball > cylinder2) {
                cylinder2 = ball;
            } else if (ball < cylinder1 && ball < cylinder2) {
                answer = "NO";
            }

        }

        cout << answer << endl;

    }

    return 0;

}
