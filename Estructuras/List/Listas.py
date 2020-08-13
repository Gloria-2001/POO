# Las listas son una estructura que puede recibir cualquier tipo de dato
# lista = [elem0, elem1, ..., elemN]

# Podemos hacer una lista con datos establecidos
l00 = [1,2,3,'perro','gato',True,123.123456]
print(l00)
print(l00[3])

# Podemos hacer un recorrido de una lista de distintas formas

# La mas comun
# for elem in l00:
#     print(elem)

# Convecional
# tam = len(l00)
# for i in range(0,tam):
#     print(l00[i])

l00[3] = False
print(l00[3])

# Agregar un elemento
l00.append('Zait')
l00.append('gato')
print(l00)

# Sacar un elemento
l00.remove('gato')
print(l00)

# Sacar el ultimo elemento
l00.pop()
print(l00)