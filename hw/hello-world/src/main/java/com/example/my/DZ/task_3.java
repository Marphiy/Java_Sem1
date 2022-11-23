package com.example.my.DZ;
import java.util.Scanner;
import java.io.IOException;

public class task_3 {

    
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in, "utf-8");
        
        double num1 = 0;
        String act = null;
        double res = 0;
        boolean wrongact = false;
      
        while(true){
            boolean isdig = true;
            if(wrongact == false){       
                System.out.printf("Введите число: \n");
                try {
                    num1 = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Не является числом!");
                    isdig = false;
                }
            }
                if(res != 0 & isdig == true){
                    if(act.equals("+")) {
                        res = res + num1;
                        wrongact = false;
                    }
                    else if(act.equals("-")) {
                        res = res - num1;
                        wrongact = false;
                    }
                    else if(act.equals("*")) {
                        res = res * num1;
                        wrongact = false;
                    }
                    else if(act.equals("/")) {
                        if(num1 != 0) {
                            res = res / num1;
                            wrongact = false;
                        }
                        else System.out.println("На 0 делитиь нельзя, действие отменено!");
                    }                  
                }
                else res = num1;
                System.out.printf("Промежуточный результат: %s\n", res);          
            if(isdig == true) {
                System.out.printf("Введите действие с числами: \n");
                act = scanner.nextLine();
                if(act.equals("=")){           
                    System.out.printf("Результат: %s\n", res);
                    scanner.close();
                    break;
                }
                else if(act.equals("=") == false && act.equals("+") == false && act.equals("-") == false && act.equals("*") == false && act.equals("/") == false) {
                    wrongact = true;
                }
                else wrongact = false;               
            }   
        }
   
    }
}
