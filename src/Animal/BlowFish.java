package Animal;

class BlowFish extends Fish
{
    private String TypeReda56567;

    BlowFish()
    {
        super();
        TypeReda56567="XXX";
    }
    public BlowFish(String name,int age , int weight , String order, String Type)
    {
        super(name,age,weight,order);
        this.TypeReda56567 = Type;
    }

    public BlowFish(int age , String order, String Type)
    {
        super(age,order);
        this.TypeReda56567 = Type;
    }

    public void travel()
    {System.out.println("BYE BYE");}

    @Override
    public void Search_For_Food()
    {System.out.println("Lookin for somethin to eat ");}

    @Override
    public void getVoiceReda56567()
    {System.out.println("gfdgsdfhsdh");}

    @Override
    public void eatReda56567(String meal)
    {System.out.println("Eatin "+meal);}


    public String getType()
    {return this.TypeReda56567;};

    public void setType(String X)
    {this.TypeReda56567 = X;};

    public String ToString()
    {return "BlowFish :\n "+"Type : "+TypeReda56567;}

}
