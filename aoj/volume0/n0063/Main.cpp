#include <iostream>
#include <string>

using namespace std;

int main() {

    int palindromeCount = 0;

    string input;
    while (cin >> input) {

        int head = 0;
        int tail = input.size() - 1;

        bool isPalindrome = true;

        while (head < tail) {

            if (input[head] != input[tail]) {
                isPalindrome = false;
                break;
            }

            head++;
            tail--;

        }

        if (isPalindrome) {
            palindromeCount++;
        }

    }

    cout << palindromeCount << endl;

    return 0;

}
