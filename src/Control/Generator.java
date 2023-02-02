package Control;

import java.util.ArrayList;

public class Generator {
    static int passwordLength = 0;
    //static char[] password ;
    String finalPassword;
    static boolean capitalChars = false;
    static boolean minChars = false;
    static boolean numbers = false;
    static boolean specialChar = false;
    static Character character = new Character();
    static ArrayList<char[]> arrayOfChars ;

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



    public void setOptions(int length, boolean cap, boolean min, boolean num, boolean special){
        passwordLength = length;
        capitalChars = cap;
        minChars = min;
        numbers = num;
        specialChar = special;
        setArrayOfChar();
    }//función para definir la cantidad de caracteres que va a tener la contrasena asi como definir si contendra letras mayusculas, minusculas, numeros o caracteres especiales
    public void setArrayOfChar() {
        for (int i = 0; i < passwordLength; i++) {
            if (isCapitalChars()) {
               arrayOfChars.set(i, character.getCapitalChars());
            } else if (isMinChars()) {
                arrayOfChars.add(character.getMinChars());
            } else if (isNumbers()) {
                arrayOfChars.add(character.getNumbers());
            } else if (isSpecialChar()) {
                arrayOfChars.add(character.getEspecialChars());
            }
        }
    }
    public static String Generate(){
        char[] password = new char[passwordLength];
        String finalPassword = null;
        int indexRandom = 0 ;

        for (int i = 0; i<passwordLength; i++){
            indexRandom = (int) (Math.random()*25);

            System.out.println(indexRandom);

            char[] character;
            character = arrayOfChars.get(i);
            password[i] = character[i];

        }
        System.out.println("Lenght:"+passwordLength);
        System.out.println(password );

        for (int i = 0; i < password.length; i++){
            finalPassword += String.valueOf(password[i]);
        }
        return finalPassword;
    }
}
