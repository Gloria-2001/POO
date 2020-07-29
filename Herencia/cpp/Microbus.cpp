#include "Microbus.h"
#include "Vehiculo.h"

Microbus::Microbus(){
    largo = 3.0;
    timbre = false;
    asientos = "Tela de modatelas";
}

void Microbus::sonar(){
    cout<<"La cucaracha, la cucaracha"<<endl;
}

void Microbus::gritar(){
    cout<<"Subale, hay lugares"<<endl;
}

void Microbus::tocarTimbre(){
    timbre = !timbre;
}