import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    private String value1;
    CalcOperations calcOperations ;
    Scanner scn = new Scanner(System.in);
    List<String> list = new LinkedList<>();
// Зчитуєм введені дані та заносим в "list"
       void scan(){
       value1 = scn.nextLine();
       list.add(value1);
    }
}
//
