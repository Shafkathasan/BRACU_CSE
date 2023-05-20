//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Queue
package Assignment_Queue; // Remove This Line or Make a package

public class Patient {

    public String name;
    public int age;
    public String blood;
    public int id;

    public Patient(String n, int a, String b, int i) {
        name = n;
        age = a;
        blood = b;
        id = i;
    }

    public String toString() {
        return "ID:" + id + "\nName: " + name + "\nAge: " + age + "\nBlood: " + blood + "\n---";
    }

}
