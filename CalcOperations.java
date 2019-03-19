import java.util.*;

// Клас який виконує математичні операції над введеними значеннями.

public class CalcOperations {
private  int a,b;
private char c;
int result;
 public final static   Map<String, Integer> romShifr = new LinkedHashMap<>();
    List<String> list1 = new LinkedList<>();
    String [] element = new String[0];
 static {

     romShifr.put("I",1);
     romShifr.put("II",2);
     romShifr.put("III",3);
     romShifr.put("IV",4);
     romShifr.put("V",5);
     romShifr.put("VI",6);
     romShifr.put("VII",7);
     romShifr.put("VIII",8);
     romShifr.put("IX",9);
     romShifr.put("X",10);

 }
void addElement(){
     for (Map.Entry<String,Integer> arg : romShifr.entrySet()) {
         list1.add(arg.getKey());


    }
}
int checkValue (String s){
     int k = 0;
    for (String d : list1) {
        if (d.equals(s)) {
            k = romShifr.get(s);
            return k;
        }

    }
    return Integer.parseInt(s);
}

// Зчитування значень з переданого ліста в конструкторі =))
 public  CalcOperations(List<String> list){

     addElement();

     this.a = checkValue(list.get(0));
     this.b = checkValue(list.get(2));
     this.c =list.get(1).charAt(c);

 }
    // Виконнання математичних операцый
   int  doOperation() {
     try {
         switch (c) {
             case '+':
                 result = a + b;
                 break;
             case '-':
                 result = a - b;
                 break;
             case '/':
                 result = a / b;
                 break;
             case '*':
                 result = a * b;
                 break;
         }
     }catch (ArithmeticException e){
         System.out.println("Ділити на \"0\" заборонено!!! Бум!!!");
     }
     return result;
    }

}
