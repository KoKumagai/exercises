#include <iostream>

using namespace std;

void print(int A[], int n) {

    for (int i = 0; i < n; i++) {

        if (i != 0) {
            cout << ' ';
        }

        cout << A[i];

    }

    cout << endl;

}

void insertionSort(int A[], int n) {

    for (int i = 0; i < n; i++) {

        int key = A[i];
        int j = i - 1;

        while (j >= 0 && A[j] > key) {
            A[j + 1] = A[j];
            j--;
        }

        A[j + 1] = key;

        print(A, n);

    }

}

int main() {

    int N;
    cin >> N;

    int A[N];

    for (int i = 0; i < N; i++) {
        cin >> A[i];
    }

    insertionSort(A, N);

    return 0;

}
