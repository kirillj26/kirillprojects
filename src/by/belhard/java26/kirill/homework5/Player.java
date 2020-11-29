package by.belhard.java26.kirill.homework5;

public class Player {
    String name;
    private double x, y, distanse = 0;

    public Player(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public Player() {
        name = "DefaultName";
        x = 10;
        y = 20;
    }

    public void move(int newX, int newY) {
        distanse += Math.sqrt(Math.abs(x - newX) * Math.abs(x - newX) + Math.abs(y - newY) * Math.abs(y - newY));
        System.out.println("Пройденное растояние=" + (Math.sqrt(Math.abs(x - newX) * Math.abs(x - newX) + Math.abs(y - newY) * Math.abs(y - newY))));
        x = newX;
        y = newY;
    }

    public void showDistanse() {
        System.out.println("Общее Пройденное растояние=" + distanse);
        System.out.println();
        return;
    }

    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", distanse=" + distanse +
                '}';
    }
}
