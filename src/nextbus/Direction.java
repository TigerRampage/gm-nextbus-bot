package nextbus;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class Direction {
	@ElementList(inline = true)
	private List<Stop> stops;

	@Attribute
	private String title;

	@Attribute
	private String useForUI;

	@Attribute
	private String tag;

	@Attribute
	private String name;

	public Direction() {

	}

	public List<Stop> getStops() {
		return stops;
	}

	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUseForUI() {
		return useForUI;
	}

	public void setUseForUI(String useForUI) {
		this.useForUI = useForUI;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "";
	}
}