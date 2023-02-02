package Control;

public class Character {
    private char[] capitalChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z'};
    private char[] MinChars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y','z'};
    private char[] Numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    private char[] especialChars = {'~', '!', '@', '#', '$', '%', '%', '^', '&', '*','(', ')', '_', '-', '=', '+', '[', ']', '{', '}', ';', ':', '"', '<', '>', ',', '.', '/', '?'};

    public Character(char[] CapitalChars, char[] minChars, char[]Numbers, char[]especialChars){
    this.capitalChars = capitalChars;
    this.MinChars = minChars;
    this.Numbers = Numbers;
    this.especialChars = especialChars;
}
    public Character(){

    }

    public char[] getCapitalChars() {
        return capitalChars;
    }

    public char[] getMinChars() {
        return MinChars;
    }

    public char[] getNumbers() {
        return Numbers;
    }

    public char[] getEspecialChars() {
        return especialChars;
    }

    public int getCapLenght(){
        return capitalChars.length;
    }


    public void test(){
        System.out.println(capitalChars.length);
    }
}
