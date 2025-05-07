import re
text="man"
pattern = r"^m.{2}$"
match = re.match(pattern,text)
if match:
    print("Match Found")
else:
    print("Not Found")
