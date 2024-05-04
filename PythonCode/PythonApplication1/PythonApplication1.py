#name = "Urvi Thakore";
#print("Hi "+name+", how is it going?");
#x = 37;
#y= 68;
#total = x+ y
#print(x+y);
#print(type("5"))
#print(f"when you add {x} and {y} you get {total}")
#--------------------------------------------------
#name = input("enter your name ")
#country = input("enter your country ")
#print("Name: "+name +" Country: "+country)
#print(f"Hello, {name} from {country} !!")
#------------------------------------------
#name = input("enter your name ")
#if name=='Nibha':
#    print("Hi " + name)
#else:
#    print("Who "+ name +", I don't know you" )
#-----------------------------------------------
#first = input("Enter any word: ")
#second = input("Enter another word: ")
#print("alphabetical order:")
#if first<second:
#    print(f'{first} come before {second}')
#elif second<first:
#    print(f'{second} comes before {first}')
#else:
#    print(f'{second} equals {first}')
#----------------------------------------
#name = input("Enter your  name: ")
#company = input("Enter your company name: ")
#if(name == 'Urvi' and company == 'HCL'):
#    print(f"Hi Myself {name} at {company}")
#elif (name != 'Urvi' and company == 'HCL'):
#    print(f"Hi Colleague {name} at {company}")
#elif (name == 'Urvi' and company != 'HCL' ):
#    print(f"What a great name {name} at {company}" )
#else:
#    print(f"Hi Unknown {name} at {company}")
#-----------------------------------------
## Guess a number
#secret = 25;
#guess = int(input("guess the secret number :"))
#if(secret<guess):
#    print("Too High")
#elif(secret>guess):
#    print("Too low")
#else:
#    print("You got it")
#--------------------------------------------
## translate Engish word into PigLanguage
#word = input("Enter a lowercase word: ")
##if(word[0]=='a' or word[0] == 'e' or word[0] == 'i' or word[0]=='o' or word[0]=='u'):
#if(word[0] in "aeiou"):
#    translate = word + "way"
#    print(f"Pig language translates {word} to {translate}")
#else:
#    translate = word[1:]+word[0]+"ay"
#    print(f"Pig language translates {word} to {translate}")
#----------------------------------------------------------
## Check whether entered number is numeric or not
#guess = input('Enter the number').strip()
#if guess.isdigit():
#     print(f"{guess} is numeric")
#else:
#     print(f"{guess} is not numeric")
#----------------------------------------------------------
## String methods demo
#string = input("Enter a string: ")
#transform = string.swapcase()
#print(f"{string} swapcase {transform}")
#list = string.split(" ")
#for words in list:
#    print(words + '\n')
#transform = string.capitalize()
#print(f"{string} capitalize {transform}")
#print(f"{string} starts with o {string.startswith('o')}")
#transform = string.upper()
#print(f"{string} upper {transform}")
#string = "This is me"
#if string.startswith("This") and string.endswith("me"):
#    print("Horray")
#---------------------------------------------------------
## Count digits, vowels, others in a string
#s = input("Enter a string :")
#vowels = 0
#digits = 0
#others = 0
#for one_char in s:
#    print(one_char)
#    if (one_char.isdigit()):
#        digits+=1
#    elif(one_char.lower() in "aeiou"):
#        vowels+=1
#    else:
#        others+=1
#print(f"vowels : {vowels} digits : {digits} others : {others}")
#---------------------------------------------------------------
## Print total of numbers entered by user
#totals = 0
#count = int(input("Count of numbers?").strip())
#for index in range(count):
#    intele = input("Enter number:")
#    if intele.isdigit():
#        totals+=int(intele)
#    else:
#        print(f"{intele} is not a number")
#print(f"Total of {count} inputs is {totals}")
#---------------------------------------------------------------
## Print total of numbers entered by user
#totals = 0
#user_value = int(input("Enter numbers"))
#for counter in range(user_value):
#    v1 = input("Enter number").strip()
#    try:
#        v1 = int(v1)
#        totals+= v1
#    except:
#        print(f"{v1} is not a number")
#   # finally:
#       # print(f"Totals in finally : {totals}")
#print(f"Totals : {totals}")
#---------------------------------------------------------------
## for loop using enumerate
#str = "weursfloeir"
#for index, char in enumerate(str):
#    print(f"{index} : {char}")
#---------------------------------------------------------------
## Expand a given number in form a * 10**3 + b * 10**2 + c * 10**1 + d * 10**0
#number = input("Enter the number").strip()
#expandedform=""
#length = len(number)
#for index, char in enumerate(number):
#    expandedform += char+" * 10**"+ str(length - index - 1)
#    if(length - index - 1 != 0):
#        expandedform+= " + "
#print(f"{number} = {expandedform}")   
#---------------------------------------------------------
## Expand a given number in form e.g 0987 = 0 * 1000 + 9 * 100 + 8 * 10 + 7 * 1
#number = input("Enter a number : ").strip()
#expandedform=''
#length = len(number)
#for i in range(length):
#    power10 = 10 ** (length - i - 1)
#    print(f"{i} {number[i]} {power10}")
#    expandedform += number[i] + " * " + str(power10)
#    if(length - i - 1 != 0):
#        expandedform+=" + "
#print(f"{number} = {expandedform}") 
#---------------------------------------------------------
## Get input number from user and total it until it is 100 or more
#totals = 0
#while True:
#    number = input("Enter number").strip()
#    if number.isdigit():
#        totals += int(number)
#    else:
#        print(f"{number} is not a digit")
#    if(totals >= 100):
#        break
#print(f"Totals : {totals}")
#-------------------------------------------
## Get input number from user and total it until it is 100 or more
#totals = 0
#while totals<100:
#    number = input("Enter number").strip()
#    if number.isdigit():
#        totals += int(number)
#    else:
#        print(f"{number} is not a digit")
#print(f"Totals : {totals}")
#--------------------------------------
## for loop using range()
#for i in range(5):
#    print(f"{i}")
#print()
#for i in range(2,7):
#    print(f"{i}")
#print()
#for i in range(5,10,1):
#    print(f"{i}")
#print()
#for i in range(5,20,4):
#    print(f"{i}")
#print()
#for i in range(12,7,-1):
#    print(f"{i}")
#print()
#------------------------------------------------
##  make a list of vowels, digits, others from a string
#str = input("Enter a string: ")
#vowels=[];
#digits=[];
#others=[];
#for char in str:
#    if(char.isdigit()):
#        digits.append(char)
#    elif(char.lower() in "aeiou"):
#        vowels.append(char)
#    else:
#        others.append(char)
#print(f"digits: {digits}")
#print(f"vowels: {vowels}")
#print(f"others: {others}")
#-----------------------------------------------------
##Translate English sentence into Pig Language
#strg = input("enter a sentence")
#trans =[]
#words = strg.lower().split()
#print(words)
#for word in words:
#    if(word[0] in "aeiou"):
#        trans.append(word+ "way")
#    else:
#        trans.append(word[1:]+word[0]+"ay")
#print(trans)
#print(" ".join(trans))
#--------------------------------------------------------
##appending a list in list works in different way
#mylist = [10,20,30]
#mylist1 = [40,60]
#mylist.append(mylist1)
#for ele in mylist:
#    print(str(ele) + " ")
#-------------------------------------------------------
##Order item from menu and give the total
#dict = {"dosa":10.99,"idli":8,"vada":9.99,"coffee":4.5,"bisibella":10,"puri":10,"biryani":12}
#dict["tea"]=3.99
#dict["bonda"]=8
#print(dict)
#newdict ={"sandwich":5.99,"pizza":15,"pasta":10,"pongal":6.55}
##appending new dict with the old dict
#dict= dict|newdict
#dict.pop("pizza")
#del dict["pasta"]
#for item,price in dict.items():
#    print(f"item : {item} price : {price}")
#total = 0;
#while True:
#    item = input("Order: ").strip();
#    if item=="":
#        break;
#    if item in dict:
#        total += dict[item] 
#        print(f"{item} costs {dict[item]}, total is {total}")
#    else:
#        print(f"We have ran out of fresh {item}, today")
#print(f"Totals: {total}")
#------------------------------------------------------------
##Count vowels, digits, and others in a string using dictionary
#dict = {"vowels":0,"digits":0,"others":0}
#print("Enter words till blank")
#words=[]
#while True:
#    word=input().strip()
#    if word=="":
#        break
#    words.append(word)
#for word in words:
#    for char in word:
#        if char.isdigit():
#            dict['digits']+=1
#        elif char in "aeiouAEIOU":
#            dict["vowels"]+=1
#        else:
#            dict["others"]+=1
#for types, count in dict.items():
#    #print(f"vowels: {dict['vowels']} digits: {dict['digits']} others:{dict['others']} " )
#    print(f"{types} : {count}")
#------------------------------------------------------------------------
##Loops in Dictionaries
#map = {"Urvi":44, "Sreedhara":45,"Nibha":43, "Sunny":32}
#for key in map:
#    print(f"{key} : {map[key]}")
#for key in map.keys():
#    print(f"{key} : {map[key]}")
#for value in map.values():
#    print(f"{value}")
#for name, age in map.items():
#    print(f"{name}:{age}")
#------------------------------------------------------------------------
##Count letters in string
#string = input("Enter a string :").strip()
#count={}
#for char in string:
#    if char in count:
#        count[char] +=1
#    else:
#        count[char]=1
#for char,count in count.items():
#    print(f"{char} : {count}")
#-------------------------------------------------------------------------
##Getting rainfall from city through user input
#Raincount={}
#while True:
#    city = input("enter the city :").strip()
#    if(city==""):
#        break
#    rainfall = int(input(f"enter the rains in {city} :").strip())
#    if city in Raincount:
#        Raincount[city]+=rainfall
#    else:
#        Raincount[city]=rainfall
#for city, rainfall in Raincount.items():
#    print(f"{city} : {rainfall}")
#__________________________________________________________________________
##Reading a file
#f = open("C:\\Users\\urvit\\Downloads\\linux-etc-passwd.txt")
#print(f)
##s = f.read()  #This way of reading is not recommended
##print(s)
#for one_line in f:
#    print(one_line)
#for index, one_line in enumerate(open("C:\\Users\\urvit\\Downloads\\shoe-data.txt")):
#_____________________________________________________________________________
#dict = {"a":0,"e":0,"i":0,"o":0,"u":0}
#f = open("C:\\Users\\urvit\\Downloads\\linux-etc-passwd.txt")
#print(f)
#for one_line in f:
#    for eachChar in one_line:
#        #if eachChar=="a":
#        #    dict["a"]+=1
#        #if eachChar=="e":
#        #    dict["e"]+=1
#        #if eachChar=="i":
#        #    dict["i"]+=1
#        #if eachChar=="o":
#        #    dict["o"]+=1
#        #if eachChar=="u":
#        #    dict["u"]+=1
#        if eachChar in dict:
#            dict[eachChar]+=1
#print(dict)
#------------------------------------------------------------------------------
#dict = {'lines':0, 'words':0, 'chars':0}
#f=open("C:\\Users\\urvit\\Downloads\\wcfile.txt")
#for one_line in f:
#    dict['lines']+=1
#    words = one_line.split()
#    dict['chars']+=len(one_line)
#    dict['words']+=len(words)
#    #for word in words:
#    #    dict['words']+=1
#    #for char in one_line:
#    #    dict['chars']+=1
#print(dict)
#_-------------------------------------------------------------------------------
##Creates a file and writes data to it
#with open('C:\\Users\\urvit\\Downloads\\data.txt', 'w') as f: 
#    data = 'some data to be written to the file'
#    f.write(data)
#--------------------------------------------------------------------------------
##Functions
#def greet():
#    name = input("enter your first name:").strip()
#    lastname = input("enter your last name:").strip();
#    print(f"Hello, {name} {lastname} !")

