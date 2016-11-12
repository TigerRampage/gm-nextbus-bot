package test;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retrofit retrofit = new Retrofit.Builder()
			    .baseUrl("https://api.github.com")
			    .addConverterFactory(GsonConverterFactory.create())
			    .build();

	}

}
