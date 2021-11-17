package com.example.workshop7;


import java.io.*;
import java.util.jar.Attributes;

public class FindName {

    public NameData findName (int year, char gender, String name) throws FileNotFoundException {
        boolean found = false;

        String filename = "babynamesranking" + year + ".txt";
        System.out.println(filename);
        try(BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream(filename), "UTF-8")))
        {

            String line;



            while((line = in.readLine()) != null && !found)
            {
                String[] result = line.split("\\t");
                if( (gender == 'M'|| gender == 'm') && result[1].equals(name) )
                {
                    found = true;
                    return new NameData(name,result[0],result[2]);
                }
                if( (gender == 'F'|| gender == 'f') && result[3].equals(name) )
                {
                    found = true;
                    return new NameData(name,result[0],result[4]);
                }
            }

        } catch(IOException e)
        {
            e.printStackTrace();
        }

        return new NameData(found);
    }


}
