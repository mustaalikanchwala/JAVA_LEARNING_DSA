// this is just for fun , i have to use here try and catch but is use my logic so i dont need to use try-catch 
import java.util.Arrays;
import java.util.List;

class Books{
    private int avaialabelBooks = 3;
    private Integer[] booksID = {101,102,103};
    List<Integer> ListbooksID = Arrays.asList(booksID);
    

    public void getAvailabelBooks(){
        System.out.println("Availabel Books : "+ this.avaialabelBooks);
    }
    public void getAvailabelBooksID(){
        System.out.println(ListbooksID);
    }
    public void getRequestedBooks(int[] requestedBooks){
      for( int requestedBook : requestedBooks){
                if( ListbooksID.contains(requestedBook)){
                    System.out.println("Issued Book Are : "+ requestedBook);
                }else{
                    System.out.println("Book is not Avaialabel : "+requestedBook);
                }
            }
        }
       
    }

public class LibraryManage {
    public static void main(String[] args) {
        Books book = new Books();
        book.getAvailabelBooks();
        book.getAvailabelBooksID();
        int [] requestedBook = {101,106};
        book.getRequestedBooks(requestedBook);
    }
}
