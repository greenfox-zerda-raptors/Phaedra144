/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Workshop05 {

    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();

        System.out.println(myRectangle.getArea(12, 2));


        Block myBlock = new Block();
        myBlock.setHeight(2);
        myBlock.setWidth(5);
        myBlock.setLength(5);
        System.out.println(myBlock.getVolume());


    }


}
