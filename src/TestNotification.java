import java.awt.Desktop.Action;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONException;
import org.json.JSONObject;

public class TestNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String AUTH_KEY_FCM = "AAAAhcQ--H0:APA91bF4b0gNIh42IjqzAr-tUov0nSZ7_xarrP1xq9t4TDXWOzJWr3LqXXmR6UPRSgoz07Pn6N8JqkfYxPjyWG4AwEMw8enSmMt7nTesAbmWT79NfUlkBr-WMnN4QL00hDvGXN-wb4Vs";
	    String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";
        String FMCurl = API_URL_FCM;
        String authKey = AUTH_KEY_FCM;
        
		 try {
	            URL url = new URL(FMCurl);
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	            conn.setUseCaches(false);
	            conn.setDoInput(true);
	            conn.setDoOutput(true);

	            conn.setRequestMethod("POST");
	            conn.setRequestProperty("Authorization", "key=" + authKey);
	            conn.setRequestProperty("Content-Type", "application/json");
	            
	            JSONObject data = new JSONObject();
	            data.put("to", "fvd68jswT5mnrYecfyfz5r:APA91bEJE9ckjmYuuMR1VfZhPiwwxudyhqGzyLgm0gni94O8umZ9eBV9lgGfgO3nS1wGrHLeJ0XSMa1EOOtVbMBTMDRJ5QJIpvkwi0uy7Hk1PH84P61pLqA-JRhrd8tEmxYC6caCaY7c");
	            JSONObject info = new JSONObject();
	            info.put("title", "FCM Notificatoin Title"); // Notification title
	            info.put("body", "Hello First Test notification"); // Notification body
	            info.put("click_action", "com.careerlauncher.ai.ui.notification.NotificationActivity"); // Notification body	          
	           
	            data.put("notification", info);
	            System.out.println(data.toString());
	            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
	            wr.write(data.toString());
	            wr.flush();
	            wr.close();

	            int responseCode = conn.getResponseCode();
	            System.out.println("Response Code : " + responseCode);

	            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            String inputLine;
	            StringBuffer response = new StringBuffer();

	            while ((inputLine = in.readLine()) != null) {
	                response.append(inputLine);
	            }
	            in.close();
	            System.out.println("Resonse: " + response); // <= ADD THIS

	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }

	}

}
