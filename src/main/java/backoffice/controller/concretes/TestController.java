package backoffice.controller.concretes;

import backoffice.controller.abstracts.ITestController;
import backoffice.dto.TestDTO;
import backoffice.mapper.TestMapper;
import backoffice.service.abstracts.ITestService;
import front.recipient.TestRecipient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("testController")
public class TestController implements ITestController {

    private ITestService testService;

    public String saveTestRecipient(TestRecipient testRecipient){
        TestDTO testDTO = TestMapper.recipientToDTO(testRecipient);
        // do something with that
        return testService.saveTestRecipient(testDTO);
    }

    @Autowired
    public void setTestService(ITestService testService) {
        this.testService = testService;
    }
}
