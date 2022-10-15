package by.tms.project;

public class Work1 {

    public static void main(String[] args) {
        User user1 = new User("Ivan","123456",new Address("987"));
        User user2 = new User("Ivan","123456",new Address("987"));
        User user3 = new User("Ivan","123456",new Address("987"));

        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
        System.out.println(user2.equals(user3));

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
    }
}
