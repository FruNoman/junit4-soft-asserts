import com.github.frunoman.softasserts.SoftAssert;
import org.junit.Test;

public class SoftTest {

    @Test
    public void softTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,2,"Some bad");
        softAssert.assertEquals(1,1,"Some good");
        System.out.println("After asserts");
        softAssert.assertAll();
    }
}
