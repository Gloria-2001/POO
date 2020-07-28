class Vehiculo(object):
    def __init__(self):
        self.llantas = 4
        self.estado = False
        self.puertas = 4
        self.asientos = "Piel"
        self.largo = 1.20

    def encender(self):
        self.estado = True

    def apagar(self):
        self.estado = False

    def getEstado(self):
        return self.estado

    def sonar(self):
        print("pi-pi")