def ten(small, big, length):
    if (length % (big * 5) == small):
        return "True"
    else:
        return "False"

def eleven(a, b, c):
    sumAbc = 0
    if a != b and a != c:
        sumAbc = sumAbc + a
    if b != a and b != c:
        sumAbc = sumAbc + b
    if c != a and c != b:
        sumAbc = sumAbc + c
    return sumAbc

def twelve(cdstring):
    catCount = 0
    dogCount = 0
    for i in range(0, len(cdstring)):
        i2 = i + 3
        cdsubstring = cdstring[i:i2]
        if cdsubstring == "cat":     
            catCount = catCount + 1
        if cdsubstring == "dog":
            dogCount = dogCount + 1

    if catCount == dogCount:
        return "True"
    else:
        return "False"

def thirteen(string, end):
    string = string.lower()
    end = end.lower()
    endLen = -1*len(end)
    stringEnd = ""
    for i in range(endLen, 0):
        stringEnd = stringEnd + string[i]
    if stringEnd == end:
        return "True"
    else:
        return "False"

def fourteen(array):
    current = 0
    comp = 0
    cmax = -1000000
    cmin = 10000000
    fmax = -1000000
    fmin = 10000000
    for i in range(0, len(array)):
        current = array[i]
        for j in range(0, len(array)):
            comp = array[j]
            cmax = max(current, comp)
        if cmax > fmax:
            fmax = cmax
    for i in range(0, len(array)):
        current = array[i]
        for j in range(0, len(array)):
            comp = array[j]
            cmin = min(current, comp)
        if cmin < fmin:
            fmin = cmin
    return fmax-fmin

def fifteen(array):
    current = 0
    comp = 0
    cmax = -1000000
    cmin = 10000000
    fmax = -1000000
    fmin = 10000000
    cut = 0
    msum = 0
    cavg = 0
    for i in range(0, len(array)):
        current = array[i]
        for j in range(0, len(array)):
            comp = array[j]
            cmax = max(current, comp)
        if cmax > fmax:
            fmax = cmax
    for i in range(0, len(array)):
        current = array[i]
        for j in range(0, len(array)):
            comp = array[j]
            cmin = min(current, comp)
        if cmin < fmin:
            fmin = cmin
    cut = fmax + fmin
    for i in range(0, len(array)):
        msum = msum + array[i]
    msum = msum - cut
    cavg = msum/(len(array) -2)
    return cavg
    
    


def main():
    w = 1
    while w == 1:
        print("Select a Python Practice Problem to run:")
        print("Problem 10")
        print("Problem 11")
        print("Problem 12")
        print("Problem 13")
        print("Problem 14")
        print("Problem 15")
        print("Quit 16")

        choice = int(input("Choose problem: "))

        if choice == 10:
            small = int(input("Choose number of small (1 foot) bricks: "))
            big = int(input("Choose number of big (5 foot) bricks: "))
            length = int(input("Choose length of row: "))
            print(ten(small, big, length))

        if choice == 11:
            a = int(input("Choose first number: "))
            b = int(input("Choose second number: "))
            c = int(input("Choose third number: "))
            print(eleven(a, b, c))

        if choice == 12:
            cdstring = str(input("Choose string: "))
            print(twelve(cdstring))

        if choice == 13:
            string = str(input("Enter string: "))
            end = str(input("Enter end string: "))
            print(thirteen(string, end))

        if choice == 14:
            print("To end entering, enter 111")
            array = []
            entered = 0
            x = 1
            while x == 1:
                entered = int(input("Enter number: "))
                if entered == 111:
                    break
                else:
                    array.append(entered)
            print(fourteen(array))

        if choice == 15:
            print("To end entering, enter 111")
            array = []
            entered = 0
            x = 1
            while x == 1:
                entered = int(input("Enter number: "))
                if entered == 111:
                    break
                else:
                    array.append(entered)
            print(fifteen(array))

        if choice == 16:
            break
            
            
                            

if __name__ == "__main__":
    main()
