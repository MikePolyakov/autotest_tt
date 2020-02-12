package root.utillities;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.ByteArrayOutputStream;
public class SlackBot {
    public static boolean sendResulttoSlack(String projectName, String problemMessage) {
        CloseableHttpClient client = HttpClientBuilder.create().build();
//  1.      String url = "https://hooks.slack.com/services/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";
        String url ="https://hooks.slack.com/services/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";
        String requestJson = "";
        HttpPost request = new HttpPost(url);
        request.setHeader("Content-Type", "application/json");
        request.setHeader("charset", "utf-8");
        request.setHeader("Content-Encoding", "utf-8");
        //request.setHeader("Transfer-Encoding", "utf-8");
        request.setHeader("Accept-Charset", "utf-8");
// 2.       String s = "\uD83D\uDE40*[SL]* " + projectName.toUpperCase() +
//                "\n" + "`Problem:` " + problemMessage;
        String s =  "`Problem:` "+ problemMessage;
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        try {
            JsonFactory factory = new JsonFactory();
            JsonGenerator jsn = factory.createGenerator(bout);
            jsn.writeStartObject();
            jsn.writeBooleanField("mrkdwn", true);
            jsn.writeStringField("text", s);
            jsn.writeEndObject();
            jsn.close();
            requestJson = bout.toString();
            bout.close();
            request.setEntity(new StringEntity(requestJson));
            HttpResponse response = client.execute(request);
            return response.getStatusLine().getStatusCode() == 200;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        };
        return false;
    }
}