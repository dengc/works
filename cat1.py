x= input("Player1: ");
print("Welcome", x);
y= input("Player2: ");
print("Welcome", y);
print(y, 'Are you ready to win this game over ', x,":");
a=input();
while (a !="y"):
    print("No way! you are much better than", x);
    print("Believe in yourself! Try it again!");
    print(y, 'Are you ready to win this game over ', x, ":");
    a= input();


if a=="y":
    print(y,'list a number: ');
    b = input();
    print(x,'list a number: ');
    c = input();
    print(b, ">", c, "! Congratuations! ", y, ", you win!");
