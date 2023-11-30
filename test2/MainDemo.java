package test2;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryUser kidUser = new KidUser();
        kidUser.registerAccount(10);
        kidUser.requestBook("Kids");

        LibraryUser kidUser1 = new KidUser();
        kidUser1.registerAccount(18);
        kidUser1.requestBook("Fiction");

        // Test case #2
        LibraryUser adultUser = new AdultUser();
        adultUser.registerAccount(5);
        adultUser.requestBook("Kids");

        LibraryUser AdultUser1 = new AdultUser();
        AdultUser1.registerAccount(23);
        AdultUser1.requestBook("Fiction");
	}

}