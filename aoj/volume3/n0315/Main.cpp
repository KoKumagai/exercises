#include <iostream>

using namespace std;

int main() {

    int programmingScore;
    int mobileScore;
    int cgScore;
    cin >> programmingScore >> mobileScore >> cgScore;

    int totalScore = programmingScore + mobileScore + cgScore;

    cout << totalScore << endl;

    return 0;

}
