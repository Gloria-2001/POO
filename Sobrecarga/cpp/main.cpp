#include "Seconds.h"
#include <iostream>
using namespace std;

int main(){
    Seconds s00(20);
    Seconds s01(15,13);
    Seconds s02(6,7,55);

    s00.convert();
    s01.convert();
    s02.convert();

    cout<<s00.seg<<endl;
    cout<<s01.seg<<endl;
    cout<<s02.seg<<endl;

    return 0;
}