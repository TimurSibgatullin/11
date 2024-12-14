package org.example.model;

public class Game {
    private int fieldWidth;
    private int fieldHeigth;
    private int finishFieldWight;
    private int finishFieldHeight;
    private int finishX;
    private int finishY;
    private Entity[] players;
    private int steps;

    public Game() {}

    public Game(int fieldWidth, int fieldHeigth, int finishFieldHeight,
                int finishFieldWight, int finishX, int finishY, Entity[] players) {
        this.fieldWidth = fieldWidth;
        this.fieldHeigth = fieldHeigth;
        this.finishFieldWight = finishFieldWight;
        this.finishFieldHeight = finishFieldHeight;
        this.finishX = finishX;
        this.finishY = finishY;
        this.players = players;
        this.steps = 0;
    }

    public int getSteps() {
        return steps;
    }

    public Entity start() {
        while (true) {
            steps++;
            for (Entity player : players) {
                player.move();
                if (player.getX() >= finishX
                        && player.getX() <= finishX + finishFieldWight
                        && player.getY() >= finishY
                        && player.getY() <= finishY + finishFieldHeight) {
                    return player;
                }
            }
        }
    }
}