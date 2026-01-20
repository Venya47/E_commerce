package Model;

import java.io.Serializable;

public abstract class User implements Serializable {
    protected String name;
    protected String email;
    protected String pass;
    public User(String name,String email,String pass)
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
