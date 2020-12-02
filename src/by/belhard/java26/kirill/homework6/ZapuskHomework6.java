package by.belhard.java26.kirill.homework6;

public class ZapuskHomework6 {
    public static void main(String[] args) {
        //запуск Калькулятора

        System.out.println("сумма="+Calculator.sum(5.1,10));
        System.out.println("разность="+Calculator.subtract(5.1,10));
        System.out.println("произведение="+Calculator.multiply(5.1,10));
        System.out.println("частное="+Calculator.divide(5.1,10));
        System.out.println();

        //Выведение таблицы умножения

        for (int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                if(i==1 && j==1)System.out.printf("%4s"," ");
                else System.out.printf("%4d", i*j);
            }
            System.out.println();
        }
        System.out.println();
        //Использование StringStorage

        StringStorage s1=new StringStorage();//массив по умолчанию
        System.out.println(s1);
        s1.changeOrder(0,2);
        System.out.println(s1);
        System.out.println();

        StringStorage s2=new StringStorage(new String[]{"a0","b1","c2","d3","e4","f5","g6"});
        System.out.println(s2);
        s2.changeOrder(5,2);
        System.out.println(s2);
        s2.changeOrder(6,-1);//Ввод неверных индексов
        System.out.println(s2);
        s2.changeOrder(1,6);
        System.out.println(s2);

    }
}
