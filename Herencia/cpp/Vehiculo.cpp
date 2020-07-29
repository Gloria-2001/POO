#include "Vehiculo.h"

Vehiculo::Vehiculo(){
    llantas = 4;
    estado = false;
    puertas = 4;
    asientos = "Piel";
    largo = 1.20;
}

void Vehiculo::encender(){
    estado = true;
}

void Vehiculo::apagar(){
    estado = false;
}

bool Vehiculo::getEstado(){
    return estado;
}

void Vehiculo::sonar(){
    cout<<"pi-pi"<<endl;
}