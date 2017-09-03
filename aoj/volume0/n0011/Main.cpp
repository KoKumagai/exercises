#include <iostream>

using namespace std;

int main() {

    int w, n;

    cin >> w >> n;

    int lines[w];

    for (int i = 0; i < w; i++) {
        lines[i] = i + 1;
    }

    for (int i = 0; i < n; i++) {

        int a, b;
        char comma;

        cin >> a >> comma >> b;

        swap(lines[a - 1], lines[b - 1]);

    }

    for (int i = 0; i < w; i++) {
        cout << lines[i] << endl;
    }

}
