public class Question01{
  public static void main(String[] args){
    Book b1=new Book("The Kite runner","Novel");
    Book b2=new Book("The Notebook","Romantic");
    Book b3=new Book("The Alchemist","Novel");
    Book b4=new Book("The Fault in Our Stars","Romantic");
    Book [] bk = {b1,b2,b3};
    Author a1 = new Author(bk);
    System.out.println("=============================");
    System.out.println(a1.printAll());
    System.out.println("=============================");
    a1.printNovel();
    a1.addBook(b4);
    System.out.println("=============================");
    System.out.println(a1.printAll());
  }
}
class Book{
  String name;
  String genre;
  public Book(String _name,String _genre){
    this.name = _name;
    this.genre = _genre;
  }
}

class Author{
  Book[] barray;
  public Author(Book[] b){
    barray = new Book[b.length];
    for(int i = 0 ; i < b.length ; i++){
      barray[i] = b[i];
    }
  }
  public String printAll(){
    String s = "";
    for(int i = 0 ; i < barray.length ; i++){
      if(i == barray.length-1){
        s+="Name : "+barray[i].name+", Genre : "+barray[i].genre;
      }else{
        s+="Name : "+barray[i].name+", Genre : "+barray[i].genre+"\n";
      }
    }
    return s;
  }
  public void addBook(Book newb){
    Book[] newBarray = new Book[barray.length+1];
    for(int i = 0 ; i < barray.length; i++){
      newBarray[i] = barray[i];
    }
    newBarray[barray.length] = newb;
    barray = newBarray;
  }
  public void printNovel(){
    for(int i = 0 ; i < barray.length ; i++){
      if(barray[i].genre.equals("Novel")){
        System.out.println("Name : "+barray[i].name+", Genre : "+barray[i].genre);
      }
    }
  }
}