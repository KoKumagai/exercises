#include <iostream>
#include <string>

using namespace std;

int main() {

    while (true) {

        string digits;
        getline(cin, digits);

        if (digits[0] - '0' == 0) {
            break;
        }

        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            sum += digits[i] - '0';
        }

        cout << sum << endl;

    }

    return 0;

}
