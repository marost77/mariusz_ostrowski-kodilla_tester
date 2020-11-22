public class User {
    private String userName;
    private int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;    }

    public int getAge() {return userAge;} //  po co ten get ?

    public String getName() {return userName;} //  po co ten get ?



    public static void main(String[] args) {



        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User users[] = {anna, betty, carl, david, eva, frankie};


            double sum = 0;
            for (int i = 0; i < users.length; i++) {
                sum = sum + users[i].userAge;
            }

            double average = sum / users.length;
            System.out.println("Average age is: "+average);

        for (int i = 0; i < users.length; i++) {
            if (users[i].userAge < average) {
                System.out.println(users[i].userName);
            }

        }
        }


}