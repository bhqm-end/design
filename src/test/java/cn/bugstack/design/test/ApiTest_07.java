package cn.bugstack.design.test;

import cn.bugstack.design.design_07.QuestionBankController;
import org.junit.Test;

public class ApiTest_07 {

    @Test
    public void test_QuestionBank() throws CloneNotSupportedException {
        QuestionBankController questionBankController=new QuestionBankController();
        System.out.println(questionBankController.createPaper("小明","10111234"));
        System.out.println(questionBankController.createPaper("小C","19999234"));
        System.out.println(questionBankController.createPaper("小H","22211234"));
    }
}
