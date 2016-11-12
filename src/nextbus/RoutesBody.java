package nextbus;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="body", strict = false)
public class RoutesBody {
	@Element
	private Route route;

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	
	public String toString() {
		return route.toString();
	}
	
	
}
