package com.org.kafkaoutput.controller;

import com.org.kafkaoutput.entity.OutputEntity;
import com.org.kafkaoutput.service.OutputService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/out", produces = MediaType.APPLICATION_JSON_VALUE)
public class OutputController {

    private final OutputService outputService;


    public OutputController(OutputService outputService) {
        this.outputService = outputService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public OutputEntity createOutput(@RequestBody OutputEntity outputEntity){
        return outputService.createMessage(outputEntity);
    }

}
