/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Workshop05 {

    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle(3, 4);

        System.out.println(myRectangle);


        Block myBlock = new Block();
        myBlock.setHeight(2);
        myBlock.setWidth(5);
        myBlock.setLength(5);

        System.out.println(myBlock);

        Square mySquare = new Square(5);

        System.out.println(mySquare);

    }


}
