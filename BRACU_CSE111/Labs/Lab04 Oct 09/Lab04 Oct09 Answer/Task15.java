public class Task15{
    String val;
    BoroInt(){
        val=0;
    }
    public boolean validValue(String val){
        boolean res = true;
        for(i=o; i<=val.length();i++){
            if((int)val.charAt(i)>=65){
                res = false;
                break;
            }
            return res;
        }
    }
}
