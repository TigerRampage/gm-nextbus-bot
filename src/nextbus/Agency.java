package nextbus;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

@Element(data=true)
public class Agency {
	
	@Attribute
	private String title;
	@Attribute
	private String tag;
	@Attribute
	private String regionTitle;
	@Attribute(required=false)
	private String shortTitle;
	
	public String getShortTitle() {
		return shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getRegionTitle() {
		return regionTitle;
	}
	public void setRegionTitle(String regionTitle) {
		this.regionTitle = regionTitle;
	}
	
}
