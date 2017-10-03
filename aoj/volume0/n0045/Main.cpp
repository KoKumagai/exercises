#include <iostream>

using namespace std;

int main() {

    int totalPrice = 0;
    int totalQuantity = 0;
    int count = 0;

    int price, quantity;
    char comma;

    while (cin >> price >> comma >> quantity) {

        totalPrice += price * quantity;
        totalQuantity += quantity;

        count++;

    }

    int averageQuantity = (double) totalQuantity / count + 0.5;

    cout << totalPrice << endl;
    cout << averageQuantity << endl;

}
