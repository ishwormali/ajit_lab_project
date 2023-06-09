package de.haw.hamburg.sel.stisys;

public interface User {
    String getName();
    String getEmailAddress();
    String getPassword();
    boolean createLogin();
}
