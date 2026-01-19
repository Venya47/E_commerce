package Model;

public class Seller extends User{
    static int  seller_id_generator=1;
    private int seller_id;
    Seller(String name,String email,String pass) {
        super(name,email,pass);
        seller_id=seller_id_generator++;
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
