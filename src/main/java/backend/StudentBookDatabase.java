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

class StudentBookDatabase extends Database
{
    public StudentBookDatabase(String filename)
    {
        super(filename);
    }
    public Records createRecordFrom(String line)
    {
        String[] data = line.split(",");
        return new StudentBook(data[0], data[1], LocalDate.parse(data[2], DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
