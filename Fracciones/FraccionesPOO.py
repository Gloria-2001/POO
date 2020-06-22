class Fraccion:
    # Constructor
    def __init__(self,numerador=1,denominador=1):
        # Atributos
        self.numerador = numerador
        self.denominador = denominador

    # Metodos
    def initFraccion(self,num,den):
        self.numerador = num
        self.denominador = den

    def suma(self,A):
        aux = Fraccion();
        dem = self.denominador * A.denominador
        num = (self.numerador*A.denominador) + (self.denominador*A.numerador)
        aux.initFraccion(num,dem)
        return aux;

    def resta(self,A):
        dem = self.denominador * A.denominador;
        num = (self.numerador*A.denominador) - (self.denominador*A.numerador);
        return Fraccion(num,dem)

    def imprimir(self):
        return ("{}/{}".format(self.numerador,self.denominador))

# Programa principal
if __name__ == "__main__":
    frac01 = Fraccion(4,5)
    frac02 = Fraccion(3,8)

    aux00 = frac01.suma(frac02)
    aux00 = aux00.imprimir()
    print("4/5 + 3/8 = "+aux00)
    aux00 = frac01.resta(frac02)
    aux00 = aux00.imprimir()
    print("4/5 - 3/8 = "+aux00)
    
    print("\n")

    print("3/8 + 4/5 = "+frac02.suma(frac01).imprimir())
    print("3/8 - 4/5 = "+frac02.resta(frac01).imprimir())