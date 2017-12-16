#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main() {

    int N;
    cin >> N;

    vector<int> x(N);

    for (int i = 0; i < N; i++) {
        cin >> x[i];
    }

    sort(x.begin(), x.end());

    int answer = x[N - 1];

    for (int i = 0; i < N - 1; i++) {
        answer += x[i] / 2;
    }

    cout << answer << endl;

    return 0;

}
