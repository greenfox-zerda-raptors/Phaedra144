import java.util.Arrays;

/**
 * Created by ${SzilviaB} on 2017. 02. 17..
 */
public class CountMatrixRows {


    public static int[] countMatrixRows(int[][]numberMatrix){
        int[]rowsum = new int[numberMatrix.length];
        int sum;

        for (int i = 0; i < numberMatrix.length; i++){
            sum = 0;
            for (int j = 0; j < numberMatrix[i].length; j++){
                sum += numberMatrix[i][j];
                rowsum[i] += numberMatrix[i][j];
            }
        }

        return rowsum;
    }

    public static void main(String[] args) {
        int [][] scores = {{ 20, 18, 23, 20, 16 },
                { 30, 20, 18, 21, 20 },
                { 16, 19, 16, 53, 24 },
                { 25, 24, 22, 24, 25 }};
        countMatrixRows(scores);
    }

}
