from sys import argv

def leer(name):
    with open(name, 'r') as fr:         # fr = open(name,'r')
        for linea in fr.readlines():
            print(linea)
    # fr.close()

def escibir(name1, name2):
    with open(name1, 'r') as fr:
        fw = open(name2, 'w')
        for linea in fr.readlines():
            fw.write(linea)
        fw.write("\n")
        fw.close()


def editar(name):
    with open(name,'a') as fw:
        linea = input("Por favor, ingrese una frase:\n")
        fw.write(linea)


if __name__ == "__main__":
    op = int(argv[1])

    print("\n")

    if op == 1:
        leer(argv[2])
    elif op == 2:
        escibir(argv[2], argv[3])
    elif op == 3:
        editar(argv[2])
    else:
        print("Opcion no encontrada")

    print("\nTarea finalizada")