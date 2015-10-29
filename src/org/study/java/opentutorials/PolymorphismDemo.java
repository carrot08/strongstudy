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
        System.out.println("좌우로 왔다갔다한다.");
    }

    @Override
    public void attack() {
       System.out.println("몸으로 공격한다.");
    }

    @Override
    public void stand() {
        System.out.println("일정기간 가만히 서 있는다.");
    }
}

class BallMonster extends NormalMonster {

    @Override
    public void attack() {
       System.out.println("두번 몸으로 공격한다.");
    }
}


class SnakeMonster extends NormalMonster implements FollowMonster{

    @Override
    public void walk() {
        System.out.println("랜덤으로 움직인다.");
    }

    @Override
    public void attack() {
        System.out.println("독을 쏜다.");
    }

    @Override
    public void follow() {
        System.out.println("유저가 가까이 있으면 따라간다.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        SnakeMonster snake = new SnakeMonster();
        BallMonster ball = new BallMonster();
        
        walkMonster((Monster)snake);
        walkMonster((Monster)ball);
        
        ball.attack();
        snake.attack();
    }
    
    public static void walkMonster(Monster monster) {
        monster.walk();
    }
}
