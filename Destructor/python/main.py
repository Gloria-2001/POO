from sys import argv
from Persona import *   # Importamos la clase

if __name__ == "__main__":
    if len(argv) != 4:
        print("Forma de uso: main.py nombre apellido edad")
        exit()
    
    p00 = Persona(argv[1],argv[2],int(argv[3]))
    p00.hablar()
    p00.caminar()
    p00.dormir()