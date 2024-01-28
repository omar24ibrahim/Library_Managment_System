/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 * Omar Ibrahim 7442
 * @author HP
 */

class LibrarianUserDatabase extends Database
{
    public LibrarianUserDatabase(String filename)
    {
        super(filename);
    }
    public Records createRecordFrom(String line)
    {
        String[] data = line.split(",");
        return new LibrarianUser(data[0], data[1], data[2], data[3], data[4]);
    }
}
