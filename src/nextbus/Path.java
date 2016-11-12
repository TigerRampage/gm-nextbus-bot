package nextbus;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class Path
{
	@ElementList(type=Point.class)
    private Point[] point;

	public Path() {
		
	}
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