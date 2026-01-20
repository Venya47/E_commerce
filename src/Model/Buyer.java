package Model;
import java.io.Serializable;
import java.util.*;
public class Buyer extends User implements Serializable {
    private int buyer_id;
    Buyer(int b_id,String name,String email,String pass) {
        super(name,email,pass);
        buyer_id=b_id;
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
