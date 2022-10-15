package by.tms.project;

public class Work2 {

    public static void main(String[] args) {
        Integer count1 = 10;
        Integer count2 = 10;

        System.out.println(count1 == count2);
        System.out.println(count1.equals(count2));

        Integer count3 = 130;
        Integer count4 = 130;

        System.out.println(count3 == count4);
        System.out.println(count3.equals(count4));

        Integer count5 = new Integer(5);
        Integer count6 = new Integer(5);

        System.out.println(count5 == count6);
        System.out.println(count5.equals(count6));

        String str1 = "value";
        String str2 = "value";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("value");
        String str4 = new String("value");

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
