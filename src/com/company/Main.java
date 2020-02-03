package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
       Mouse mouse = new Mouse();
       Cat cat = new Cat();
        int i = 0;
        for (; i < rnd.nextInt(50); i++) {
            // cat.setA(i);
        }
            if(cat.getA(i) == 12){
                System.out.println("Поймал," + mouse.getName());
            }else System.out.println("Не поймал");
        }
    }

