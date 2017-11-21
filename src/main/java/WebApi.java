import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class WebApi {
    private String request_uri;
    private String api_region_server;
    private String api_uri;
    private String api_key;
    private String result;
    private Integer http_code;
    private String result_json_object;

    public WebApi(Configuration conf){
        this.api_key = conf.getApi_key();
        this.api_region_server = conf.getApi_region_server();
    }

    public String getRequest_uri() {
        return request_uri;
    }

    public void setRequest_uri(String request_uri) {
        this.request_uri = request_uri;
    }

    public String getApi_region_server() {
        return api_region_server;
    }

    public void setApi_region_server(String api_region_server) {
        this.api_region_server = api_region_server;
    }

    public String getApi_uri() {
        return api_uri;
    }

    public void setApi_uri(String api_uri) {
        this.api_uri = api_uri;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getHttp_code() {
        return http_code;
    }

    public void setHttp_code(Integer http_code) {
        this.http_code = http_code;
    }

    public String getResult_json_object() {
        return result_json_object;
    }

    public void setResult_json_object(String result_json_object) {
        this.result_json_object = result_json_object;
    }

    public void send(){
        try {
            URL url = new URL(this.api_region_server + this.api_uri + "?&api_key=" + this.api_key);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            connection = (HttpURLConnection) urlConnection;


            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String resultString = "";
            String current;

            while((current = in.readLine()) != null) {
                resultString += current;
            }
            this.result = resultString;
            this.http_code = connection.getResponseCode();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
