package ch.bytecrowd.log4shell;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/api")
public class SecretController {

    private static final Logger LOG = LogManager.getLogger(SecretController.class);
    private static final Base64.Encoder ENCODER = Base64.getEncoder();
    
    @PostMapping("/7678-IUFHG-9087-KJLJLJ")
    public String post(@RequestHeader("7987-LKJKF-9080-IUUZU-9876") String apiVersion) {
        LOG.info("Received a request for /api/7678-IUFHG-9087-KJLJLJ => 7987-LKJKF-9080-IUUZU-9876:" + apiVersion);
        return apiVersion.chars()
            .map(i -> i ^ 42)
            .mapToObj(Integer::toBinaryString)
            .map(String::getBytes)
            .map(ENCODER::encodeToString)
            .collect(Collectors.joining(StringUtils.LF));
    }
}