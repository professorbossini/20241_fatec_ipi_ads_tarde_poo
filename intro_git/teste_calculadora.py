import calculadora
def main():
  a, b = 2, 3
  soma = calculadora.soma(a, b)
  print(f'{a} + {b} = {soma}')
  subtracao = calculadora.subtrai(a, b)
  print(f'{a} - {b} = {subtracao}')
main()