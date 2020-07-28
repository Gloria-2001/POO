from Vehiculo import *

class Microbus(Vehiculo):
    def __init__(self):
        Vehiculo.__init__(self)
        self.largo = 3
        self.asientos = 'Tela de modatelas'
        self.timbre = False

    def sonar(self):
        print("La cucaracha, la cucaracha")

    def gritar(self):
        print("Subale, hay lugares")

    def tocarTimbre(self):
        self.timbre = not self.timbre

