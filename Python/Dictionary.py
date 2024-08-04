data = {1: 'Navin', 2: 'Kiran', 4: 'Harsh'}

print(data)

print(data[4])

print(data.get(1))

print(data.get(3))

print(data.get(3, 'Not Found'))

keys = ['Navin', 'kiran', 'Harsh']

values = ['Python', 'Java', 'JS']

data = dict(zip(keys, values))

print(data)

del data['Harsh']

print(data)

prog = {'JS': 'Atom', 'CS': 'VS', 'Python': ['Pycharm', 'Sublime'], 'Java': {'JSE': 'Netbeans', 'JEE': 'Eclipse'}}

print(prog['JS'])







