names = ("Navin", "Kiran", "Harsh", "Navin")
comps = ("Dell", "Apple", "MS", "Dell")

zipped = list(zip(names,comps))

print(zipped)

for (a, b) in zipped:
    print(a, b)

