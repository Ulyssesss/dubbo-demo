package com.ulyssesss.dubbo.provider.service;

import com.ulyssesss.dubbo.provider.dto.QueryStudentDTO;
import com.ulyssesss.dubbo.provider.vo.StudentVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

import java.util.Arrays;

@Slf4j
@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public StudentVO queryStudent(QueryStudentDTO queryStudentDTO) {
        log.info("[provider-service][ProviderServiceImpl] queryStudent queryStudentDTO = {}", queryStudentDTO);
        Integer id = queryStudentDTO.getId();
        String name = queryStudentDTO.getName();
        return new StudentVO(id, name, Arrays.asList("basketball", "soccer", "tennis"));
    }
}
