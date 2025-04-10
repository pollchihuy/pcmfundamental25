package com.juaracoding.exchandling;

import java.io.IOException;
import java.sql.SQLException;

public class KeywordThrows {


    public static void main(String[] args) {
        try {
            getData();
        } catch (InterruptedException e) {
            // kalian lakukan semua kita si pemanggil terakhir
        }catch (IOException e) {
            // kalian lakukan semua kita si pemanggil terakhir
        }catch (SQLException e) {
            // kalian lakukan semua kita si pemanggil terakhir
        }
    }
    public static void getData() throws InterruptedException , SQLException, IOException {
        Thread.sleep(1000);
    }
}
