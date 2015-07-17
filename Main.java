package intexsoft.exceptions;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            Rectangle rectangle = new Rectangle(30, 50);
            rectangle.drawRectangle();
            System.out.println("Площадь равна "+rectangle.getSquare());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
