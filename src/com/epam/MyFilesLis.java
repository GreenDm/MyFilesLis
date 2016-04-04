package com.epam;

import java.io.File;

/**
 * Created by m18 on 04.04.2016.
 */
public class MyFilesLis {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\m18");
        String[] list =  file.list();

        for (String s : list) {
            System.out.println(s);

        }
    }
}
