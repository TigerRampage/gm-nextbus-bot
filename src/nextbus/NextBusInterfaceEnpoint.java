package nextbus;

import com.squareup.okhttp.ResponseBody;

import retrofit.Call;
import retrofit.http.GET;

public interface NextBusInterfaceEnpoint {
	@GET("?command=routeConfig&a=umd&r=115")
	Call<RoutesBody> getRouteConfig();
	
	@GET("?command=routeConfig&a=umd&r=115")
	Call<ResponseBody> getRouteConfigRaw();
	
	@GET("?command=agencyList")
	Call<Body> getAgencyList();

}
