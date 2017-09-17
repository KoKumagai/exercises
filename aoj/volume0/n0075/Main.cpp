#include <iostream>

using namespace std;

int main() {

    int id;
    char comma;
    double weight, height;

    while (cin >> id >> comma >> weight >> comma >> height) {

        double ibm = weight / (height * height);

        if (ibm >= 25.0) {
            cout << id << endl;
        }

    }

    return 0;

}
