public class Oven
{
    private int maxTemp;
    private int currentTemp;

    public void setMaxTemp(int input)
    {
        maxTemp = input;
    }

    public void setcurrentTemp(int input)
    {
        currentTemp = input;
    }

    public int getmaxTemp()
    {
        return maxTemp;
    }

    public int getcurrentTemp()
    {
        return currentTemp;
    }

    public void turnOff()
    {
        currentTemp = 0;
    }

    public boolean isOn()
    {
        if (currentTemp > 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public void preheat (int temp)
    {
       
        if (temp > 0)
        {
            temp = currentTemp;
            if (temp > maxTemp)
            {
                currentTemp = maxTemp;
            }
        }
    public String toString()
    {
        System.out.println("New oven with a maximum temperature of" + maxTemp + " and a starting temperature of" + currentTemp+ "degrees");
    }
}
