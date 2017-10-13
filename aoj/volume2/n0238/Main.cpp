#include <iostream>

using namespace std;

int main() {

    while (true) {

        int objective;
        cin >> objective;

        if (objective == 0) {
            break;
        }

        int numStudy;
        cin >> numStudy;

        int studyTime = 0;

        for (int i = 0; i < numStudy; i++) {

            int startTime, endTime;
            cin >> startTime >> endTime;

            studyTime += endTime - startTime;

        }

        if (objective <= studyTime) {
            cout << "OK" << endl;
        } else {
            cout << (objective - studyTime) << endl;
        }

    }

    return 0;

}
