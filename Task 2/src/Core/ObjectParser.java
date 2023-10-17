/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Reads and Writes to given file ( file path )
 *
 * @author sithira
 */
public class ObjectParser
{

    private static ObjectParser instance = null;
    
    private FileOutputStream fileOutputStream;
    
    private ObjectInputStream objectInputStream;
    
    private ObjectOutputStream objectOutputStream;
    
    protected ObjectParser()
    {
        // to avoid instalizing...
    }
    
    public static ObjectParser getInstance()
    {
        if (instance == null)
        {
            instance = new ObjectParser();
        }
        
        return instance;
    }
    
    /**
     * Read Object when a correct file path is provided.
     * 
     * @param filename
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public Object readObject(String filename) throws 
            FileNotFoundException,
            IOException,
            ClassNotFoundException
    {
        
        objectInputStream = 
                new ObjectInputStream(new FileInputStream(new File(filename)));
        
        return objectInputStream.readObject();
        
    }
    
    /**
     * Write to file when a correct file name is provided
     * 
     * @param filename
     * @param object
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void writeObject(String filename, Object object) throws 
            FileNotFoundException, 
            IOException
    {
        fileOutputStream = new FileOutputStream(new File(filename));
        
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        
        objectOutputStream.writeObject(object);
        
        objectOutputStream.flush();
    }

}
