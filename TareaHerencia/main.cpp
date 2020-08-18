#include <iostream>
#include <string>
#include "Persona.h"
#include "Villano.h"
#include "Superheroe.h"
using namespace std;

int main(int argc, char *argv[]){
    Persona p00("Tony Stark",55);
    Persona p01("Jack Napier",57);
    Superheroe h00("Iron Man","mi inteligencia","Tony Stark",55);
    Villano v00("The Joker","ser inmune al veneno","Jack Napier",57);

    h00.presentacion();
    h00.revelarNombre();
    v00.presentacion();
    v00.revelarNombre();

    return 0;
}