#greet()
#---------------------------------------------------------------------------------
#def calc(operand1, operand2, operation):
#    result = 0
#    if not (isinstance(operand1,int) and isinstance(operand2,int)):
#        operand1 = int(operand1)
#        operand2 = int(operand2)

#    if(operation == '+'):
#        result = operand1 + operand2
#    elif(operation == '-'):
#        result = operand1 - operand2
#    print(f"{operand1} {operation} {operand2} = {result}")

#calc(2,'5','+')
#-----------------------------------------------------------------------------------
#def calc(expression):
#    ret ='The expression is not valid'
#    if isinstance(expression, str):
#        elements = expression.split()
#        if (len(elements)==3):
#            try:
#                oper1 = int(elements[0])
#                oper2 = int(elements[2])
#            except:
#                return ret
#            oper = elements[1]
#            if(oper =='+'):
#                result = oper1 + oper2
#                ret = expression + " = " + str(result)
#            elif(oper == '-'):
#                result = oper1 - oper2
#                ret = expression + " = " + str(result)
#            else:
#                ret = ret + ": Operation not supported"

#    return ret

#print(calc('89 + 11'))
#--------------------------------------------------------------------------------------------
#def sum(nums):
#    sum=0
#    if isinstance(nums,list):
#        for num in nums:
#            if isinstance(num, int):
#                sum+=num
#    return sum

