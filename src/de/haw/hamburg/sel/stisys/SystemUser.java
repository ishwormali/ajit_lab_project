package de.haw.hamburg.sel.stisys;

public class SystemUser implements User {
    String name;
    String emailAddress;
    String password;

    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getEmailAddress() {
        return this.emailAddress;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public boolean createLogin() {
       return true;
    }
}
