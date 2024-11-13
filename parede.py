larg = float(input("Largura da parde:"))
alt = float(input("Altura da parede: "))
área = larg * alt
print("Sua parede tem a dimensão de {}x{} e sua área é de {}m²".format(larg, alt, área ))
tinta = área/2
print("Pra pintar essa parede você precisará de {}L de tinta".format(tinta))