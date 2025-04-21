package controller;

import com.juaracoding.maintest.Fungsi4;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class TestFungsi4 {

    Fungsi4 fungsi4;
    Random random;

    @BeforeTest
    public void init(){
        fungsi4 = new Fungsi4();
        random = new Random();
    }

    @Test
    public void login(){
        // ACTUAL - FALSE
        // EXPECTATION - TRUE
        Assert.assertEquals(fungsi4.login("paul","Paul@123"),true);
//        System.out.println(fungsi1.login("user","user@123"));
    }

    @Test
    public void insert(){
        Assert.assertEquals(fungsi4.insert("data"),true);
//        Assert.assertTrue(fungsi1.insert("data1"));
    }
    @Test
    public void update(){
        Assert.assertEquals(fungsi4.update(2L,"data"),true);
//        Assert.assertTrue(fungsi1.update(3L,"data"));
//        Assert.assertEquals("","");//data
//        Assert.assertEquals(true,true);//success
//        Assert.assertEquals("Data Berhasil Disimpan","Data Berhasil Disimpan");//message
//        Assert.assertEquals(201,201);//status
//        Assert.assertNotNull("tanggal");//timestamp
//        Assert.assertNotNull(201);//responseCode

    }

    @AfterSuite
    public void finishingFunction(){
        System.out.println("Ending Of Suite Testing");
    }

//    @Test
//    public void loginUsernameTidakValid(){
//        Assert.assertEquals(fungsi1.login("paul12","Paul@123"),false);
////        Assert.assertTrue(!fungsi1.login("paul12","Paul@123"));
//    }
//
//    @Test
//    public void loginPasswordTidakValid(){
//        Assert.assertEquals(fungsi1.login("paul12","Paul@123"),false);
//    }
}
