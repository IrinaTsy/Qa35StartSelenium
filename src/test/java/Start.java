import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {
    WebDriver wd;

    @Test
    public void goToPhoneBook(){

        //open browser
        wd = new ChromeDriver();

        //go to Phonebook
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/"); //without saving history
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/"); //with saving history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        //close browser
        //wd.close(); //close active window
        wd.quit(); //close browser
    }

    @Test
    public void loginTest(){

        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");

        //open loginPage: find loginTab --> click on LoginTab
        //fill Email: find element Email --> type "Email"
        //fill password: find element Password --> type "Password"
        //login submit: find button Login --> click on Login button
        //class Assert: expected result = actual result

        //by tagName
        // h1 - two elements PHONEBOOK and Home Component
        WebElement el = wd.findElement(By.tagName("h1")); //Проверяя сверxу вниз Selenium наxодит первый
                                                            //попавшийся компонент с таким TagName, возвращает его
                                                            //и останавливается.
        el.click();         //нажать на наденный элемент

        List<WebElement> list = wd.findElements(By.tagName("h1"));
        WebElement el1 = list.get(1); //у Home Component, в массиве, индекс 1, т.к. он наxодится на втором месте
        el1.click();

        //By.Id
        wd.findElement(By.id("root"));

        //By.Class
        wd.findElement(By.className("container"));

        //By.linkText
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.partialLinkText("AB"));

        //By.name
        wd.findElement(By.name("name"));
        wd.findElement(By.name("surename"));

        //By.ccsSelector
        //tagname
        wd.findElement(By.cssSelector("h1"));
        wd.findElement(By.cssSelector("a"));

        //id
        wd.findElement(By.cssSelector("#root"));

        //class
        wd.findElement(By.cssSelector(".container"));

        //attribute
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href]"));

        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href ^='/ho']"));  //a[starts-with(@href,'/ho')]  /// start with /ho
        wd.findElement(By.cssSelector("[href *='om']")); // containce - om
        wd.findElement(By.cssSelector("[href $='me']")); // end of me

        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("a[href='/home']"));


        //By.xPath




        wd.quit();
    }
}



























