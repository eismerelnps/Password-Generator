package CardCenter;

public class MatrixCard {
    private String cardNumber;
    private int[][] matrix = new int[10][10];

    public MatrixCard(String cardNumber, int[][] matrix) {
        this.cardNumber = cardNumber;
        this.matrix = matrix;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
