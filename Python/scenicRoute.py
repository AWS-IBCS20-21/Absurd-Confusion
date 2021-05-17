def main():

    start = "New York"
    end = "Orlando"
    minTime = 16.0
    print("Hello! I'm the Scenic Route program.")
    print("Your roadtrip from " + start + " to " + end + " takes " + str(minTime) + " hours.")
    print("If you have the time, though, you should check out some stops along the way! How much time, total, do you have?")
    

  
    
    maxTime = int(input("Enter time available: "))
    remainingTime = maxTime - minTime
    if remainingTime < 0:
        print("Uh oh! That's not even enough time for the fastest route. Rethink your plans!")
    if remainingTime > 0:
        print("Alright! Here are some stops to visit:")
        stops = [("The Liberty Bell", .7), ("Fort McHenry National Monument", .5), ("The Washington Monument", .2), ("The Martin Luther King Jr. Memorial", .24), ("Occoquan Bay National Wildlife Refuge", 1.1), ("Petersburg National Battlefield & Visitor Center", 0.8), ("Virginia Beach", 1.34), ("Biltmore Estate", 1.6), ("Myrtle Beach", 0.92), ("Georgia Aquarium", 3.1), ("Florida Theatre", 0.12), ("Daytona Beach", 0.22)]
        locationMarker = 0
        c = 1
        selectedStops = []
    
        while remainingTime >= 0:
            for i in range(locationMarker, len(stops), 1):
                if (remainingTime - stops[i][1]) > 0:
                    print(str(i+1) + ": " + stops[i][0] + ", " + str(stops[i][1]) + " hours")
            selection = int(input("Select stop: ")) - 1
            selectedStops.append(selection)
            selectionTime = stops[selection][1]
            remainingTime = remainingTime - selectionTime
            locationMarker = selection + 1
            if remainingTime <= 0:
                print("Looks like you're out of time!")
                break
            if locationMarker == 12:
                print("You've reached your destination!")
                break
            print("You now have " + str(remainingTime) + " hours remaining.")
            print("Would you like to visit another stop?")
            print("1: Yes")
            print("2: No")
            yesNo = int(input())
            if yesNo == 2:
                break
         

        print("Here's your scenic route:")
        print("New York")
        for i in range(len(selectedStops)):
            print(str(stops[selectedStops[i]][0]))
        print("Orlando")
       
        
  



if __name__ == "__main__":
    main()
