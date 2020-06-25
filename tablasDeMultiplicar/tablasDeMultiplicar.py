print("Este programa le ayuda a realizar tablas de multiplicar")
num=int(input("Inserte el numero para el que quiera realizar la tabla"))
limite=int(input("Inserte el limite para la tabla"))
aux=0
while aux<=limite:
    print(aux*num)
    aux=aux+1
if num%2==0:
    print("El producto es par")
else:
    print("El producto es impar")