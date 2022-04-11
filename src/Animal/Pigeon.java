package Animal;

class Pigeon extends Bird
{
    private int NO_Species;

    Pigeon()
    {
        super();
        NO_Species=351;
    }

    public Pigeon(String name,int age , int weight , String order, int NO_Species)
    {
        super(name,age,weight,order);
        this.NO_Species=NO_Species;
    }

    public Pigeon(int age , String order, int NO_Species)
    {
        super(age,order);
        this.NO_Species=NO_Species;
    }

    public void dance()
    {System.out.println("Dacin");}

    @Override
    public void Fly()
    {System.out.println("Flyin");}

    @Override
    void getVoiceReda56567()
    {System.out.println("ssdsdsds");}

    @Override
    public void eatReda56567(String meal)
    {System.out.println("I am Eating "+meal);}

    public int getNoSpecies()
    {return this.NO_Species;};

    public void setNoSpecies(int X )
    {this.NO_Species = X;};

    public String ToString()
    {return "Pigeon :\n "+"Number of Species : "+NO_Species;}

}