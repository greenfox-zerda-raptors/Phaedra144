import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ${SzilviaB} on 2017. 01. 17..
 */
public class GenerateNextGenerationTest {

    NextGeneration newObject;

    @Before
    public void setUp() throws Exception {
        newObject = new NextGeneration();
    }

    @Test
    public void testOneGenerateNextGeneration() throws Exception {
        char[][]oldGenCharMatrix = new char[][]{
                {'.','.','.','.','.','.','.','.',},
                {'.','.','.','*','*','.','.','.',},
                {'.','.','.','.','*','.','.','.',},
                {'.','.','.','.','.','.','.','.',}};

        char[][]nextGenCharMatrix = new char[][]{
                {'.','.','.','.','.','.','.','.',},
                {'.','.','.','*','*','.','.','.',},
                {'.','.','.','*','*','.','.','.',},
                {'.','.','.','.','.','.','.','.',}};

        assertArrayEquals(nextGenCharMatrix, newObject.generateNextGeneration(oldGenCharMatrix));
    }

    @Test
    public void testTwoGenerateNextGeneration() throws Exception {
        char[][]oldGenCharMatrix = new char[][]{
                {'.','.','.','.','.','.','.','.',},
                {'.','.','.','*','*','.','.','.',},
                {'.','.','.','*','*','.','.','.',},
                {'.','.','.','.','.','.','.','.',}};

        char[][]nextGenCharMatrix = new char[][]{
                {'.','.','.','.','.','.','.','.',},
                {'.','.','.','*','*','.','.','.',},
                {'.','.','.','*','*','.','.','.',},
                {'.','.','.','.','.','.','.','.',}};

        assertArrayEquals(nextGenCharMatrix, newObject.generateNextGeneration(oldGenCharMatrix));
    }

    @Test
    public void testThreeGenerateNextGeneration() throws Exception {
        char[][]oldGenCharMatrix = new char[][]{
                {'.','.','.','.','.','.','.','*',},
                {'.','.','.','.','.','.','.','.',},
                {'.','.','*','*','*','.','.','.',},
                {'.','.','.','.','.','.','.','.',}};

        char[][]nextGenCharMatrix = new char[][]{
                {'.','.','.','.','.','.','.','.',},
                {'.','.','.','*','.','.','.','.',},
                {'.','.','.','*','.','.','.','.',},
                {'.','.','.','*','.','.','.','.',}};

        assertArrayEquals(nextGenCharMatrix, newObject.generateNextGeneration(oldGenCharMatrix));
    }

    @Test
    public void testFourGenerateNextGeneration() throws Exception {
        char[][]oldGenCharMatrix = new char[][]{
                {'.','*','.','.','.','.','.','*',},
                {'.','.','*','.','.','.','.','.',},
                {'*','*','*','.','.','.','.','.',},
                {'.','.','.','.','.','.','.','.',}};

        char[][]nextGenCharMatrix = new char[][]{
                {'.','.','.','.','.','.','.','.',},
                {'*','.','*','.','.','.','.','.',},
                {'.','*','*','.','.','.','.','.',},
                {'.','*','.','.','.','.','.','.',}};

        assertArrayEquals(nextGenCharMatrix, newObject.generateNextGeneration(oldGenCharMatrix));
    }



}