package Main;

import CardCenter.Card;
import CardCenter.PartnerCard;
import CardCenter.PrivateCard;
import Login.Login;
import GUI.GUI;

import java.net.URI;
import java.security.KeyStore;
import java.util.ArrayList;

public class Main {
    Login login;
    ArrayList<Login> loginArrayList = new ArrayList<>();
    ArrayList<Card> cardArrayList = new ArrayList<>();
    public static void main(String[] args) {
        GUI gui  = new GUI();
        gui.StartGUI();
    }
    public void saveLogin(String ID, String UserName, KeyStore.PasswordProtection Password, URI URL, String Notes) {
        login = new Login(ID, UserName, Password, URL, Notes);
        loginArrayList.add(login);
    }//funtion for adding a new login item to the array, usesrs will be able to save login information like Name, username, URL, password and extra notes

    public void savePrivateCard(PrivateCard privateCard){
        cardArrayList.add(privateCard);
    }//method for saving private cards to array
    public void savePartnerCard(PartnerCard partnerCard){
        cardArrayList.add(partnerCard);
    }//method for saving partner cards to array
}
