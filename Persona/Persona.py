class Persona:
    def __init__(self, nombre, apellidos, edad, sexo, peso):
        self.nombre = nombre
        self.apellidos = apellidos
        self.edad = edad
        self.sexo = sexo
        self.peso = peso

    def caminar(self):
        print("Estoy caminando")
    
    def dormir(self):
        print("zzz")

    def hablar(self):
        print('Hola,soy ' + self.nombre)

if __name__ == "__main__":
    p00=Persona("Gloria", "Olivares", 18, 'f', 61)
    p00.hablar()
    p00.caminar()
    p00.dormir()    
    