package com.proj1.project1;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
    private final YourDataRepository dataRepository;
    public BackendController(YourDataRepository dataRepository) {

        this.dataRepository = dataRepository;
    }
    @PostMapping("/process")
    public String processFormData(@RequestBody FormData formData) {
        YourDataEntity dataEntity = new YourDataEntity(formData.getName(), formData.getEmail(), formData.getCollege());
        dataRepository.save(dataEntity);
        return "{\"status\": \"success\", \"message\": \"Data received successfully!\"}";
    }
}
