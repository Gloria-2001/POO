#include "Persona.h"
#include "Superheroe.h"
#include "Villano.h"
#include <iostream>
using namespace std;

int main(){
    Superheroe sp("Peter Parker",25,"Spiderman","Sentido aracnido");
    Villano vl("Anthony Masters",50,"Taskmaster","Copiar movimientos");

    sp.presentacion();
    sp.revelarNombre();
    vl.presentacion();
    vl.revelarNombre();

    return 0;
}