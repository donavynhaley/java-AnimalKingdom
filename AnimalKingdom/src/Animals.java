abstract class Animals
{
    protected int foodLevel = 0;
    protected int id;
    private static int maxId = 0;
    protected String name;
    protected int yearDiscovered;
    public Animals(String name, int yearDiscovered)
    {
        // ? Is it better to make a parameter variable a different name rather than using this keyword
        maxId++;
        id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public void eat(int foodAmount)
    {
        foodLevel += foodAmount;
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return yearDiscovered;
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();

    @Override
    public String toString()
    {
        return "id=" + id + " name=" + name + " yearNamed=" + yearDiscovered;
    }



}
