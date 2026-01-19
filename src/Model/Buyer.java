package Model;
import java.util.*;
public class Buyer extends User{
    Scanner scan=new Scanner(System.in);
    static int  buyer_id_generator=1;
    private int buyer_id;
    Buyer(String name,String email,String pass) {
        super(name,email,pass);
        buyer_id=buyer_id_generator++;
    }
    public int getBuyer_id() {
        return buyer_id;
    }
    public String toString() {
        return buyer_id+"  "+name+"    "+email+"\n";
    }
    public void showActions()
    {
//        int option=0;
//        while(option!=4)
//        {
//            switch(option) {
//                case 1: {
//                    break;
//                }
//                case 2:{
//                    break;
//                }
//            }
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            option=scan.nextInt();
//        }
    }
}
