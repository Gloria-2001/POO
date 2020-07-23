#include <stdio.h>
#include <stdlib.h>
#include <iostream>
using namespace std;

#ifndef _SECONDS_H_
#define _SECONDS_H_

class Seconds{
    public:
        float seg;
        int min;
        int hrs;
        int dia;
        Seconds(int);           // Constructor 1
        Seconds(int,int);       // Constructor 2
        Seconds(int,int,int);   // Constructor 3
        ~Seconds();             // Destructor
        void convert();         // Metodo
};

#endif