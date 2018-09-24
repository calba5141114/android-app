package com.example.calba5141114.myapplication;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// class dedicated to saving files into the devices file systems.
public class FileInputOutput {


    // FileInputOutput Constructor
    public FileInputOutput() {

    }


    /**
     * Used to save deck objects as a file on the device
     *
     * @param deck     Initialized deck object
     * @param title    Name for the file and deck
     * @param filepath Path to which the file will be written too
     */

    public void serializeDeck(Deck deck, String title, String filePath) {

        FileOutputStream fOut = null;
        ObjectOutputStream oos = null;

        try {
            File file = new File(filePath, title + ".meme");
            fOut = new FileOutputStream(file);
            oos = new ObjectOutputStream(fOut);
            oos.writeObject(deck);

        } catch (Exception err) {

            err.printStackTrace();

        } finally {
            if (fOut != null) {
                try {
                    fOut.close();
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();

                }
            }
        }

    }





    /**
     * Reading deck files from a File object
     * @param file File object representing the deck object
     * @return A Deck object
     */
    public Deck readDeck(File file)
    {
        Deck temp = null;
        FileInputStream fin = null;
        ObjectInputStream ois = null;

        try
        {
            fin = new FileInputStream(file);
            ois = new ObjectInputStream(fin);
            temp = (Deck) ois.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fin != null)
            {
                try
                {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            if(ois != null)
            {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return temp;
    }


    // needs a delete file method and edit file method.
    



}
