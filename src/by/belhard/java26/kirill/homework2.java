package by.belhard.java26.kirill;

public class homework2 {
    public static void main(String[] args) {

        //2домашка

        //1 задание
        byte l=16;
        System.out.println(l * 5 % 7);
        short k=4;
        System.out.println(k / 3);
        char j='j';
        j = (char) (j - 167);
        System.out.println(j);
        int h=10;
        System.out.println(h>6);
        long g=58894;
        System.out.println(g++/8);
        float f=32.4f;
        System.out.println(f*67/33>=50);
        double d=69.578;
        System.out.println(d--!=68);
        boolean bool=true;
        System.out.println(bool==true);
        System.out.println();
        //2 задание

        int r=10;
        if (r>0) {
            double s=Math.PI*r*r;
            double c=2*Math.PI*r;
            System.out.println("площадь окружности S="+s);
            System.out.println("длина окружности C="+c);
            System.out.println();

        }else{
            System.out.println("неверный ввод");
        }

        //3 задание

        double t=21;
                if(t<10){
                    System.out.println("куртка");
                }else if(t<=15){
                         System.out.println("ветровка");
                    }else if(t<=20) {
                             System.out.println("свитер");
                         }else if(t<=30){
                                System.out.println("майка");
                             }else  {
                                     System.out.println("ничего");
                }

             System.out.println();

        //4 задание

        int salary1=50000;
        int salary2=10000;
        int salary3=250000;
        if(salary2>salary1){
            if (salary2>salary3)
            {
                if(salary1>salary3)
                {
                    System.out.println("Разница зарплат "+(salary2-salary3));
                }else System.out.println("Разница зарплат "+(salary2-salary1));
            } else System.out.println("Разница зарплат "+(salary3-salary1));



            }else {
            if(salary1>salary3){
                if(salary2>salary3){
                    System.out.println("Разница зарплат "+(salary1-salary3));
                }else System.out.println("Разница зарплат "+(salary1-salary2));
            }else System.out.println("Разница зарплат "+(salary3-salary2));
        }
        System.out.println();
        //5 задание

        int a =2;
        int n=8;
        int b=a;
        while(n-1>0){
            a*=b;
            n--;
        }
        System.out.println("a в степени n="+a);
        System.out.println();
        //6задание

        double startSum=15000;
        int proc=12;
        int years=6;
        double vichet=startSum*0.01;
        for(int i=0;i<years;i++){
            startSum+=startSum*0.01*proc-vichet;

        }
        System.out.println("Денег на счету "+startSum);
    }
}
