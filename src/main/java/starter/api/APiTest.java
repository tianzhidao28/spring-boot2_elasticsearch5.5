package starter.api;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocyuan
 * @since 2018/1/20 下午5:42
 */
@RestController
public class APiTest {

    @Autowired
    private TransportClient client;


    @RequestMapping(value = "/client/{articleId}")
    public GetResponse test(@PathVariable String articleId) {
        GetResponse response = client.prepareGet("information", "article", articleId).get();
        return response;
    }
}
