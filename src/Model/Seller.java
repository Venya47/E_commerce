package Model;

import java.io.Serializable;

public class Seller extends User implements Serializable {
    private int seller_id;
    Seller(int s_id,String name,String email,String pass) {
        super(name,email,pass);
        seller_id=s_id;
    }
    public int getSeller_id() {
        return seller_id;
    }
    public String toString()
    {
        return seller_id+"  "+name+"    "+email+"\n";
    }
    public void showActions()
    {
    }
}
