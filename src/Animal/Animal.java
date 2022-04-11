package Animal;


abstract class Animal
{
    String NameReda56567;
    int ageReda56567,weightReda56567;

    public Animal(int age)
    {this.ageReda56567=age;}

    public void eatReda56567(String meal){};
    abstract void getVoiceReda56567();
    public Animal()
    {
        ageReda56567 = weightReda56567=0;
        NameReda56567="XX";
    }
    public Animal(String name,int age , int weight)
    {
        this.NameReda56567=name;
        this.ageReda56567=age;
        this.weightReda56567=weight;
    }

    public String getNameReda56567()
    {return this.NameReda56567;};

    public void setNameReda56567(String X)
    {this.NameReda56567=X;};

    public int getAgeReda56567()
    {return this.ageReda56567;};

    public void setAgeReda56567(int X)
    {this.ageReda56567=X;};

    public int getWeightReda56567()
    {return this.weightReda56567;};

    public void setWeightReda56567(int X)
    {this.weightReda56567=X;};


}


