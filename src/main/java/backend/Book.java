/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 * Omar Ibrahim 7442
 * @author HP
 */
public class Book implements Records
{
    private String bookId;
    private String title;
    private String authorName;
    private String publisherName;
    private int quantity;
    public Book(String bookId, String title, String authorName, String publisherName, int quantity)
    {
            this.bookId = bookId;
            this.title = title;
            this.authorName = authorName;
            this.publisherName = publisherName;
            setQuantity(quantity);
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        if(quantity <= 0)
        {
            this.quantity = 0;
        }
        else
        {
            this.quantity = quantity;
        }
    }
    public String lineRepresentation()
    {
        if(this != null)
        {
            return bookId + "," + title + "," + authorName + "," + publisherName + "," + quantity;
        }
        else
        {
            return "No data found";
        }
    }
    public String getSearchKey()
    {
        return bookId;
    }
}
