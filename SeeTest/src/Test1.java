
//package <set your test package>;
import com.experitest.client.*;
import org.junit.*;

/**
 *
 *
*/

public class Test1 {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "C:\\Users\\rashmi.c.kumari\\workspace\\project2";
    protected Client client = null;

    @Before
    public void setUp(){
        client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        client.setReporter("xml", "reports", "Untitled");
    }

    @Test
    public void testUntitled(){
        // it is recommended to start your script with SetDevice command:
        // client.setDevice( <Device Name>);
    }

    @After
    public void tearDown(){
        client.generateReport(true);
    }
}
