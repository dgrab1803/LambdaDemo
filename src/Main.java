package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    NumericTest isFactor = (n,d) -> (n % d) == 0;
	    if(isFactor.test(10,2))
            System.out.println("liczba 2 jest czynnikiem liczby 10");
	    if(!isFactor.test(10,3))
            System.out.println("Liczba 3 nie jest czynnikiem liczby 10");
        System.out.println();

        NumericTest lessThan = (n,m) -> (n < m );
        if(lessThan.test(2,4))
            System.out.println(" liczba 4 jest wieksza od liczby 2");
        if(!lessThan.test( 4,2))
            System.out.println(" liczba 2 nie jest większa od 4");
        System.out.println();

        NumericTest absEqual = (n,m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        if(absEqual.test(4,-4))
            System.out.println("Wartosci są bezwględne");
        if(!absEqual.test(4, 5))
            System.out.println("wartosci nie są bezwględne");

        NumericFunc numFunc = (n) ->{
            int result = 1;
            n = n < 0 ? -n : n;

            for(int i=2; i<n/i; i++)
                if((n % i) ==0) {
                    result = i;
                    break;
                }
            return result;
        };
        System.out.println("Najmniejszym czynnikiem liczby 12  jest " + numFunc.func(33) );
        System.out.println("Najmniejszym czynnikiem liczby 15  jest " + numFunc.func(15) );
    }
}
