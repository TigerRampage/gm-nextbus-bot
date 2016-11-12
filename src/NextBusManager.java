import java.io.IOException;

import com.squareup.okhttp.ResponseBody;

import nextbus.NextBusInterfaceEnpoint;
import nextbus.Route;
import nextbus.RoutesBody;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.SimpleXmlConverterFactory;

public class NextBusManager {

	Retrofit nextBusRetrofit;
	NextBusInterfaceEnpoint service;

	public NextBusManager() {
		nextBusRetrofit = new Retrofit.Builder().baseUrl("http://webservices.nextbus.com/service/publicXMLFeed")
				.addConverterFactory(SimpleXmlConverterFactory.create()).build();
		service = nextBusRetrofit.create(NextBusInterfaceEnpoint.class);
	}

	public void getRoutes() {
		service.getRouteConfig().enqueue(new Callback<RoutesBody>() {
			
			@Override
			public void onResponse(Response<RoutesBody> arg0, Retrofit arg1) {
				RoutesBody body = arg0.body();
				Route route = body.getRoute();
				
				System.out.println(route);
			}
			
			@Override
			public void onFailure(Throwable arg0) {
				System.out.println(arg0.getMessage());
				
			}
		});
		
		/*service.getRouteConfigRaw().enqueue(new Callback<ResponseBody>() {
			
			@Override
			public void onResponse(Response<ResponseBody> arg0, Retrofit arg1) {
				try {
					System.out.println(arg0.body().string());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			@Override
			public void onFailure(Throwable arg0) {
				// TODO Auto-generated method stub
				
			}
		});*/
	}

	public static void main(String[] args) {
		NextBusManager manager = new NextBusManager();
		manager.getRoutes();
	}

}
