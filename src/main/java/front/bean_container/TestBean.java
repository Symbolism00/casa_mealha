package front.bean_container;

import backoffice.controller.abstracts.ITestController;
import front.recipient.TestRecipient;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.logging.Logger;

@ManagedBean
@SessionScoped
public class TestBean implements Serializable {

    private TestRecipient testRecipient;
    private static final Logger LOGGER = Logger.getLogger(TestBean.class.getName());

    @ManagedProperty("#{testController}")
    private ITestController testController;

    @PostConstruct
    public void init(){
        testRecipient = new TestRecipient();
    }

    public String saveTestRecipient(){
        return testController.saveTestRecipient(testRecipient);
    }

    // getters and setters
    public TestRecipient getTestRecipient(){
        return this.testRecipient;
    }

    public void setTestRecipient(TestRecipient testRecipient){
        this.testRecipient = testRecipient;
    }

    public ITestController getTestController() {
        return testController;
    }

    public void setTestController(ITestController testController) {
        this.testController = testController;
    }
}
