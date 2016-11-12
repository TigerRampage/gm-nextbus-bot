package nextbus;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Body
{
	@Element
    private Route route;

    @Attribute
    private String copyright;

    public Route getRoute ()
    {
        return route;
    }

    public void setRoute (Route route)
    {
        this.route = route;
    }

    public String getCopyright ()
    {
        return copyright;
    }

    public void setCopyright (String copyright)
    {
        this.copyright = copyright;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [route = "+route+", copyright = "+copyright+"]";
    }
}
