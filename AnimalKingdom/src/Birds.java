public class Birds extends Animals
{
    public Birds(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }


    public String move()
    {
        return "fly";
    }

    public String breath()
    {
        return "lungs";
    }

    public String reproduce()
    {
        return "eggs";
    }
}
