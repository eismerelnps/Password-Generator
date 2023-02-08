package Control;

import Cards.Login;

import java.net.URI;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Random;

public class Generator {
    Login login;
    ArrayList<Login> loginArrayList = new ArrayList<>();
    static boolean capitalChars = false;
    static boolean minChars = false;
    static boolean numbers = false;
    static boolean specialChar = false;
    static Character character = new Character();
    static int passwordLength = 0;//longitud o cantidad de caracteres que tendrá la contraseña


    public static boolean isCapitalChars() {
        return capitalChars;
    }

    public static boolean isMinChars() {
        return minChars;
    }

    public static boolean isNumbers() {
        return numbers;
    }

    public static boolean isSpecialChar() {
        return specialChar;
    }


    public void setOptions(int length, boolean cap, boolean min, boolean num, boolean special) {
        passwordLength = length;
        capitalChars = cap;
        minChars = min;
        numbers = num;
        specialChar = special;

        generate(length);
    }//funtion for setting password's length, and if it will contain Capital, min, number or spetial chars

    public String generate(int length) {
        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());
        StringBuilder charCategories = new StringBuilder();
        if (minChars) {
            charCategories.append(character.getMinChars());
        }
        if (capitalChars) {
            charCategories.append(character.getCapitalChars());
        }
        if (numbers) {
            charCategories.append(character.getNumbers());
        }
        if (specialChar) {
            charCategories.append(character.getEspecialChars());
        }
        for (int i = 0; i < length; i++) {
            password.append(charCategories.charAt(random.nextInt(charCategories.length())));
        }
        return new String(password);
    }//this funtion generates the password according to the especifications previously setted by user

    public void save(String ID, String UserName, KeyStore.PasswordProtection Password, URI URL, String Notes) {
        login = new Login(ID, UserName, Password, URL, Notes);
        loginArrayList.add(login);
    }//funtion for adding a new login item to the array, usesrs will be able to save login information like Name, username, URL, password and extra notes

    public void saveCard(){
        //method for saving credit cards on program
    }
}

