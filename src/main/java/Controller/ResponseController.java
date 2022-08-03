package Controller;

import Entity.Client;
import Entity.Response;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ResponseController {
    //List<Client> AllMessages = new ArrayList<>();
    @MessageMapping("/addLog ")
    @SendTo("/topic/response")
    public Response response(Client message){
        return  new Response("Your message has been accepted. It's {"+ HtmlUtils.htmlEscape(message.getMessage()) + "} !");
    }
}
