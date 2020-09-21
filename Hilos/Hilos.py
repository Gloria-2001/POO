import time
import random
import logging
import threading

logging.basicConfig(
    level = logging.DEBUG,
    format = '(%(threadName)s) %(message)s',
)

def contar():
    i = 0
    try:
        while i<10:
            logging.debug(f'{i}')
            #print(f'{threading.current_thread().name} : {i}')
            time.sleep(random.random())
            i += 1
        print(f'{threading.current_thread().name} Terminado')
    except Exception as e:
        print(e)

if __name__ == '__main__':
    print('Hilo principal trabajando')
    hilo01 = threading.Thread(target=contar)
    hilo02 = threading.Thread(target=contar)

    hilo01.start()
    hilo02.start()
    
    print('Hilo principal terminado')