public class Task11
{
    public static void main(String[] args) 
    { 
        int count=40;
        while(count<=50)
        {
            int divCount=0, div=1;
            while(div<=count)
            {
                if(count%div==0)
                {
                    divCount++;}
                div++;
            }
            if(divCount==2)
            {
                System.out.println(count);
            } 
            ++count;   
        }
    }
}
