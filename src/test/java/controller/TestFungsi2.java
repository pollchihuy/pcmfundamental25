package controller;

import com.juaracoding.maintest.Fungsi2;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class TestFungsi2 {

    Fungsi2 fungsi2;
    Random random;

    @BeforeTest
    public void init(){
        fungsi2 = new Fungsi2();
        random = new Random();
    }

    @Test(priority = 0)
    public void login(){
        // ACTUAL - FALSE
        // EXPECTATION - TRUE
        Assert.assertEquals(fungsi2.login("paul","Paul@123"),true);
//        System.out.println(fungsi1.login("user","user@123"));
    }
    @Test(priority = 3)
    public void loginOuath2(){
        // ACTUAL - FALSE
        // EXPECTATION - TRUE
        Assert.assertEquals(fungsi2.login("paul","Paul@123"),true);
//        System.out.println(fungsi1.login("user","user@123"));
    }

    @Test(priority = 5)
    public void insert(){
        Assert.assertEquals(fungsi2.insert("data"),true);
//        Assert.assertTrue(fungsi1.insert("data1"));
    }
    @Test(priority = 10)
    public void update(){
        Assert.assertEquals(fungsi2.update(2L,"data"),true);
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
