
public class LoopPractice {
    public static void main(String[] args) {
        // for loop
        //print even numbers between 0-50 and break when greater than 500.
        int sum=0;
        for (int n = 0; n<50; n++) {
            sum=sum+n;
            if(n%2!=0 && sum >500){
                break;
            }
        }
        System.out.println(sum);

    }}





