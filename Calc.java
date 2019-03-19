public class Calc {
    // Тестове завдання
    // Найда Ростислав

    public static void main(String [] args){
        Reader reader = new Reader();
        System.out.println("Введіть перше значення");
        reader.scan();
        System.out.println("Введіть дію\" +,-,*,/,\"");
        reader.scan();
        System.out.println("Введіть друге значення");
        reader.scan();
        CalcOperations calcOperations = new CalcOperations(reader.list) ;
        System.out.println("Ваш результат = " + calcOperations.doOperation());



    }
}
