package user;

class Main {

    public static void main(String[] args) {
//        User educative = new User("Educative","12345"); //Creates a new user and stores the password and username
//
//        User u1;
//
//        educative.login("Educative","12345"); //Grants access because credentials are valid
//
//        educative.login("Educative", "3456"); //Does not grant access because the credentials are invalid
//
//        //educative.password = "3456"; //Uncommenting this line will give an error
//        //Fields of User class cannot be accessed now

        Test gc = new Test();
        gc.insertItem("Onion");
        gc.insertItem("Garlic");
        gc.insertItem("Bread");
        gc.printList();
    }

}
