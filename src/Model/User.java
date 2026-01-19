package Model;

public abstract class User {
    String name;
    String email;
    String pass;
    User(String name,String email,String pass)
    {
        this.name=name;
        this.email=email;
        this.pass=pass;
    }
    abstract public void showActions();
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPass() {
        return pass;
    }
}
