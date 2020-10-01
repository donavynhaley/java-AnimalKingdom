public class Mammals extends Animals
{
    public Mammals(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);

        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public String move()
    {
        return "walk";
    }
    public String breath()
    {
        return "lungs";
    }
    public String reproduce()
    {
        return "live births";
    }

}
