package Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staff extends Person
{
    String educationReda56567 , positionReda56567;
    Person nv=new Person();
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    void initialize1() throws IOException

    {
        nv.initialize();
        System.out.println("Education :");
        educationReda56567= rd.readLine();
        System.out.println("Position :");
        positionReda56567= rd.readLine();
    }

    void print1()
    {
        String print=nv.print();
        String result=print+"\n Educataion :"+educationReda56567+"\n\n Position :"+positionReda56567;
        System.out.println(result);
    }


    public static void main(String[]args) throws IOException
    {
        Staff nv=new Staff();
        nv.initialize1();
        nv.print1();
    }
}