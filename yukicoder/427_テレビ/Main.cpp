#include <iostream>

using namespace std;

int main() {

    long HEIGHT, WIDTH;
    cin >> HEIGHT >> WIDTH;

    if (WIDTH < HEIGHT) {
        cout << "TATE" << endl;
    } else if (HEIGHT < WIDTH){
        cout << "YOKO" << endl;
    }

    return 0;

}