##print(sum(nums=[10,'20','30']))
#print(sum([10]))
#-----------------------------------------------------------------------------------------------------------
#def smallest_and_biggest(nums):
#    result=[]
#    if isinstance(nums,list):
#        min=nums[0]
#        max = nums[0]
#        for num in nums:
#            if isinstance(num, int):
#                if(num<min):
#                    min=num
#                if(num>max):
#                    max=num
#        result.append(min)
#        result.append(max)
#    if isinstance(nums, int):
#        result.append(nums)
#        result.append(nums)
#    return result

#print(smallest_and_biggest(89))
#print(smallest_and_biggest([10,45,23,67,56,5,'b']))
#x, y = smallest_and_biggest([11,9,78,3])
#print(f"{x} {y}")
#--------------------------------------------------------------------------------------------
#def even_and_odds(nums):
#    evens=[]
#    odds = []
#    if isinstance(nums,list):
#        for num in nums:
#            if isinstance(num, int):
#                if num%2==0:
#                    evens.append(num)
#                else:
#                    odds.append(num)
#    return {"even": evens, "odd":odds}

#print(even_and_odds([10,89,34,454,23,77,12,90]))

#print(even_and_odds(56))
#---------------------------------------------------------------------------------------------
#def count_characters(text, search=("aeiou")):
#    output={}
#    for ch in search:
#        output[ch]=0
#    for ch in text:
#        if ch in output:
#            output[ch]= output[ch] + 1
#    return output

