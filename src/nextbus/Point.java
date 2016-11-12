package nextbus;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class Point
{
	@Attribute
    private double lon;

	@Attribute
    private double lat;

	public Point() {
		
	}
    public double getLon ()
    {
        return lon;
    }

    public void setLon (double lon)
    {
        this.lon = lon;
    }

    public double getLat ()
    {
        return lat;
    }

    public void setLat (double lat)
    {
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lon = "+lon+", lat = "+lat+"]";
    }
}
	