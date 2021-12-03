import java.util.*;
 
public class SumOfSquaresOfOdd
{
    public static void main(String... args)
    {
        List<Integer> intList = new ArrayList<Integer>();
 
        for(int i = 1; i <= 5; i++) {
                intList.add(i);
        }
 
        System.out.println("intList - Initial : " + intList);
 
        List<Integer> oddNoList = new ArrayList<Integer>();
 
        for(int i = 0; i < intList.size(); i++) {
                int intlistI = intList.get(i);
                if(intlistI % 2==1) {
                        oddNoList.add(intList.get(i));
                }
        }
 
        System.out.println("oddNoList : " + oddNoList);
 
        List<Integer> squareList  = new  ArrayList<Integer>();
 
        for(int i=0; i < oddNoList.size(); i++) {
                squareList.add(oddNoList.get(i) * oddNoList.get(i));
        }
 
        System.out.println("squareList : " + squareList);
 
        int sum = 0;
        for(Integer i : squareList) {
                sum += i;
        }
 
        System.out.println("Sum : " + sum);
    }
}