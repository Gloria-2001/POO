#include <iostream>
using namespace std;

/*  Interfaz  */

class Fraccion{
    public:
        int numerador;
        int denominador;
        Fraccion(int,int);
        void suma(Fraccion);
        void resta(Fraccion);
        void imprimir();
};

/*  Implementacion  */

Fraccion::Fraccion(int num, int dem){
    numerador = num;
    denominador = dem;
}

void Fraccion::suma(Fraccion A){
    int denRes = denominador * A.denominador;
    int numRes = (numerador*A.denominador) + (denominador*A.numerador);

    cout<<numRes<<"/"<<denRes<<endl;
}

void Fraccion::resta(Fraccion A){
    int denRes = denominador * A.denominador;
    int numRes = (numerador*A.denominador) - (denominador*A.numerador);

    cout<<numRes<<"/"<<denRes<<endl;
}

void Fraccion::imprimir(){
    cout<<numerador<<"/"<<denominador;
}

/*  Programa principal  */

int main(){
    Fraccion frac01(4,5);
    Fraccion frac02(3,8);
    
    cout<<"4/5 + 3/8 = ";
    frac01.suma(frac02);
    cout<<"4/5 - 3/8 = ";
    frac01.resta(frac02);

    cout<<endl;

    cout<<"3/8 + 4/5 = ";
    frac02.suma(frac01);
    cout<<"3/8 - 4/5 = ";
    frac02.resta(frac01);

    return 0;
}