package Control;

import java.net.URI;
import java.security.KeyStore.PasswordProtection;

public class Login {
    private String ID;
    private String UserName;
    private PasswordProtection Password;
    private URI URL;
    private String Notes;

    public Login(String ID, String UserName, PasswordProtection Password, URI URL, String Notes) {
        this.ID = ID;
        this.UserName = UserName;
        this.Password = Password;
        this.URL = URL;
        this.Notes = Notes;
    }

    public String getID() {
        return ID;
    }

    public String getUserName() {
        return UserName;
    }

    public PasswordProtection getPassword() {
        return Password;
    }

    public URI getURL() {
        return URL;
    }

    public String getNotes() {
        return Notes;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(PasswordProtection password) {
        Password = password;
    }

    public void setURL(URI URL) {
        this.URL = URL;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
