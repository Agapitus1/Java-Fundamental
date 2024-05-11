class TestFriend
{
    //Attributes
    Friend friend1, friend2, friend3;
    
    //Constructor method - Testfriend
        TestFriend()
        {
            // Load all 3 friend objects
            friend1 = new Friend();
            friend2 = new Friend();
            friend3 = new Friend();
            
            //Call sayHEllo() for each object
            friend1.sayHello();
            friend2.sayHello();
            friend3.sayHello();
	}
}
