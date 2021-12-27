package ch.bytecrowd.log4shell;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class HintController {

    private static final Logger LOG = LogManager.getLogger(SecretController.class);
    
    @GetMapping(path = "/v3", produces = MediaType.TEXT_HTML_VALUE)
    public String get() {
        LOG.info("Received a call for /v3");
        return "<!DOCTYPE html>\n" +
        "<html>\n" +
        "    <head\n" + 
        "       hint=\"who the heck is open-api !!??\">\n" +
        "    </head>\n" +
        "    <body></body>\n" +
        "</html>";
    }
}