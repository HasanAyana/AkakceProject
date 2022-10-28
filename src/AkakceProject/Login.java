package AkakceProject;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://www.akakce.com/");


        WebElement girisButton = driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
        girisButton.click();
        MyFunc.Bekle(1);

        WebElement eposta = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eposta.sendKeys("asda1234@gmail.com");
        MyFunc.Bekle(1);

        WebElement sifre = driver.findElement(By.xpath("//input[@type='password']"));
        sifre.sendKeys("Grup6Geliyor!");
        MyFunc.Bekle(1);



        WebElement giris = driver.findElement(By.id("lfb"));
        giris.click();

        WebElement ersantext = driver.findElement(By.xpath("//*[@id='HM_v8']/i/a"));
        Assert.assertTrue("Login failed",ersantext.getText().contains("Erşan"));
        ersantext.click();
        MyFunc.Bekle(1);

        WebElement siparislerim = driver.findElement(By.linkText("Siparişlerim"));
        siparislerim.click();
        MyFunc.Bekle(1);

        WebElement sipariYok = driver.findElement(By.xpath("//*[@id='user-order-info']/div"));
        Assert.assertTrue("Test failed",sipariYok.getText().contains("Kayıtlı siparişiniz bulunmuyor."));
        MyFunc.Bekle(1);


        WebElement anasayfa=driver.findElement(By.xpath("//a[@href='/']"));
        anasayfa.click();
        MyFunc.Bekle(1);


        WebElement ersantext1 = driver.findElement(By.linkText("Erşan"));
        ersantext1.click();
        MyFunc.Bekle(1);

        WebElement mesaj=driver.findElement(By.xpath("//a[text()='Mesajlarım']"));
        mesaj.click();
        MyFunc.Bekle(1);

        WebElement mesajbul=driver.findElement(By.xpath("//p[text()='Listelenecek mesaj bulunamadı.']"));
        Assert.assertTrue("Mesaj var",mesajbul.getText().contains("Listelenecek mesaj bulunamadı."));
        MyFunc.Bekle(1);

        WebElement anasayfa1=driver.findElement(By.xpath("//a[@href='/']"));
        anasayfa1.click();
        MyFunc.Bekle(1);



        WebElement ersantext2 = driver.findElement(By.linkText("Erşan"));
        ersantext2.click();
        MyFunc.Bekle(1);


        WebElement hesapSil=driver.findElement(By.xpath("//a[@href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        hesapSil.click();
        MyFunc.Bekle(1);

        WebElement deleteAccount=driver.findElement(By.xpath("//input[@id='p']"));
        deleteAccount.sendKeys("Grup6Geliyor!");
        MyFunc.Bekle(1);

        WebElement delete=driver.findElement(By.xpath("//input[@id='u']"));
        delete.click();






















        Kapat();

    }

}
