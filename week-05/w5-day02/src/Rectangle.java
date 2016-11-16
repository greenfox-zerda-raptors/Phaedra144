/**
 * Created by ${SzilviaB} on 2016. 11. 15..
 */
public class Rectangle {
    int width;
    int height;

    public Rectangle(){
        width = 1;
        height = 1;
    }
//    public Rectangle(int width){
//
//    }
    public int getArea(int width, int height) {
        int area = width * height;
        return area;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {

        this.height = height;
    }
}
