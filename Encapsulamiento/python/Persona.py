class Persona(object):
    def __init__(self,name,last,age,cc):
        self.nombre = name
        self.apellido = last
        self.edad = age
        self._curp = cc

    def hablar(self):
        print("Hola, soy {}".format(self.nombre))

    def caminar(self):
        print("Estoy caminando")

    def dormir(self):
        print("zzz")

    def getCURP(self):
        return self._curp

    def setCURP(self,newCurp):
        self._curp = newCurp

    def __del__(self):
        print("Me mori Dx")