package backoffice.mapper;

import backoffice.dto.TestDTO;
import backoffice.model.Test;
import front.recipient.TestRecipient;

public class TestMapper {

    public static TestDTO recipientToDTO(TestRecipient testRecipient){
        return new TestDTO(testRecipient.getText());
    }

    public static Test dTOtoModel(TestDTO testDTO){
        return new Test(testDTO.text);
    }
}
