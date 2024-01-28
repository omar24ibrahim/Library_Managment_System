/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 * Omar Ibrahim 7442
 * @author HP
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Database
{
    private ArrayList<Records> records = new ArrayList<Records>();
    private String filename;
    public Database(String filename)
    {
        this.filename = filename;
    }
    public void readFromFile()
    {
        try
        {
            File file = new File(this.filename);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine())
            {
                records.add(createRecordFrom(scan.nextLine()));
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Invalid filename enterred!!");
        }
    }
    public abstract Records createRecordFrom(String line);
    public ArrayList<Records> returnAllRecords()
    {
        return records;
    }
     public boolean contains(String key)
    {
        if(!this.records.isEmpty())
        {
            for(Records l:this.records)
            {
                if(key.equals(l.getSearchKey()))
                {
                    return true;
                }
            }
            return false;
        }
        else
        {
            return false;
        }
    }
    public Records getRecord(String key)
    {
        if(!this.records.isEmpty())
        {
            for(Records l:this.records)
            {
                if(key.equals(l.getSearchKey()))
                {
                    return l;
                }
            }
            System.out.println("No item found with such search key.");
            return null;
        }
        else
        {
            System.out.println("No data inserted yet.");
            return null;
        }
    }
    public void insertRecord(Records record)
    {
        if(!contains(record.getSearchKey()))
        {
            records.add(record);
        }
    }
    public void deleteRecord(String key)
    {
        if(contains(key))
        {
            records.remove(getRecord(key));
        }
        else
        {
            System.out.println("No item found with such search key.");
        }
    }
    public void saveToFile()
    {
        try
        {
            FileWriter file = new FileWriter(this.filename);
            PrintWriter write = new PrintWriter(file);
            if(this.returnAllRecords().isEmpty())
            {
                write.print("");
            }
            else
            {
                for(Records r:this.records)
                {
                    write.println(r.lineRepresentation());
                }
            }
            write.close();
        }
        catch(IOException e)
        {
            System.out.println("Invalid filename enterred!!");
        }
    }
}
