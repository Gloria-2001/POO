class Persona(object):
    def __init__(self,name,last,age):
        self.nombre = name
        self.apellido = last
        self.edad = age

    def hablar(self):
        print("Hola, soy {}".format(self.nombre))

    def caminar(self):
        print("Estoy caminando")

    def dormir(self):
        print("zzz")

    def __del__(self):
        print("Me mori Dx")