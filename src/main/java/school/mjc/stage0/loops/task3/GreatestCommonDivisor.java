package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first==second) System.out.println(first);
        else{
            while(first!=0 && second!=0){
                if(first>second)  first=first%second;
                else second=second%first;
            }
            System.out.println(first+second);
        }
    }
}
