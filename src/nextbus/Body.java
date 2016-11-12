package nextbus;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="body", strict=false)
public class Body
{
	@ElementList(inline=true)
    private List<Agency> agencies;


    public Body() {
    	
    }
    public List<Agency> getAgencies()
    {
        return agencies;
    }

    public void setAgencies(List<Agency> agencies)
    {
        this.agencies = agencies;
    }



    @Override
    public String toString()
    {
        return agencies.toString();
    }
}
