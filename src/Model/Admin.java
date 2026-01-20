package Model;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.*;

public class Admin implements Serializable {
    private int buyer_id_generator=0;
    private int seller_id_generator=0;
    private List<Buyer> buyers=new ArrayList<>();
    private List<Seller> sellers=new ArrayList<>();
    public void buyerSignUp(Scanner scan) {
        System.out.println("Enter Name");
        String name=scan.nextLine();
        System.out.println("Enter email");
        String email=scan.nextLine();
        System.out.println("Enter pass");
        String pass=scan.nextLine();
        buyers.add(new Buyer(buyer_id_generator++,name,email,pass));
        System.out.println("Buyer Account Created Successfully");
    }
    public Buyer buyerSignIn(Scanner scan) {
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
    public void sellerSignUp(Scanner scan) {
        System.out.println("Enter Name");
        String name=scan.nextLine();
        System.out.println("Enter email");
        String email=scan.nextLine();
        System.out.println("Enter pass");
        String pass=scan.nextLine();
        sellers.add(new Seller(seller_id_generator++,name,email,pass));
        System.out.println("Buyer Account Created Successfully");
    }
    public Seller sellerSignIn(Scanner scan) {
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
