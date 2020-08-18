from Persona import *

class Villano(Persona):
    def __init__(self,name,age,nick,poder):
        super().__init__(name,age)
        self.nickname = nick
        self.power = poder

    def presentacion(self):
        print('Yo soy {} y mi poder es {}'.format(self.nickname,self.power))

    def revelarNombre(self):
        print("Mi verdadero nombre es {}".format(self.darNombre()))