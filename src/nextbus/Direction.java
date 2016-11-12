package nextbus;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Direction
{
	@Element
    private Stop[] stop;
	
	@Attribute
    private String title;
	
	@Attribute
    private String useForUI;
	
	@Attribute
    private String tag;
	
	@Attribute
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