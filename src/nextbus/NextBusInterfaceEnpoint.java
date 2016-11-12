package nextbus;

import retrofit.Call;
import retrofit.http.GET;

public interface NextBusInterfaceEnpoint {
	@GET("?command=routeConfig&a=umd")
	Call<Body> getRouteConfig();

}
