/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 * Omar Ibrahim 7442
 * @author HP
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import constants.FileNames;


public class LibrarianRole 
{
    private BookDatabase booksDatabase = new BookDatabase(FileNames.BOOKS_FILENAME);
    private StudentBookDatabase sBDatabase = new StudentBookDatabase(FileNames.STUDENTSBOOKS_FILENAME);
    public LibrarianRole()
    {
        booksDatabase.readFromFile();
        sBDatabase.readFromFile();
    }
    public void addBook(String bookId, String title, String authorName, String publisherName, int quantity)
    {
        booksDatabase.insertRecord(booksDatabase.createRecordFrom(bookId + "," + title + "," + authorName + "," + publisherName + "," + quantity));
    }
    public Book[] getListOfBooks()
    {
        return booksDatabase.returnAllRecords().toArray(new Book[0]);
    }
    public StudentBook[] getListOfBorrowingOperations()
    {
        return sBDatabase.returnAllRecords().toArray(new StudentBook[0]);
    }
    public int borrowBook(String studentId, String bookId, LocalDate borrowDate)
    {
        if(booksDatabase.contains(bookId))
        {
            Book b = (Book)booksDatabase.getRecord(bookId);
            if(sBDatabase.contains(studentId + "," + bookId))
            {
                return 1;
            }
            else if(b.getQuantity() == 0)
            {
                return 0;
            }
            else
            {
                b.setQuantity(b.getQuantity() - 1);
                sBDatabase.insertRecord(sBDatabase.createRecordFrom(studentId + "," + bookId + "," + borrowDate.format(DateTimeFormatter.ofPattern("dd-MM-yyy"))));
                sBDatabase.saveToFile();
                return 2;
            }
        }
        else
        {
            System.out.println("Check the id of your book.");
            return 3;
        }
    }
    public double returnBook(String studentId, String bookId, LocalDate borrowDate)
    {
        if(sBDatabase.contains(studentId + "," + bookId))
        {
            StudentBook s = (StudentBook)sBDatabase.getRecord(studentId + "," + bookId);
            Book b = (Book)booksDatabase.getRecord(bookId);
            b.setQuantity(b.getQuantity() + 1);
            long borrowDays = ChronoUnit.DAYS.between(s.getBorrowDate(), borrowDate);
            if(borrowDays <= 7)
            {
                sBDatabase.deleteRecord(s.getSearchKey());
                return 0;
            }
            else
            {
                sBDatabase.deleteRecord(s.getSearchKey());
                return (borrowDays - 7) * 0.5;
            }
        }
        else
        {
            return 0;
        }
    }
    public void logout()
    {
        booksDatabase.saveToFile();
        sBDatabase.saveToFile();
    }
}
