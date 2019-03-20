package com.ulyssesss.dubbo.provider.service;

import com.ulyssesss.dubbo.provider.dto.QueryStudentDTO;
import com.ulyssesss.dubbo.provider.vo.StudentVO;

public interface ProviderService {

    StudentVO queryStudent(QueryStudentDTO queryStudentDTO);
}
