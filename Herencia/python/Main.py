from Vehiculo import *
from Microbus import *

if __name__ == "__main__":
    v00 = Vehiculo()
    print('Asientos: {}'.format(v00.asientos))
    print('Estado del vehiculo: {}'.format(v00.getEstado()))
    v00.encender()
    print('Estado del vehiculo: {}'.format(v00.getEstado()))
    v00.sonar()
    print(v00.largo)

    print("\n\nMicrobus")
    v00 = Microbus()
    print('Asientos: {}'.format(v00.asientos))
    print('Estado del vehiculo: {}'.format(v00.getEstado()))
    v00.encender()
    print('Estado del vehiculo: {}'.format(v00.getEstado()))
    v00.sonar()
    print(v00.largo)
    print(v00.timbre)
    v00.tocarTimbre()
    print(v00.timbre)
    v00.tocarTimbre()
    print(v00.timbre)
    v00.gritar()
