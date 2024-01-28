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

public class StudentBook implements Records
{
    private String studentId;
    private String bookId;
    private LocalDate borrowDate;
    public StudentBook(String studentId, String bookId, LocalDate borrowDate)
    {
        this.studentId = studentId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
    }
    public String getStudentId()
    {
        return studentId;
    }
    public String getBookId()
    {
        return bookId;
    }
    public LocalDate getBorrowDate()
    {
        return borrowDate;
    }
    public String lineRepresentation()
    {
        if(this != null)
        {
            return studentId + "," + bookId + "," + borrowDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        else
        {
            return "No data found";
        }
    }
    public String getSearchKey()
    {
        return studentId + "," + bookId;
    }
}
