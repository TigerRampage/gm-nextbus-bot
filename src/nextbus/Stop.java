package nextbus;

public class Stop
{
    private String title;

    private String lon;

    private String tag;

    private String stopId;

    private String lat;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getLon ()
    {
        return lon;
    }

    public void setLon (String lon)
    {
        this.lon = lon;
    }

    public String getTag ()
    {
        return tag;
    }

    public void setTag (String tag)
    {
        this.tag = tag;
    }

    public String getStopId ()
    {
        return stopId;
    }

    public void setStopId (String stopId)
    {
        this.stopId = stopId;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", lon = "+lon+", tag = "+tag+", stopId = "+stopId+", lat = "+lat+"]";
    }
}