#print(count_characters("Urvi Arvind Thakore"))
#print(count_characters("Urvi Arvind Thakore", "rota"))
#---------------------------------------------------------------------------------------------------
#def sum_evens(*args):
#    sum=0;
#    for arg in args:
#        if isinstance(arg,int) and arg%2==0:
#            sum+=arg
#    return sum

#print(sum_evens(23,45,67,12,89,'a','b',[1,2],22,56,11))
#-----------------------------------------------------------------------------------------------------

#import random

#number = random.randint(1,100)
#while(True):
#    try:
#        guess = int(input("Guess the number:").strip())
#    except :
#        break;
#    if(guess > number):
#        print("Too high")
#    elif (guess < number):
#        print("Too low")
#    else:
#        print("You got it !!")
#        break;
#print("Done")
#------------------------------------------------------------------------
#import sys

#list = dir(sys)
#list = sys.path

#print(list)
#--------------------------------------------------------------------------        
#import module1

#list = dir(module1)
#print(list)
#print(module1.name)
#------------------------------------------------------------------------
#import menu

#print(f"Your order priced at {menu.get_input()}")
#choicemenu = ["idli", "vada", "dosa"]
#print(menu.get_choice(10))
#print(f"Your choice is {menu.get_choice(choicemenu)}")

#------------------------------------------------------------------------
#import glob, os
#os.fstat
#files = glob.glob("C:\\*.txt")
#filenames = [os.path.basename(file) for file in files]

## Print each file name on a new line
#for file_name in filenames:
#    print(".txt file:", file_name)
#-----------------------------------------------------------------------------------------------------------------------------------------------
import rich

print(help(rich))
str = input("Enter a string:").strip()

if(len(str)%2==0):
    rich.print(f"[green]Even {str}[/green]")
else:
    rich.print(f"[blue] Odd {str}[/blue]")