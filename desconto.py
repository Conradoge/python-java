preço = float(input("Qual é o preço do produto? R$ "))
novo =  preço - (preço*5/100)
print("O produto que custa {}R$, com o desconto de 5% vai custar {}R$".format(preço, novo))