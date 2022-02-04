import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.*;


public class SkillDemoTester {
    @Test
    public void addition1() {
        assertEquals(3, SkillDemo.add(1,2));
    }
}
