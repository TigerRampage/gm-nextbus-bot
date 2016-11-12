package nextbus;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Element(data = true)
public class Stop {
	@Attribute(required = false)
	private String title;

	@Attribute(required = false)
	private String shortTitle;

	@Attribute(required = false)
	private String lon;

	@Attribute
	private String tag;

	@Attribute(required = false)
	private String stopId;

	@Attribute(required = false)
	private String lat;

	public Stop() {

	}

	public String getTitle() {
		return title;
	}

	public String getShortTitle() {
		return shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getStopId() {
		return stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	@Override
	public String toString() {
		return "ClassPojo [title = " + title + ", lon = " + lon + ", tag = " + tag + ", stopId = " + stopId + ", lat = "
				+ lat + "]";
	}
}