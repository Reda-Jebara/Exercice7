package Animal;

class Dog extends Mammal
{
    private String FavColorReda56567;

    Dog()
    {
        super();
        FavColorReda56567 = "BLACK";
    }

    public Dog(String name, int age, int weight, String order, String favColor)
    {
        super(name, age, weight, order);
        this.FavColorReda56567 = favColor;
    }

    public Dog(int age, String order, String favColor)
    {
        super(age, order);
        this.FavColorReda56567 = favColor;
    }

    public void WakeUp()
    {
        System.out.println("MORNING");
    }

    @Override
    public void SleepReda56567()
    {System.out.println("SLEEPING");}

    @Override
    void getVoiceReda56567()
    {System.out.println("Wooof Wooof");}

    @Override
    public void eatReda56567(String meal)
    {System.out.println("EATING");}

    public String getFavColorReda56567()
    {return this.FavColorReda56567;}

    public void setFavColorReda56567(String X)
    {this.FavColorReda56567 = X;}

    public String ToString()
    {return "Dog :\n " + "Favorite Color : " + FavColorReda56567;}
}
