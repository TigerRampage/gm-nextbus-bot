package nextbus;

public class Route
{
    private String latMax;

    private Stop[] stop;

    private String title;

    private String lonMin;

    private String color;

    private String tag;

    private Direction direction;

    private Path[] path;

    private String oppositeColor;

    private String lonMax;

    private String latMin;

    public String getLatMax ()
    {
        return latMax;
    }

    public void setLatMax (String latMax)
    {
        this.latMax = latMax;
    }

    public Stop[] getStop ()
    {
        return stop;
    }

    public void setStop (Stop[] stop)
    {
        this.stop = stop;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getLonMin ()
    {
        return lonMin;
    }

    public void setLonMin (String lonMin)
    {
        this.lonMin = lonMin;
    }

    public String getColor ()
    {
        return color;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public String getTag ()
    {
        return tag;
    }

    public void setTag (String tag)
    {
        this.tag = tag;
    }

    public Direction getDirection ()
    {
        return direction;
    }

    public void setDirection (Direction direction)
    {
        this.direction = direction;
    }

    public Path[] getPath ()
    {
        return path;
    }

    public void setPath (Path[] path)
    {
        this.path = path;
    }

    public String getOppositeColor ()
    {
        return oppositeColor;
    }

    public void setOppositeColor (String oppositeColor)
    {
        this.oppositeColor = oppositeColor;
    }

    public String getLonMax ()
    {
        return lonMax;
    }

    public void setLonMax (String lonMax)
    {
        this.lonMax = lonMax;
    }

    public String getLatMin ()
    {
        return latMin;
    }

    public void setLatMin (String latMin)
    {
        this.latMin = latMin;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [latMax = "+latMax+", stop = "+stop+", title = "+title+", lonMin = "+lonMin+", color = "+color+", tag = "+tag+", direction = "+direction+", path = "+path+", oppositeColor = "+oppositeColor+", lonMax = "+lonMax+", latMin = "+latMin+"]";
    }
}