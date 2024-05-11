# Java-Fundamental

# Getting Started in Programming

# We are ALL new to Programming, so let’s find out who we will be learning with this semester. 
1.	Your tutor will allocate you to a small group using RingCentral Breakout Rooms. Please join your group when you get the notification.

2.	When you are in your group, turn your webcam and microphone on – you will need to see and hear each other!
3.	Find out the name of each member in your group, and add their name to this document. Next to their name, record one thing about them you can see. It may be that they are wearing glasses, or it might be they are wearing a red shirt.

4.	Final things to find out about your group members: which city are they located in?  Which brand of phone do they own? Record this information for each group member.

5.	When you have all the information about your group you may return to the main RingCentral meeting with the rest of the class.

# Reading Java – Game Code

# Before we can write Java code of our own, we must be able to read Java code, and learn the names of the key components in a Java program.

# Open the document called Game Code (found in the Week 1 Learning Materials). Read the code, and then write down the line number of the following:

1.	Class name
2.	1st attribute
3.	3rd attribute
4.	Code that prints a message on the computer screen
5.	Last brace of the class
6.	First line of the method display
7.	First line of the Game constructor

Get ready to share your answers with the class!
Setup Your File Storage

Each week we will be creating a new BlueJ project. So we can use these projects in future classes we need a location we can save these reliably. Choose a location on your device and: 
1.	Create a folder called Programming 
2.	Save all your work inside this folder EVERY WEEK

 
# Getting Started with Java – Part 1

1.	With the class, we will work together to write your first Java program, the class will be called Friend. Your work is to be written in this document in the space provided below. When you have completed your program, you will create the program using BlueJ where you can test and run the program to make sure it works.

2.	Add 3 class attributes (3 data fields that describe a friend) – one for first name, one for location, and one for brand of phone. (HINT: attribute names cannot have spaces).

3.	Add the constructor for Friend (HINT: see line 15 of the Week 1 code example). The first line of the method should look like this:

Friend()

4.	Add a method called sayHello() that will print the message “Hi, nice to meet you” on the screen – use System.out.println. The first line of the method should look like this:

void sayHello()

5.	With the help of the class and your tutor, check that your solution is correct before starting Part 2 below.

class Friend
{







}
 
# Getting Started with Java – Part 2 – Individual 

6.	Open BlueJ, create a new project called week1 - save this in your Programming folder.

7.	Copy the code for the Friend class above into BlueJ in a class called Friend (click New Class… to add this), then compile the class and fix any compile errors.

8.	Create a Friend object by right clicking on the class name and selecting the Constructor for Friend from the list i.e. new Friend()

9.	Now run the sayHello() method by right clicking on the red object square and selecting the method name. What do you see?

10.	Challenge: Modify the sayHello() method so that the message printed is this: “Hi, nice to meet you, my name is Lisa” (if your friend’s name is Lisa)

# Exercises - Individual

(a)	Create a new class called TestFriend that will create three different Friend objects inside the constructor TestFriend() (see TestCalculator from lecture 1 for an example). Make sure you use the Java conventions for naming objects and classes (objects start with a lower case letter, classes start with UPPER case letters).

	You can use this code to get you started:
class TestFriend
{
		Friend friend1, friend2, friend3;
    		TestFriend()
    		{

		}
	}
	
(b)	In the class TestFriend after creating the new objects, ‘call’ the sayHello() method for each object so the user can see your friend saying hello. (HINT: see lines 43 & 44 of the Week 1 code example).

(c)	Remove the semicolon (;) from the end of a line of code inside the main method and compile.  What happens?  What does the error message say?

(d)	Remove the LAST closing brace ( } ) from the last line of code in the class TestFriend and compile.  What happens?  What does the error message say?

(g)	Put a Breakpoint on any statement that displays a message to the user by left clicking in the white space to the left of the black line.  You should see a red STOP sign in the left margin if the breakpoint if set correctly. Now run the method again.  What happens?  

Breakpoints: these are places in your code where execution pauses.  The purpose of these points are so you can look at the values of variables to see what is happening in your program.  Breakpoints are a Debugging technique.  We will see more of these later.

When we are finished today, our BlueJ project should look like this:

 

Extension: Create a Tutor class of your own.

Include attributes that describe a tutor, at least 1 constructor, and a method that implements a tutor greeting somebody.
