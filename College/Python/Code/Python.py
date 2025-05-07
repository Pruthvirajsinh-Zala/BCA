# sign up
def sign_up(users):
    username = input("Create your username: ")
    password = input("create a password: ")
    confirm_password = input("Confirm your password: ")

    if password == confirm_password:
        if username not in users:
            users[username] = username
            users[password] = password
            print("sign up successful")
        else:
            print("this account already exists choose another account")
    else:
        print("password doesn't match")

# login
def login(users):
    username_input = input("Enter your username: ")
    password_input = input("Enter your password: ")
    
    if username_input in users and users[password_input] == password_input:     #changed the 2nd username_input into password_input
        print("Login successfull")
    else:
        print("Invalid username or password")

users = {}
sign_up(users)
login(users)

# take inputs for profile
print("ADD YOUR PROFILE DETAILS")
username = input("Enter your username : ")
email = input("Enter your email: ")
password = input("Enter your password ")
phone_number = int(input("Enter your phone number: "))


# profile details

class userprofile:
    def details(self,username,email,password,phone_number):
        self.username = username
        self.email = email
        self.password = password
        self.phone_number = phone_number
        self.bio = ""

    def update_bio(self,new_bio):
        self.bio = new_bio

    def update_password(self,new_password):
        self.password = new_password

    def update_phone_number(self,new_number):
        self.phone_number = new_number


# creating user profile
        user_profile = userprofile(username, email, password, phone_number)

# update bio and phone number
        bio_input = input("Update your bio : ")
        user_profile.update_bio(bio_input)
        number_input = input("add your new phone number: ")
        user_profile.new_number(number_input)

        print(f"\n personal details : ")
        print(f"\n username : {user_profile.username}")
        print(f"\n email : {user_profile.email}")
        print(f"\n password : {user_profile.password}")