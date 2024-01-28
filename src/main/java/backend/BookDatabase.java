/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 * Omar Ibrahim 7442
 * @author HP
 */

class BookDatabase extends Database
{
    public BookDatabase(String filename)
    {
        super(filename);
    }
    public Records createRecordFrom(String line)
    {
        String[] data = line.split(",");
        return new Book(data[0], data[1], data[2], data[3], Integer.parseInt(data[4]));
    }
}
