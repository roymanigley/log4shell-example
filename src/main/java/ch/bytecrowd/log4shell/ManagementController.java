package ch.bytecrowd.log4shell;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/management")
public class ManagementController {

    private static final Logger LOG = LogManager.getLogger(ManagementController.class);
    private static final String HEALTH_PATTERN = "OK: %s";
    
    @GetMapping("/health")
    public String health() {
        LOG.info("Received a healthcheck for /management/health");
        return String.format(HEALTH_PATTERN, OffsetDateTime.now());
    }
}