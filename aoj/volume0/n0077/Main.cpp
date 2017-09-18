#include <iostream>
#include <string>

using namespace std;

int main() {

    string input;

    while (cin >> input) {

        string decompressionStr;

        for (int i = 0; i < input.size(); i++) {

            if (input[i] == '@') {

                int times = input[i + 1] - '0';
                char ch = input[i + 2];

                for (int j = 0; j < times; j++) {
                    decompressionStr += ch;
                }

                i += 2;

            } else {
                decompressionStr += input[i];
            }

        }

        cout << decompressionStr << endl;

    }

    return 0;

}
