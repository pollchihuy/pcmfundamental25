package controller;

import com.juaracoding.maintest.Fungsi1;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class TestFungsi1 {

    Fungsi1 fungsi1;
    Random random;

    @BeforeSuite
    public void initSuite(){
        System.out.println("Fungsi Init Suite Dijalankan");
    }
    
    @BeforeTest
    public void init(){
        fungsi1 = new Fungsi1();
        random = new Random();
    }

    @Test
    public void login(){
        // ACTUAL - FALSE
        // EXPECTATION - TRUE
        Assert.assertEquals(fungsi1.login("paul","Paul@123"),true);
//        System.out.println(fungsi1.login("user","user@123"));
    }

    @Test
    public void insert(){
        Assert.assertEquals(fungsi1.insert("data"),true);
//        Assert.assertTrue(fungsi1.insert("data1"));
    }
    @Test
    public void update(){
        Assert.assertEquals(fungsi1.update(2L,"data"),true);
//        Assert.assertTrue(fungsi1.update(3L,"data"));
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
