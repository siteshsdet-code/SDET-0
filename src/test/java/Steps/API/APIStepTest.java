package Steps.API;

import configurations.Driver.DriverManager;
import configurations.Util.GenericUtil;
import manager.API.APIManager.APIManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class APIStepTest {

    @Test
    public void getSessionStorags_1() throws Exception {
        boolean answer = false;
        DriverManager.driverInstance().initializeDriver("web", "chrome", "https://www.amazon.com/");
        answer = APIManager.getAPIManager().getAccessToken("pid");
        answer = GenericUtil.genericUtilInstance().getSumPDFBasedOnColumnName("/Users/siteshkumarvishwakarma/Downloads/raju_poin.pdf", "Deposited Cash");
        Assert.assertTrue(answer, "Not validated");
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 6, 4, 6, 4, 7, 3);
        boolean hasDuplicate = list.size() != new HashSet<>(list).size();
        System.out.println(hasDuplicate);
    }

    @Test
    public void runGitTest(){
        System.out.println("from git development branch");
    }
}