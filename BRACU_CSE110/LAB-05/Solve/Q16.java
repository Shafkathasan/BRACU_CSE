public class Q16 
{  
    public static void main(String[] args) {
        boolean var1=false, var2=false, var3=false, var4=false,var5=false; 
        boolean var6=false, result1=false, result2=false, result3=false, result4=false;
        boolean result5=false, result6=false, result7=false, result8=false;
        boolean result9=false, result10=false;
        var1=4 > 3 - 1;
        var2=var1 && false;
        var3=true;
        var4=false;
        var5=true;
        var6=var3 && false;
        result1=(var1 || var2) && (8 * 10 > 45);
        result2=(var1 || var2) && (result1 && false);
        result3=(var1 && result1) || result2;
        result4=(var1 || var2) || ((var3 && var1) && false);
        result5=(var1 && var2) && (result3 || var1);
        result6=((var3 || var2) && !(result5)) || true;
        result7=(var4 && result1) && ((result1 && false) || true);
        result8=((var1 && result3) && (var5 || var6)) && true;
        result9=((result2 && var2) || (result7 && var1)) && false;
        result10=!(var1 && true);
    }
}
