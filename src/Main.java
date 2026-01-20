import Model.*;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Admin admin=loadAdmin();
        int option=0;
        while(option!=7) {
            switch(option) {
                case 1: admin.buyerSignUp(scan);break;
                case 2: admin.buyerSignIn(scan).showActions();break;
                case 3: admin.sellerSignUp(scan);break;
                case 4: admin.sellerSignIn(scan).showActions();break;
                case 5: admin.showBuyers();break;
                case 6: admin.showSellers();break;
            }
            System.out.println("1 Buyer Sign UP\n2 Buyer Sign IN\n3 Seller Sign UP\n4 Seller Sign IN\n7 Exit");
            //System.out.println("5 show buyer");System.out.println("6 show sellers");
            option= Integer.parseInt(scan.nextLine());
        }
        saveAdmin(admin);
    }
    private static final String FILE_NAME = "admin.ser";
    public static Admin loadAdmin() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("File not found. Creating new Admin...");
            return new Admin();
        }
        try (ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file))) {
            System.out.println("Loading Admin from file...");
            return (Admin) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error reading file. Creating new Admin...");
            return new Admin();
        }
    }
    public static void saveAdmin(Admin admin) {
        try (ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(admin);
            System.out.println("Admin saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}