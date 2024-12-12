public class Point2D
{
    private int x;
    private int y;

    public String toString();
    {
        return "(" + x + "," + y + ")";
    }

    //p1 == p2 is generally not a good idea in CSA 
    // == will check the pointers
    // p1.equals(p2) (?)

    public boolean equals(Point2D other)
    {
        return x == other.getX() && y == other.getY();
    }


    //Accessors methods (getters)
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    //mutator methods (setters)
    public void setX(int input)
    {
        x = input;
    }

    public void setY(int input)
    {
        y = input;
    }



}
