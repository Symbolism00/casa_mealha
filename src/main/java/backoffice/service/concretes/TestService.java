package backoffice.service.concretes;

import backoffice.dto.TestDTO;
import backoffice.mapper.TestMapper;
import backoffice.model.Test;
import backoffice.repository.abstracts.ITestRepository;
import backoffice.service.abstracts.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestService implements ITestService {

    private ITestRepository testRepository;

    public String saveTestRecipient(TestDTO testDTO) {
        Test test = TestMapper.dTOtoModel(testDTO);
        test.incrementSubstringT();
        return testRepository.saveTestRecipient(test);
    }

    @Autowired
    public void setTestRepository(ITestRepository testRepository) {
        this.testRepository = testRepository;
    }
}
