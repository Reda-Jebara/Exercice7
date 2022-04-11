package Animal;

class Mammal extends Animal{
    private String orderReda56567;
    public Mammal(){
        super();
        orderReda56567="XX";
    }
    public Mammal(String name,int age , int weight , String order){
        super(name,age,weight);
        this.orderReda56567=order;
    }
    public Mammal(int age , String order){
        super(age);
        this.orderReda56567=order;
    }

    public void SleepReda56567(){System.out.println("mmmmm");}

    @Override
    void getVoiceReda56567() {
        System.out.println("bla bla bla");
    }
    @Override
    public void eatReda56567(String meal)
    {System.out.println("Mammal's eating "+ meal);}



    public String getOrderReda56567()
    {return this.orderReda56567;};

    public void setOrderReda56567(String X)
    {this.orderReda56567 = X;};

    public String ToStringReda56567()
    {return "Mammal :\n "+"Order : "+orderReda56567;}

}

