package com.example.firstlessons.degiskenler;

public class DegiskenOlusturma {
    public static void main(String[] args) {
        String studentName = "Ahmet";
        int age = 18;
        double length = 1.78;
        char firstLatter = 'A';
        boolean stillStudent = true;

        System.out.println(studentName);
        System.out.println(age);
        System.out.println(length);
        System.out.println(stillStudent);

        int product_id = 3416;
        String product_name = "Watch";
        int product_number = 100;
        double product_price = 149.99;
        String product_producer = "Rolex";

        System.out.println("Product Id: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Number: " + product_number);
        System.out.println("Product Price: " + product_id);
        System.out.println("Product Producer:" + product_producer);

        // Sabitler: Constant
        // final (java), let (swift), dart(final-constant)

        final int number = 40;  // swiftte let burda final
        System.out.println(number);
        // number = 100 yapamazsın

        // Tür değişimi -Type Casting
        // 1.Sayıldan Sayısala / int to int

        int i = 67;
        double d = 35.98;
        int lastOne = (int) d; // explicit
        double second = i; // unexplicit
        System.out.println(second);
        System.out.println(lastOne);

        // Sayısaldan Metine / int to string
        String third = String.valueOf(lastOne);
        String fourth = String.valueOf(second);

        System.out.println(third + " " + fourth);
        // Metinden Sayısala  / string to int
        String value1 = "3456";
        String value2 = "43.91";

        int valueNew1 = Integer.parseInt(value1);
        double valueNew2 = Double.parseDouble(value2);

        System.out.println(valueNew1);
        System.out.println(valueNew2);

    }
}
