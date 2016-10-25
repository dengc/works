print "Hello! Welcome to the game~~ Number Guessing!"
num = input("Please guess a number from 1 to 1000:\n")
if num == 126:
    print "Great! You got it right!! Congrats!!!"
else:
    while (1 == 1):
        if num < 126:
            num = input("Should be bigger than your input number:\n")
        elif num > 126:
            num = input("Should be smaller than your input number:\n")
        else:
            print "Great! You got it right!! Congrats!!!"
            break
