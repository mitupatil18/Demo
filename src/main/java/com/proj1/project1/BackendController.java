package com.proj1.project1;

import com.proj1.project1.YourDataRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.proj1.project1.FormData;
import com.proj1.project1.YourDataRepository;

@RestController
public class BackendController {
    private final YourDataRepository dataRepository;
    public BackendController(YourDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }
    @PostMapping("/process")
    public String processFormData(@RequestBody FormData formData) {
        // Process the data or perform any backend tasks
        // ...
        YourDataEntity dataEntity = new YourDataEntity(formData.getName(), formData.getEmail());
        dataRepository.save(dataEntity);
        // Return a response back to the frontend
        return "{\"status\": \"success\", \"message\": \"Data received successfully!\"}";
    }
}
