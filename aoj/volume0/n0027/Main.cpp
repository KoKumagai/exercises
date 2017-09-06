#include <iostream>

using namespace std;

int main() {

    const string WEEK_NAMES[] = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
    const int DAYS[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    while (1) {

        int month, day;
        cin >> month >> day;

        if (!(month || day)) {
            return 0;
        }

        for (int i = 0; i < month; i++) {
            day += DAYS[i];
        }

        cout << WEEK_NAMES[day % 7] << endl;

    }

    return 0;

}
