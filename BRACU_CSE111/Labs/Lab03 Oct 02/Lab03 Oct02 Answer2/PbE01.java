import java.util.Scanner;
class PbE01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a string : ");
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if ((charArray[j]) < (charArray[i])) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        System.out.println("Sorted string: " + String.valueOf(charArray));
    }
}