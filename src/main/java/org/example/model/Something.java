package org.example.model;

public class Something extends Entity {
    public Something(int x, int y) {
        super("Нечто", x, y);
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 4); // 0 - вверх, 1 - вправо, 2 - вниз, 3 - влево
        int steps = (int) (Math.random() * 10) + 1; // Случайное число шагов от 1 до 10
        switch (direction) {
            case 0:
                y = Math.max(0, y - steps);
                break;
            case 1:
                x = Math.min(fieldWidth, x + steps);
                break;
            case 2:
                y = Math.min(fieldHeigth, y + steps);
                break;
            case 3:
                x = Math.max(0, x - steps);
                break;
        }
    }
}
