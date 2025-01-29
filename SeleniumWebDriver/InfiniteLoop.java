package com.velespit.tests.project;

import com.velespit.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Website {

    @Test
    public void scrollTest() {
        
        Driver.getDriver().get("https://yusufasik.com");

        WebElement scDown = Driver.getDriver().findElement(By.xpath("//span[.='Copyright']"));

        /*
        Scroll until given element.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String script = "function smoothScroll(scDown) {" +
                "   let y = 0;" +
                "   function step() {" +
                "      window.scrollBy(0, 10);" + // 10 piksel kaydır
                "      y += 5;" +
                "       if (!scDown.getBoundingClientRect().top <= 0) {" +  //Scroll Down until given element
                "          requestAnimationFrame(step);" + // animation
                "      }" +
                "   }" +
                "   step();" +
                "}" +
                "smoothScroll(arguments[0]);";
        js.executeScript(script,scDown);
         */


        /*
        scrollHeight will stop the code
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String script = "function smoothScroll() {" +
                "   let y = 0;" +
                "   function step() {" +
                "      window.scrollBy(0, 5);" +
                "      y += 5;" +
                "      if (y >= 0) {" +
                "          requestAnimationFrame(step);" +
                "      }" +
                "   }" +
                "   step();" +
                "}" +
                "smoothScroll();";
        js.executeScript(script);

         */

        //Smooth Infinite Scroll Loop
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String script = "function smoothScroll() {" +
                "   function step() {" +
                "      window.scrollBy(0, 5);" +  // scroll down 5px each
                "      if (document.documentElement.scrollTop + window.innerHeight < document.documentElement.scrollHeight) {" +
                "          requestAnimationFrame(step);" +  // You can put else statement here if you want to stop when you reach scrollheight threshold.
                "      } " +
                "   }" +
                "   step();" +
                "}" +
                "smoothScroll();";
        js.executeScript(script);

    }
}
