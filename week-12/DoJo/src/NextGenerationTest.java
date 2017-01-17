import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;


/**
 * Created by ${SzilviaB} on 2017. 01. 17..
 */
public class NextGenerationTest {

    NextGeneration myObject;

    @org.junit.Before
    public void setUp() throws Exception {
        myObject = new NextGeneration();

    }

    @Test
    public void testGenerateNumberMatrix(){
        char[][]simpleCharMatrix = new char[][]{{'.','.','.','.','.','.','.','.',}, {'.','.','.','.','.','.','.','.',}, {'.','.','.','.','.','.','.','.',}, {'.','.','.','.','.','.','.','.',}};
        int[][]nullMatrix = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}};
        assertArrayEquals(nullMatrix, myObject.generateNumberMatrix(simpleCharMatrix));
    }

    @Test
    public void testOneGenerateNumberMatrix(){
        char[][]oneCellCharMatrix = new char[][]{{'.','.','.','.','.','.','.','.',}, {'.','.','.','*','.','.','.','.',}, {'.','.','.','.','.','.','.','.',}, {'.','.','.','.','.','.','.','.',}};
        int[][]oneOneMatrix = new int[][]{
                {0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}};
        assertArrayEquals(oneOneMatrix, myObject.generateNumberMatrix(oneCellCharMatrix));
    }

    @Test
    public void testTwoGenerateNumberMatrix(){
        char[][]oneCellCharMatrix = new char[][]{
                {'.','.','.','.','.','.','.','.',},
                {'.','.','.','*','*','.','.','.',},
                {'.','.','.','.','*','.','.','.',},
                {'.','.','.','.','.','.','.','.',}};
        int[][]oneOneMatrix = new int[][]{
                {0, 0, 1, 2, 2, 1, 0, 0},
                {0, 0, 1, 2, 2, 2, 0, 0},
                {0, 0, 1, 3, 2, 2, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0}};
        assertArrayEquals(oneOneMatrix, myObject.generateNumberMatrix(oneCellCharMatrix));
    }

}