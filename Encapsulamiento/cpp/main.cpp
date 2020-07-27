#include "Persona.h"
#include <iostream>
using namespace std;

int main(int argc, char *argv[]){
    if(argc!=4){
        cout<<"Forma de uso: "<<argv[0]<<" nombre apellido edad"<<endl;
        exit(0);
    }

    Persona p00(argv[1],argv[2],atoi(argv[3]),"HELA980106HDFRPN05");
    p00.hablar();
    p00.caminar();
    p00.dormir();

    cout<<p00.getCURP()<<endl;
    p00.setCURP("HELA980106HDFRPN06");
    cout<<p00.getCURP()<<endl;

    return 0;
}