package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {


    @Test
    public  void test01(){
        AmazonPage amazonPage=new AmazonPage();
        //amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutella icin arama yapalim
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        //sonuclarin nutella icerdigini test edelim
        String expectedKelime="Nutella";
        String actualKelime=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(expectedKelime));
        Driver.closeDriver();
    }



    @DataProvider
    public static Object[][] AranacakKelimeler() {
        Object[][] arananKelimeArrayi={{"Nutella"}, {"Java"}, {"Cigdem"}, {"Netherlands"}};
        return  arananKelimeArrayi;
    }

    @Test(dataProvider = "AranacakKelimeler")
    //arayacagımız kelimeleri bir liste gibi tutup bana yollayacak  bir veri saglayacası olusturacagız

    public void dataProviderTesti(String arananKelime) {
        AmazonPage amazonPage=new AmazonPage();
        //amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutella,java,cigdem ve Netherlands için arama  yapalim
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);

        //sonuclarin nutella icerdigini test edelim
        String expectedKelime=arananKelime;
        String actualsonucYazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualsonucYazisi.contains(expectedKelime));

        //sayfayı kapatalım
        Driver.closeDriver();

    }
}

