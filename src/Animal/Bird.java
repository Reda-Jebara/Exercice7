package Animal;

class Bird extends Animal
{
    private String Type_BirdReda56567;

    public Bird()
    {
        super();
        Type_BirdReda56567=" ";
    }

    public Bird(String name,int age , int weight , String Type_of_Bird)
    {
        super(name,age,weight);
        this.Type_BirdReda56567 = Type_of_Bird;
    }

    public Bird(int age , String Type_of_Bird)
    {
        super(age);
        this.Type_BirdReda56567 = Type_of_Bird;
    }

    public void Fly()
    {System.out.println("Flyin");}

    @Override
    void getVoiceReda56567()
    {System.out.println("whistle whistle whistle");}

    @Override
    public void eatReda56567(String meal)
    {System.out.println("Bird s eatin "+ meal);}

    public String getTypeReda56567()
    {return this.Type_BirdReda56567;};

    public void setTypeReda56567(String X)
    {this.Type_BirdReda56567 = X;};

    public String ToString()
    {return "Bird :\n "+"Type of Bird : "+Type_BirdReda56567;}

}
