package nextbus;

public class Direction
{
    private Stop[] stop;

    private String title;

    private String useForUI;

    private String tag;

    private String name;

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

    public String getUseForUI ()
    {
        return useForUI;
    }

    public void setUseForUI (String useForUI)
    {
        this.useForUI = useForUI;
    }

    public String getTag ()
    {
        return tag;
    }

    public void setTag (String tag)
    {
        this.tag = tag;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [stop = "+stop+", title = "+title+", useForUI = "+useForUI+", tag = "+tag+", name = "+name+"]";
    }
}