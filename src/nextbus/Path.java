package nextbus;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
public class Path
{
	@Element
    private Point[] point;

    public Point[] getPoint ()
    {
        return point;
    }

    public void setPoint (Point[] point)
    {
        this.point = point;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [point = "+point+"]";
    }
}