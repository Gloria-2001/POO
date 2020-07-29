#include "Vehiculo.h"
#include "Microbus.h"
#include <iostream>
using namespace std;

int main(int argc, char *argv[]){
    Vehiculo v00;
    cout<<"Asientos: "<<v00.asientos<<endl;
    cout<<"Estado del vehiculo: "<<v00.getEstado()<<endl;
    v00.encender();
    cout<<"Estado del vehiculo: "<<v00.getEstado()<<endl;
    v00.sonar();
    cout<<v00.largo<<endl;

    Microbus v01;
    cout<<"\nMicrobus"<<endl;
    cout<<"Asientos: "<<v01.asientos<<endl;
    cout<<"Estado del vehiculo: "<<v01.getEstado()<<endl;
    v01.encender();
    cout<<"Estado del vehiculo: "<<v01.getEstado()<<endl;
    v01.sonar();
    cout<<v01.largo<<endl;
    cout<<v01.timbre<<endl;
    v01.tocarTimbre();
    cout<<v01.timbre<<endl;
    v01.gritar();

    return 0;
}