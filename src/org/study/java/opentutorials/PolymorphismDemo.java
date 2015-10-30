package org.study.java.opentutorials;

import java.nio.file.Watchable;

interface Monster{
    public void walk();
    public void attack();
    public void stand();
}

interface FollowMonster extends Monster{
    public void follow();
}

class NormalMonster implements Monster{
    @Override
    public void walk() {
        System.out.println("�¿�� �Դٰ����Ѵ�.");
    }

    @Override
    public void attack() {
       System.out.println("������ �����Ѵ�.");
    }

    @Override
    public void stand() {
        System.out.println("�����Ⱓ ������ �� �ִ´�.");
    }
}

class BallMonster extends NormalMonster {

    @Override
    public void attack() {
       System.out.println("�ι� ������ �����Ѵ�.");
    }
}


class SnakeMonster extends NormalMonster implements FollowMonster{

    @Override
    public void walk() {
        System.out.println("�������� �����δ�.");
    }

    @Override
    public void attack() {
        System.out.println("���� ���.");
    }

    @Override
    public void follow() {
        System.out.println("������ ������ ������ ���󰣴�.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        SnakeMonster snake = new SnakeMonster();
        BallMonster ball = new BallMonster();
        
        walkMonster(snake);
        walkMonster(ball);
        
        ball.attack();
        snake.attack();
    }
    
    public static void walkMonster(Monster monster) {
        monster.walk();
    }
}
