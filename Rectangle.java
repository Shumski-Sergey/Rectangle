package intexsoft.exceptions;

public class Rectangle {
    private int hight;
    private int lenght;

    public Rectangle(int hight, int lenght) throws MyException {
        if (hight < 0 || lenght < 0) {  //проверка исключения
            throw new MyException("В значение длинны или высоты прямоугольника были переданы отрицательные значения");
        }

        this.hight = hight;
        this.lenght = lenght;
    }

    public int getSquare() {
        return this.hight * this.lenght;
    } //метод подсчета площади прямоугольника

    public void drawRectangle(){        //метод рисования прямоугольника
        for(int i=0; i<this.lenght; i++){
            System.out.print(" - ");
        }
        for(int i=0; i<this.hight; i++){
            System.out.print("\n|");
            for(int j =0; j<this.lenght-1; j++){
                System.out.print("   ");
            }
            System.out.print("|");
        }
        System.out.println("");
        for(int i=0; i<this.lenght; i++){
            System.out.print(" - ");
        }
        System.out.println("");
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
