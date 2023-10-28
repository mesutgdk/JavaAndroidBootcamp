package com.example.firstlessons.ObjectOrientedProgramming.kalitim;

public class KalitimMain {
    public static void main(String[] args) {
        Palace topkapiPalace = new Palace();
        topkapiPalace.setTowerNumber(10);
        topkapiPalace.setWindowNumbers(200);
        System.out.println(topkapiPalace.getTowerNumber());
        System.out.println(topkapiPalace.getWindowNumbers());

        Villa atahanVilla = new Villa();
        atahanVilla.setHasGarage(true);

        System.out.println(atahanVilla.isHasGarage());
        System.out.println(atahanVilla.getWindowNumbers());


        //Upcasting
        // Sub > Super
        Palace palace = new Palace();
        House house = palace;

        // Downcasting
        // Super > Sub

        House home = new House();
        Palace newPalace = (Palace) home;

        //Type Controll
        if (topkapiPalace instanceof Palace){
            System.out.println("SarayDır");
        }else{
            System.out.println("Saray Değildir");
        }
    }
}
