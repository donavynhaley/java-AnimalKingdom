public class Fish extends Animals
{
    public Fish(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }


    public String move()
    {
        return "swim";
    }

    public String breath()
    {
        return "gills";
    }

    public String reproduce()
    {
        return "eggs";
    }
}
