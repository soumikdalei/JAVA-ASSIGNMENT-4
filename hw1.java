public class hw1 {
    public static void main(String[] args) {
        int sum=0; int sum1=0;
        for(int i=1;i<=10;i++){
            sum+=i*i;
        }
        System.out.println(sum);
        for (int i=1;i<=10;i++){
            sum1+=i;
        }
        sum1=(int)Math.pow(sum1,2);

        System.out.println(sum1);
    int dif=sum1-sum;
        System.out.println(dif);
    }
}
