#include <iostream>
using namespace std;

/*  Interfaz  */

class Fraccion{
    public:
        int numerador;
        int denominador;
        Fraccion(int,int);
        void initFraccion(int,int);
        Fraccion suma(Fraccion);
        Fraccion resta(Fraccion);
        void imprimir();
};

/*  Implementacion  */

Fraccion::Fraccion(int numerador, int denominador){
    this->numerador = numerador;
    this->denominador = denominador;
}

void Fraccion::initFraccion(int num, int den){
    numerador = num;
    denominador = den;
}

Fraccion Fraccion::suma(Fraccion A){
    Fraccion aux(1,1);
    int denRes = denominador * A.denominador;
    int numRes = (numerador*A.denominador) + (denominador*A.numerador);
    aux.initFraccion(numRes,denRes);

    return aux;
}

Fraccion Fraccion::resta(Fraccion A){
    int denRes = denominador * A.denominador;
    int numRes = (numerador*A.denominador) - (denominador*A.numerador);

    return Fraccion(numRes,denRes);
}

void Fraccion::imprimir(){
    cout<<numerador<<"/"<<denominador<<endl;
}

/*  Programa principal  */

int main(){
    Fraccion frac01(4,5);
    Fraccion frac02(3,8);
    Fraccion aux00(1,1);
    
    cout<<"4/5 + 3/8 = ";
    aux00 = frac01.suma(frac02);
    aux00.imprimir();
    cout<<"4/5 - 3/8 = ";
    aux00 = frac01.resta(frac02);
    aux00.imprimir();

    cout<<endl;

    cout<<"3/8 + 4/5 = ";
    frac02.suma(frac01).imprimir();
    cout<<"3/8 - 4/5 = ";
    frac02.resta(frac01).imprimir();

    return 0;
}