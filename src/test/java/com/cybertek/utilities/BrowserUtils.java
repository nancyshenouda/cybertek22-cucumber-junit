package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    // this method is converting List<WebElement> to List<String>
    public static List<String> getElementsText(List<WebElement> webElementList){

        // create placeholder List<String>
        List<String> actualListText = new ArrayList<>();

        for(WebElement element : webElementList){
            actualListText.add(element.getText());
        }
        return actualListText;

    }

    public static void sleep(int second) throws InterruptedException {

        second*=1000;

        try{
            Thread.sleep(second);

        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
