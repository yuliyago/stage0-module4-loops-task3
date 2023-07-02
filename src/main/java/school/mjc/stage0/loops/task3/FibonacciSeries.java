package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
       int[] fibNumbs=new int[lastFibonacci];
       fibNumbs[0]=0;
       fibNumbs[1]=1;
       for(int start=2;start<lastFibonacci;start++){
           fibNumbs[start]=fibNumbs[start-1]+fibNumbs[start-2];
       }
       for(int i=0;i<lastFibonacci;i++){
           System.out.println(fibNumbs[i]);
       }
    }
}
