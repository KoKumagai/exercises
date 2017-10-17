#include <iostream>

using namespace std;

int main() {

    for (int i = 1; i <= 4; i++) {

        int ticket, quantity;
        cin >> ticket >> quantity;

        int amount = 0;

        switch (ticket) {

            case 1 :
                amount = 6000 * quantity;
                break;
            case 2 :
                amount = 4000 * quantity;
                break;
            case 3 :
                amount = 3000 * quantity;
                break;
            case 4 :
                amount = 2000 * quantity;
                break;

        }

        cout << amount << endl;

    }

    return 0;

}
