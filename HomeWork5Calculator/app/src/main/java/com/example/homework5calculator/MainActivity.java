package com.example.homework5calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.homework5calculator.databinding.ActivityMainBinding;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private boolean isFinishedTypingNumber = true;

    private String displayValue = "0", function = "";

    private int number1 = 0, number2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        String calculatedData = binding.textView.getText().toString();

        binding.button0.setOnClickListener(v -> {
            if (displayValue != "0"){
                displayValue = displayValue + "0";

            } else {
                displayValue = "0";
            }
            binding.textView.setText(displayValue);
        });
        binding.button1.setOnClickListener(v -> {
            if (displayValue != "0"){
                displayValue = displayValue + "1";
            } else {
                displayValue = "1";
            }
            binding.textView.setText(displayValue);
        });
        binding.button2.setOnClickListener(v -> {
            if (displayValue != "0"){
                displayValue = displayValue + "2";

            } else {
                displayValue = "2";
            }
            binding.textView.setText(displayValue);
        });
        binding.button3.setOnClickListener(v -> {
            if (displayValue != "0"){
                displayValue = displayValue + "3";

            } else {
                displayValue = "3";
            }
            binding.textView.setText(displayValue);
        });
        binding.button4.setOnClickListener(v -> {
            if (displayValue != "0"){
                displayValue = displayValue + "4";

            } else {
                displayValue = "4";
            }
            binding.textView.setText(displayValue);
        });
        binding.button5.setOnClickListener(v -> {
            if (displayValue != "0"){
                displayValue = displayValue + "5";

            } else {
                displayValue = "5";
            }
            binding.textView.setText(displayValue);
        });
        binding.button6.setOnClickListener(v -> {
            if (displayValue != "0"){
                displayValue = displayValue + "6";

            } else {
                displayValue = "6";
            }
            binding.textView.setText(displayValue);
        });
        binding.button7.setOnClickListener(v -> {
            if (displayValue != "0"){
                displayValue = displayValue + "7";

            } else {
                displayValue = "7";
            }
            binding.textView.setText(displayValue);
        });
        binding.button8.setOnClickListener(v -> {
            if (displayValue != "0"){
                displayValue = displayValue + "8";

            } else {
                displayValue = "8";
            }
            binding.textView.setText(displayValue);
        });
        binding.button9.setOnClickListener(v -> {
            if (displayValue != "0"){
                displayValue = displayValue + "9";

            } else {
                displayValue = "9";
            }
            binding.textView.setText(displayValue);
        });

        binding.buttonReset.setOnClickListener(v -> {
                reset();
                binding.textView.setText(displayValue);
        });

        binding.buttonAdd.setOnClickListener(v -> {

            if (isFinishedTypingNumber){
                number1 = Integer.parseInt(displayValue);
                function = "+";
                System.out.println("isFinished= "+isFinishedTypingNumber+ " displayValue: "+displayValue);
                displayValue = "";
                isFinishedTypingNumber = false;
                System.out.println("isFinished= "+isFinishedTypingNumber+ " displayValue: "+displayValue);

            } else {
                number2 = Integer.parseInt(displayValue);
                displayValue = String.valueOf(number1+number2);
                setText(displayValue);
                displayValue = "";
                number1 = (number1+number2);

                isFinishedTypingNumber = true;
            }
        });

        binding.buttonSubtract.setOnClickListener(v -> {

            if (isFinishedTypingNumber){
                number1 = Integer.parseInt(displayValue);
                function = "-";
                System.out.println("isFinished= "+isFinishedTypingNumber+ " displayValue: "+displayValue);
                displayValue = "";
                isFinishedTypingNumber = false;
                System.out.println("isFinished= "+isFinishedTypingNumber+ " displayValue: "+displayValue);

            } else {
                number2 = Integer.parseInt(displayValue);
                displayValue = String.valueOf(number1-number2);
                setText(displayValue);
                displayValue = "";
                number1 = (number1-number2);

                isFinishedTypingNumber = true;
            }
        });
        binding.buttonMultiply.setOnClickListener(v -> {

            if (isFinishedTypingNumber){
                number1 = Integer.parseInt(displayValue);
                function = "x";

                displayValue = "";
                 isFinishedTypingNumber = false;
                System.out.println("isFinished= "+isFinishedTypingNumber+ " displayValue: "+displayValue);

            } else {
                number2 = Integer.parseInt(displayValue);
                displayValue = String.valueOf(number1*number2);
                setText(displayValue);
                number1 = (number1*number2);
                number2 = 0;

                isFinishedTypingNumber = true;
                //binding.textView.setText(displayValue);
            }
        });
        binding.buttonDivide.setOnClickListener(v -> {

            if (isFinishedTypingNumber){
                number1 = Integer.parseInt(displayValue);
                function = "/";
                displayValue = "";
                isFinishedTypingNumber = false;


            } else {
                number2 = Integer.parseInt(displayValue);
                displayValue = String.valueOf(number1/number2);
                setText(displayValue);
                number1 = (number1/number2);
                number2 = 0;

                isFinishedTypingNumber = true;
            }
        });
        binding.buttonPercentage.setOnClickListener(v -> {
            number1 = Integer.parseInt(displayValue);
            function = "%";
        });

        binding.buttonNegative.setOnClickListener(v -> {
            number1 = Integer.parseInt(displayValue);
            function = "!";
        });


        binding.buttonEqual.setOnClickListener(v -> {
            number2 = Integer.parseInt(displayValue);

            switch (function){
                case "+":
                    displayValue = String.valueOf(number1+number2);
                    setText(displayValue);
                    reset();
                    break;
                case "-":
                    displayValue = String.valueOf(number1-number2);
                    setText(displayValue);
                    reset();
                    break;
                case "/":
                    displayValue = String.valueOf(number1/number2);
                    setText(displayValue);
                    reset();
                    break;
                case "x":
                    displayValue = String.valueOf(number1*number2);
                    setText(displayValue);
                    reset();
                    break;
                case "%":
                    float perValue = (number1*1.0f)/100;
                    displayValue = String.valueOf(perValue);
                    setText(displayValue);
                    reset();
                    break;
                case "!":
                    displayValue = String.valueOf(-1*number1);
                    setText(displayValue);
                    reset();
                    break;
                default:
                    displayValue = "0";
                    setText(displayValue);
                    reset();
                    break;

            }

        });

        setContentView(binding.getRoot());

    }
    private void reset(){
        displayValue = "0";
        number2 = 0;
        number1 = 0;
        function = "";
        isFinishedTypingNumber = true;
    }
    private  void setText(String text){
    binding.textView.setText(text);
    }

}

