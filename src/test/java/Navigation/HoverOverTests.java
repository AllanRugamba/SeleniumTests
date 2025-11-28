package Navigation;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverOverTests extends BaseTests {
    @Test
    public void hoverOverLinksTest(){
        var hoveredElement = homePage.hoverOverLinks(2);
        System.out.println(hoveredElement.getCssValue("border-bottom-color"));
        assertTrue(!hoveredElement.getCssValue("border-bottom-color").contains("rgba(0, 0, 0, 0)"), "hover functionality isn't working");
    }
}