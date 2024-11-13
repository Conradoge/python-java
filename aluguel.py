dias = int(input("Qunatos dias o carro foi alugado?"))
km = float(input("Quantos Km o carro rodou?"))
pago = (dias * 60) + (km * 0.15)
print ("Então, nesse caso o total a ser pago é {}R$".format(pago))