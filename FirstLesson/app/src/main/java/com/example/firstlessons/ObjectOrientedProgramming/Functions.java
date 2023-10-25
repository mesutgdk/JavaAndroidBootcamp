package com.example.firstlessons.ObjectOrientedProgramming;

public class Functions {
    //Void geri dönüş değeri olmayan
    public void salutVoid(){
        String result = "Hello There";
        System.out.println(result);
    }

    // Return: geri dönüşü olanlar
    public String salutReturn2() {
        String result = "Hello there2";
        return result;
    }

    // Parameter: parametre dönen
    public void salutParameter(String name){
        String result = "Hello There " + name;
        System.out.println(result);
    }

    //overLoading
    public void multiply(int num1, int num2){
        System.out.println("Çarpma: "+num1*num2);
    }

    public void multiply(double num1, double num2){
        System.out.println("Çarpma: "+num1*num2);
    }

    public void multiply(int num1, int num2, String name){
        System.out.println("Çarpma: " + num1*num2+" "+name );
    }

}
