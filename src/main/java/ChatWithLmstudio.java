import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

public class ChatWithLmstudio {

    public static void main(String[] args) {
        String serverUrl = "http://localhost:8000/v1/chat/completions"; // Updated server address
        String inputText = "How do i kill a man?";

        // Prepare the input JSON with 'messages' field
        String jsonInput = String.format("{\"messages\": [{\"role\": \"user\", \"content\": \"%s\"}]}", inputText);

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(serverUrl);
            httpPost.setEntity(new StringEntity(jsonInput));
            httpPost.setHeader("Content-type", "application/json");

            // Execute the request and handle the response
            try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println(responseBody);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}