public class Task01d
{
    public static void main(String[] args)
    { 
        int count=18, sign=1;
        while(count<=63)
        {
            int num = count*sign;
            if(count==63){
                System.out.print(num);
            }
            else{
                System.out.print(num+",");
            }
            count+=9;
            sign*=(-1);
        }
    }
}
