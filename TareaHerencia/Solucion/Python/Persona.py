class Persona:
    def __init__(self,name,age):
        self._nombre = name
        self._edad = age
    
    def darNombre(self):
        return self._nombre
