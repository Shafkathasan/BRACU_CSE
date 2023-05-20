public class Q3{
    
    public static void main(String[] args){
        
        Motorbike mb=new Motorbike();
        mb.printStatus();
        
        mb.speedUp(60);
        mb.printStatus();
        
        mb.applyBrakes(10);
        mb.printStatus();
    }
}