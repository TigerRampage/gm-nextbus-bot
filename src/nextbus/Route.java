package nextbus;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Route {
	@ElementList(inline=true)
	private List<Stop> stops;
	
	@Element
	private Direction direction;
	
	@Attribute
	private String tag;
	
	@Attribute
	private String title;
	
	@Attribute
	private String color;
	
	@Attribute
	private String oppositeColor;
	
	@Attribute
	private String latMin;
	
	@Attribute
	private String latMax;
	
	@Attribute
	private String lonMin;
	
	@Attribute
	private String lonMax;
	

	public List<Stop> getStops() {
		return stops;
	}

	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public String toString() {
		return stops.toString();
	}
	
	
}