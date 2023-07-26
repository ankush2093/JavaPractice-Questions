#include <iostream>
using namespace std;

int main()
{
    int no;

    cout << "Enter a no: ";
    cin >> no;

    (no & 1 && cout << "odd") || cout << "even";

    return 0;
}
