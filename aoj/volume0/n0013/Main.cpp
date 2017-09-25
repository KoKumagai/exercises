#include <iostream>
#include <stack>

using namespace std;

int main() {

    stack<int> stack;

    int num;
    while (cin >> num) {

        if (num == 0) {
            cout << stack.top() << endl;
            stack.pop();
        } else {
            stack.push(num);
        }

    }

    return 0;

}
