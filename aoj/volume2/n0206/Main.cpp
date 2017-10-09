#include <iostream>

using namespace std;

int main() {

    while (true) {

        int expense;
        cin >> expense;

        if (expense == 0) {
            break;
        }

        int takedMonths = 0;

        for (int i = 1; i <= 12; i++) {

            int income, expenditure;
            cin >> income >> expenditure;

            expense -= income - expenditure;

            if (expense <= 0 && takedMonths == 0) {
                takedMonths = i;
            }

        }

        if (takedMonths != 0) {
            cout << takedMonths << endl;
        } else {
            cout << "NA" << endl;
        }

    }

    return 0;

}
