package Model;

import java.sql.SQLOutput;
import java.util.*;

public class Admin {
    Scanner scan=new Scanner(System.in);
    private List<Buyer> buyers=new ArrayList<>();
    private List<Seller> sellers=new ArrayList<>();
    public void buyerSignUp() {
        System.out.println("Enter Name");
        String name=scan.nextLine();
        System.out.println("Enter email");
        String email=scan.nextLine();
        System.out.println("Enter pass");
        String pass=scan.nextLine();
        buyers.add(new Buyer(name,email,pass));
        System.out.println("Buyer Account Created Successfully");
    }
    public Buyer buyerSignIn() {
        System.out.println("Enter email");
        String email=scan.nextLine();
        System.out.println("Enter pass");
        String pass=scan.nextLine();
        for(Buyer b:buyers) {
            if(b.getEmail().equals(email) && b.getPass().equals(pass)) {
                System.out.println("Logged in as Buyer");
                return b;
            }
        }
        System.out.println("Buyer not found");
        return null;
    }
    public void sellerSignUp() {
        System.out.println("Enter Name");
        String name=scan.nextLine();
        System.out.println("Enter email");
        String email=scan.nextLine();
        System.out.println("Enter pass");
        String pass=scan.nextLine();
        sellers.add(new Seller(name,email,pass));
        System.out.println("Buyer Account Created Successfully");
    }
    public Seller sellerSignIn() {
        System.out.println("Enter email");
        String email=scan.nextLine();
        System.out.println("Enter pass");
        String pass=scan.nextLine();
        for(Seller s:sellers) {
            if(s.getEmail().equals(email) && s.getPass().equals(pass)) {
                System.out.println("Logged in as Seller");
                return s;
            }
        }
        System.out.println("Seller not found");
        return null;
    }
    public void showBuyers() {
        for(Buyer b:buyers)
            System.out.print(b.toString());
    }
    public void showSellers() {
        for(Seller s:sellers)
            System.out.println( s.toString());
    }
    public void showActions() {

    }
}
