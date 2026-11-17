package day1;

public class Reels extends Instagram1
{
    void create()
    {
        System.out.println("Creating Reels");
    }

    public static void main(String args[])
    {
        Reels obj = new Reels();

        obj.login();
        obj.post();
        obj.create();
    }
}

