package ee.projektPlus.quiz.rest;

import ee.projektPlus.quiz.dto.HealthCheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthcheckRestController {

//    @GetMapping
//    public String healthcheck() {
//        return "It's working!";
//    }

    @GetMapping
    public HealthCheckDto healthCheckDto() {
        HealthCheckDto dto = new HealthCheckDto(true, "It's working!");
        return dto;
    }

}