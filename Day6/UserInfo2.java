import java.util.Scanner;

class userinfo{
    String name;
    private int userid;
    protected int age;
    String place;
    String companyname;
    private String position;


    public void createUser(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Give Details");
            System.out.println("Name");
            name = scan.nextLine();
            System.out.println("userid");
            userid = scan.nextInt();
            System.out.println("age");
            age = scan.nextInt();
            System.out.println("companyname");
            companyname = scan.next();
            System.out.println("position");
            position = scan.next();
            System.out.println("Place");
            place = scan.next();
        }

    }

    public void displayUser(){
        System.out.println("Name:" + name);
        System.out.println("userID:" + userid);
        System.out.println("Age:" + age);
        System.out.println("Place:" + place);
        System.out.println("Company:" + companyname);
        System.out.println("Name:" + position);
    }


}

public class UserInfo2{
    public static void main(String[] args) {

        var us = new userinfo();
        us.createUser();
        us.displayUser();

        
    }
}
