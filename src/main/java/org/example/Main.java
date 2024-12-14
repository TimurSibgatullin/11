package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        int fieldWidth = 1000;
        int fieldHeigth = 1000;
        int finishFieldWight = 10;
        int finishFieldHeight = 10;
        int finishX = 495;
        int finishY = 495;

        Entity[] entities = new Entity[4];
        entities[0] = new Grasshopper(0, 0); // сущности без хода назад финишируют не во всех случаях
        entities[1] = new Turtle(0, 0); // сущности без хода назад финишируют не во всех случаях
        entities[2] = new Ant(0, 0);  // муравей лидирует почти всегда, после нечто
        entities[3] = new Something(0, 0); // нечто со случайным перемещением -- нарушает баланс

        Entity.setFieldSize(fieldWidth, fieldHeigth);

        Game game = new Game(fieldWidth, fieldHeigth,
                finishFieldWight, finishFieldHeight,
                finishX, finishY, entities);

        Entity champion = game.start();
        System.out.println("Победитель: " + champion);
        System.out.println("Количество шагов: " + game.getSteps());
    }
}