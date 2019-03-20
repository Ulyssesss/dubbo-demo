package com.ulyssesss.dubbo.consumer.controller;

import com.ulyssesss.dubbo.provider.dto.QueryStudentDTO;
import com.ulyssesss.dubbo.provider.service.ProviderService;
import com.ulyssesss.dubbo.provider.vo.StudentVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Reference
    private ProviderService providerService;

    @PostMapping("/queryStudent")
    public StudentVO queryStudent(@RequestBody QueryStudentDTO queryStudentDTO) {
        log.info("[consumer-service][ConsumerController] queryStudent queryStudentDTO = {}", queryStudentDTO);
        return providerService.queryStudent(queryStudentDTO);
    }
}
