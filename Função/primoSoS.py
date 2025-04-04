##Escreva uma funcao que peca 3 numeros e conte

primoZ = []

def primos(a, b):
  if a > b:
    for i in range(b, a + 1):
      primos = True
      for j in range(2, i):
        print(f"{i} Nao e primo")
        primos = False
        break
      break
    if primos:
      primoZ.append(i)
  
primos(2, 6)
print(primoZ)

primoZ = []

# def primos(a, b):
#     # Garantir que o intervalo seja correto, mesmo que a > b
#     if a > b:
#         a, b = b, a  # Inverte os valores de a e b se necessário
        
#     # Verificar os números no intervalo de a a b
#     for i in range(a, b + 1):
#         # Considerar 1 como não primo
#         if i < 2:
#             continue
        
#         # Verificar se o número i é primo
#         is_prime = True
#         for j in range(2, int(i ** 0.5) + 1):  # Verifica até a raiz quadrada de i para otimizar
#             if i % j == 0:
#                 is_prime = False
#                 break
        
#         if is_prime:
#             primoZ.append(i)

# primos(2, 5)
# print(primoZ)
