import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


        this.department = setDepartmrnt();


        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;

    }

    private String setDepartmrnt() {
        System.out.print("Enter Department \n1->Sales \n2->Department \n3->Accounting \n0-> For none \nEnter Department ");
        Scanner scan = new Scanner(System.in);
        int depSelect = scan.nextInt();

        if (depSelect == 1) {
            return "Sales";
        } else if (depSelect == 2) {
            return "Development";
        } else if (depSelect == 3) {
            return "Accountitng";
        } else {
            return "";
        }
    }
    private String randomPassword(int length){
        String randomChar = "abcdefghijklmnopqrstuvwxyzx";
        String passwordSet = randomChar.toUpperCase() + randomChar + "1234567890" ;
       char[] password = new char[length];
        for (int i = 0; i <length ; i++) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "Display Name : " + firstName +" " + lastName +
                "\nCompany Email: " + this.email +
                "\nMailBox Capacity: " + this.mailBoxCapacity+
                "\n"
                ;
    }
}
