package com.example.firstlessons.standart_programlama;

public class Donguler {
    public static void main(String[] args){
        //1,2,3
        for (int i=1; i<4; i++){
            System.out.println("Döngü 1:"+i);
        }

        // 10 ile 20 , 5 er artış
        for (int x=10; x<20; x+=5){
            System.out.println("Döngü 2:"+x);
        }

        // 20 ile 5 arasında 5er azalsın
        for (int y=20; y>4; y-=5){
            System.out.println("Döngü 3:"+y);
        }

        //1,2,3
        int counter = 1;

        while (counter < 4){
            System.out.println("Döngü 4:"+counter);
            counter ++;
        }

        //1,2,3,4,5
        for(int i=1; i<6;i++){
            if(i==3){
                break;
            }
            System.out.println("Döngü 5:"+i);
        }

        for(int i=1; i<6;i++){
            if(i==3){
                continue;
            }
            System.out.println("Döngü 6:"+i);
        }

    }
}
