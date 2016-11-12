import nextbus.Body;
import nextbus.NextBusInterfaceEnpoint;
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
		service.getRouteConfig().enqueue(new Callback<Body>() {
			
			@Override
			public void onFailure(Throwable error) {
				// TODO Auto-generated method stub
				System.out.println(error.getMessage());
				
			}

			@Override
			public void onResponse(Response<Body> response, Retrofit arg1) {
				// TODO Auto-generated method stub
				
				System.out.println(response.body().getRoute());
			}
		});

	}

	public static void main(String[] args) {
		NextBusManager manager = new NextBusManager();
		manager.getRoutes();
	}

}
