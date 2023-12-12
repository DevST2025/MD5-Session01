package ra.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.academy.dto.SubjectDto;
import ra.academy.model.Subject;
import ra.academy.repository.ISubjectRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectService {
    @Autowired
    private ISubjectRepository subjectRepository;

    public List<SubjectDto> findAll() {
        return subjectRepository.findAll().stream().map(SubjectDto::new).collect(Collectors.toList());
    }
}
