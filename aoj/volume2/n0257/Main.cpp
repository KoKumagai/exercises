#include <iostream>

using namespace std;

int main() {

    int basicTicket, expressTicket, basicExpressTicket;
    cin >> basicTicket >> expressTicket >> basicExpressTicket;

    if ((basicTicket == 1 && expressTicket == 1) || (basicExpressTicket == 1)) {
        cout << "Open" << endl;
    } else {
        cout << "Close" << endl;
    }

    return 0;

}
