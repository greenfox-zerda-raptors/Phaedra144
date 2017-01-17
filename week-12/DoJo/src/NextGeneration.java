/**
 * Created by ${SzilviaB} on 2017. 01. 17..
 */
public class NextGeneration {


    char[][] charMatrix;


    public int[][] generateNumberMatrix(char[][] simpleCharMatrix) {
        int[][] numberMatrix = new int[4][8];

        for (int i = 0; i < simpleCharMatrix.length; i++) {
            for (int j = 0; j < simpleCharMatrix[0].length; j++) {
                numberMatrix[i][j] = checkNeighbouringCells(simpleCharMatrix, i, j);
            }
        }

        return numberMatrix;
    }

    public int checkNeighbouringCells(char[][] simpleCharMatrix, int i, int j) {
        int counter = 0;
        int errorCounter = 0;
        try {
            if (simpleCharMatrix[i - 1][j] == '*') {
                counter++;
            }
        } catch (Exception e) {
            errorCounter++;
        }
        try {
            if (simpleCharMatrix[i + 1][j] == '*') {
                counter++;
            }
        } catch (Exception e) {
            errorCounter++;
        }
        try {
            if (simpleCharMatrix[i][j - 1] == '*') {
                counter++;
            }
        } catch (Exception e) {
            errorCounter++;
        }
        try {
            if (simpleCharMatrix[i][j + 1] == '*') {
                counter++;
            }
        } catch (Exception e) {
            errorCounter++;
        }
        try {
            if (simpleCharMatrix[i - 1][j - 1] == '*') {
                counter++;
            }
        } catch (Exception e) {
            errorCounter++;
        }
        try {
            if (simpleCharMatrix[i - 1][j + 1] == '*') {
                counter++;
            }
        } catch (Exception e) {
            errorCounter++;
        }
        try {
            if (simpleCharMatrix[i + 1][j - 1] == '*') {
                counter++;
            }
        } catch (Exception e) {
            errorCounter++;
        }
        try {
            if (simpleCharMatrix[i + 1][j + 1] == '*') {
                counter++;
            }
        } catch (Exception e) {
            errorCounter++;
        }

        return counter;
    }

    private boolean underPopulation(int neighbours, char deadOrAlive){
        return neighbours < 2 && deadOrAlive == '*';
    }

    private boolean overPopulation(int neighbours, char deadOrAlive){
        return neighbours > 3 && deadOrAlive == '*';
    }
    private boolean newLife(int neighbours, char deadOrAlive) {
        return neighbours == 3 && deadOrAlive == '.';
    }

    public char[][] calculateNextGen(int[][] numbMatrix, char[][] charMatrix) {

        for (int i = 0; i < numbMatrix.length; i++) {
            for (int j = 0; j < numbMatrix[0].length; j++) {
                charMatrix[i][j] = checkRules(numbMatrix[i][j], charMatrix [i][j]);
            }
        }

        return charMatrix;
    }

    private char checkRules (int neighbours, char deadOrAlive){
        if (underPopulation(neighbours, deadOrAlive)) {
            return '.';
        } else if (overPopulation(neighbours, deadOrAlive)) {
            return '.';
        } else if (newLife(neighbours, deadOrAlive)) {
            return '*';
        } else
            return deadOrAlive;
    }



    public char[][] generateNextGeneration(char[][] oldGen) {
        int[][] oldGenNumb = generateNumberMatrix(oldGen);
        return calculateNextGen(oldGenNumb, oldGen);
    }


}
