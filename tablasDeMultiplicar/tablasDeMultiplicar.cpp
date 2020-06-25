#include <iostream>
using namespace std;
int main(){
    int num,lim,prod;
    cout <<"Este programa le ayuda a realizar tablas de multiplicar"<<endl;
    cout <<"Inserte el numero para el que quiera realizar la tabla"<<endl;
    cin>>num;
    cout <<"Inserte el límite para la tabla"<<endl;
    cin>>lim; 
    for(int i=0;i<=lim;i=i+1){
        prod=i*num;
        cout << i << "x" << num << "=" << prod <<endl;
    } 
    if(num%2==0)
        cout <<"El producto es par"<<endl;
    else
        cout <<"El producto es impar"<<endl;
    return 0;
} 