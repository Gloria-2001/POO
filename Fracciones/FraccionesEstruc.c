#include <stdio.h>
#include <stdlib.h>

/*  Interfaz  */

typedef struct Fraccion{
    int numerador;
    int denominador;
}Fraccion;

/*  Implementacion  */

Fraccion construirFrac(int num, int dem){
    Fraccion frac;
    frac.numerador = num;
    frac.denominador = dem;
    return frac;
}

Fraccion suma(Fraccion A, Fraccion B){
    Fraccion frac;
    frac.denominador = A.denominador*B.denominador;
    frac.numerador = (A.numerador*B.denominador) + (A.denominador*B.numerador);
    return frac;
}

Fraccion resta(Fraccion A, Fraccion B){
    Fraccion frac;
    frac.denominador = A.denominador*B.denominador;
    frac.numerador = (A.numerador*B.denominador) - (A.denominador*B.numerador);
    return frac;
}

void imprimirFrac(Fraccion A){
    printf("%d/",A.numerador);
    printf("%d\n",A.denominador);
}

/*  Programa principal  */

int main(){
    Fraccion frac01, frac02;
    frac01 = construirFrac(4,5);
    frac02 = construirFrac(3,8);

    printf("4/5 + 3/8 = ");
    imprimirFrac(suma(frac01,frac02));
    printf("4/5 - 3/8 = ");
    imprimirFrac(resta(frac01,frac02));

    printf("\n");

    printf("3/8 + 4/5 = ");
    imprimirFrac(suma(frac02,frac01));
    printf("3/8 - 4/5 = ");
    imprimirFrac(resta(frac02,frac01));

    return 0;
}