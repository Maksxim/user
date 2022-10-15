package by.tms.project;

public class Work3 {

    public static void main(String[] args) throws CloneNotSupportedException {
        User myUser = new User("Max","3463",new Address("456"));
        System.out.println(myUser.clone());
        System.out.println(myUser.cloneDeep());
    }
}
