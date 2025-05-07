import math_operators as mo
import string_utility as su


num1 = float(input("Enter the first number:"))
num2 = float(input("Enter the second number:"))

print(f"Addition: {mo.add(num1,num2)}")
print(f"Subtion: {mo.subtract(num1,num2)}")
print(f"Multiplication: {mo.multiply(num1,num2)}")
print(f"Division: {mo.divide(num1,num2)}")

text = input("Enter a string: ")

print(f"Rversed String: {su.reverse_string(text)}")
print(f"Number of Vowels: {su.count_vowels(text)}")
print(f"Is Palindrome: {'Yes' if su.is_palindrome(text) else 'No'}")

