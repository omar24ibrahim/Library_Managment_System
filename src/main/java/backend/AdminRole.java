/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 * Omar Ibrahim 7442
 * @author HP
 */

import constants.FileNames;

public class AdminRole 
{
    private LibrarianUserDatabase database = new LibrarianUserDatabase(FileNames.LIBRARIANS_FILENAME);
    public AdminRole()
    {
        database.readFromFile();
    }
    public void addLibrarian(String librarianId, String name, String email, String address, String phoneNumber)
    {
        database.insertRecord(database.createRecordFrom(librarianId + "," + name + "," + email + "," + address + "," + phoneNumber));
    }
    public LibrarianUser[] getListOfLibrarians()
    {
        return database.returnAllRecords().toArray(new LibrarianUser[0]);
    }
    public void removeLibrarian(String key)
    {
        database.deleteRecord(key);
    }
    public void logout()
    {
        database.saveToFile();
    }
}
