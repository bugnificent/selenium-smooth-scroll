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
                "       if (!scDown.getBoundingClientRect().top <= 0) {" +  //scDown elementine kadar kaydir
                "          requestAnimationFrame(step);" + // Animasyon benzeri efekt
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
                "      window.scrollBy(0, 5);" +  // Her seferinde 5px kaydır
                "      if (document.documentElement.scrollTop + window.innerHeight < document.documentElement.scrollHeight) {" +
                "          requestAnimationFrame(step);" +  // Sayfanın sonuna gelmediysek devam et
                "      } " +
                "   }" +
                "   step();" +
                "}" +
                "smoothScroll();";
        js.executeScript(script);

    }
}
