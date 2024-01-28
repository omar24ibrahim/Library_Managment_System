/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 * Omar Ibrahim 7442
 * @author HP
 */
public class LibrarianUser implements Records
{
    private String librarianId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    public LibrarianUser(String librarianId, String name, String email, String address, String phoneNumber)
    {
            this.librarianId = librarianId;
            this.name = name;
            this.email = email;
            this.address = address;
            this.phoneNumber = phoneNumber;
    }
    public String lineRepresentation()
    {
        if(this != null)
        {
        return librarianId + "," + name + "," + email + "," + address + "," + phoneNumber;
        }
        else
        {
            return "No data found";
        }
    }
    public String getSearchKey()
    {
        return librarianId;
    }
}
