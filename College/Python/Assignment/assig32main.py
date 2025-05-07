import assig32 as su

text=input("Enter String ")

print("Reversed String : ",su.reverse_string(text))
print("Number of vowels :",su.count_vowels(text))
print(f"Is Pelindrome : {'yes' if su.is_pelindrom(text) else 'no'}")
