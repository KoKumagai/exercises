#include <iostream>

using namespace std;

int main() {

    int N;
    cin >> N;

    int trueAnswer = 0;

    for (int i = 0; i < N; i++) {
        int tmp;
        cin >> tmp;

        trueAnswer += tmp;
    }

    int yukiAnswer;
    cin >> yukiAnswer;

    cout << trueAnswer - yukiAnswer;

    return 0;

}
