import Model.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Admin admin=new Admin();
        int option=0;
        while(option!=7) {
            switch(option) {
                case 1: {
                    admin.buyerSignUp();
                    break;
                }
                case 2: {
                    admin.buyerSignIn().showActions();
                    break;
                }
                case 3: {
                    admin.sellerSignUp();
                    break;
                }
                case 4: {
                    admin.sellerSignIn().showActions();
                    break;
                }
                case 5: {
                    admin.showBuyers();
                    break;
                }
                case 6: {
                    admin.showSellers();
                    break;
                }
            }
            System.out.println("1 Buyer Sign UP");
            System.out.println("2 Buyer Sign IN");
            System.out.println("3 Seller Sign UP");
            System.out.println("4 Seller Sign IN");
            System.out.println("5 show buyer");
            System.out.println("6 show sellers");
            System.out.println("7 Exit");
            option= Integer.parseInt(scan.nextLine());
        }
    }
}