public class ProgramC {
    public static void main(String[] args) {
        int [] array1 = {1, 3, 5};
        String [] array2 = {"squirrel", "toad", "frog", null};
        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array1[0]);
        System.out.println(array2[1]);
        System.out.println(array2[array1[1]]);
    }
}
