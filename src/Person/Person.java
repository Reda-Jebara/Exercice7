package Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person
{
    String surnameReda56567, firstnameReda56567, streetReda56567, zipCodeReda56567, cityReda56567;
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    void initialize() throws IOException

    {
        System.out.println("Surname :");
        surnameReda56567= rd.readLine();
        System.out.println("First Name :");
        firstnameReda56567= rd.readLine();
        System.out.println("Street :");
        streetReda56567= rd.readLine();
        System.out.println("Zip Code :");
        zipCodeReda56567= rd.readLine();
        System.out.println("City :");
        cityReda56567= rd.readLine();
    }


    String print()
    {
        String resultReda56567 = " Surname :"+surnameReda56567+"\n First Name :"+firstnameReda56567+"\n Street :"+streetReda56567+"\n ZipCode :"+zipCodeReda56567+"\n City :"+cityReda56567;
        System.out.println(resultReda56567);
        return resultReda56567;
    }

    public static void main(String[]args) throws IOException
    {
        Person nv=new Person();
        nv.initialize();
        nv.print();
    }
}

