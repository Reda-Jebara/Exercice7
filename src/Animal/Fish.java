package Animal;

class Fish extends Animal
{
    private String General_typeReda56567;

    public Fish()
    {
        super();
        General_typeReda56567="XX";
    }
    public Fish(String name,int age , int weight , String General_type)
    {
        super(name,age,weight);
        this.General_typeReda56567=General_type;
    }

    public Fish(int age , String General_type)
    {
        super(age);
        this.General_typeReda56567=General_type;
    }

    public void Search_For_Food()
    {System.out.println("Looking for food");}

    @Override
    void getVoiceReda56567()
    {System.out.println("ASJKLDHJASLHD");}

    @Override
    public void eatReda56567(String meal)
    {System.out.println("Fish s eatin "+ meal);}

    public String getGTypeReda56567()
    {return this.General_typeReda56567;};

    public void setGTypeReda56567(String w)
    {this.General_typeReda56567=w;};

    public String ToString()
    {return "Fish :\n "+"General Type of Fish : "+General_typeReda56567;}
}
