public class WhileLoop {
    public static void main(String[] args) {
        int sum=0;
        int n=2;
        while ( sum < 50) {

            if(n%2==0){
                sum=sum+n;


            }
            n=n+1;
        }
        System.out.println(sum);

int myfirstnumber= (10+5) +(2*10);
int mysecondnumber= 12;
int mythirdnumber= myfirstnumber *2;
int mytotal=myfirstnumber+mysecondnumber+mythirdnumber;
        System.out.println(mytotal);
        int mylastone= 1000-mytotal;
        System.out.println(mylastone);
byte m=12;
short k =20;
int a =400;
long f=50000+10*(m+k+a);
        System.out.println(f);
short total= (short)(1000+10*(m+k+a));

int result =3;
result+=2;
        System.out.println("1+2="+result);
        result=3;
        result*=10;
        System.out.println("3*10="+result);

        int age =20;
        int ageOfClient = age>=20? 0:1;
        System.out.println(ageOfClient);

         int switchValue=6;
         switch(switchValue){
             case 1:
             System.out.println("Value was 1");
             break;
             case 2:
             System.out.println("value was 2");
             break;
             case 3:case 4:case 5:
             System.out.println("Value was 3, or a 4 or a 5");
             System.out.println("Actually it was a"+ switchValue);
             break;
             default:
                 System.out.println("was not any of the numbers ");
                 break;//break can also be omitted but best to use
         }




            }



         }

