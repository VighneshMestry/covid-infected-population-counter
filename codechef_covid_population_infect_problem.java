package competitive_coding;

import java.util.Scanner;

public class codechef_covid_population_infect_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            long population = sc.nextLong();
            long a = 0;
            long day = sc.nextInt();
//            if (day == 0){
//                System.out.println(1);
//            }
            if (day <= 10) {
                long popInfected = 1;
                for (long j =1; j<=day; j++){
                    popInfected = 2*popInfected;
                }
                a = popInfected;
            }else if (day > 10) {
                long popInfected = 0;
                popInfected = popInfected +1024;
                for (long j = 11; j <= day; j++) {
                    popInfected = (3 * popInfected);
                    if (popInfected>population){
                        break;
                    }
                }
                a = popInfected;

            }
            if (a>population){
                System.out.println(population);
            }else{
                System.out.println(a);
            }
        }
    }
}
