/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_scenebuilder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;

/**
 *
 * @author mufufu
 */
public class Market extends Thread {
    int n;
    PrimaryController pc;
    
    public Market(PrimaryController c) {
        pc = c;
    }
    
    
    @Override
    public void run() {
        System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
        try {
            while(true) {
                test();
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
    }


        public void test() throws InterruptedException {
            Platform.runLater(() -> {
                System.out.println("Hola !"+n);
                pc.prueba("Hola "+n);
                n++;
                Integer random = ThreadLocalRandom.current().nextInt(10);
                Date now = new Date();
                // put random number with current time
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                pc.graph(simpleDateFormat.format(now), random);
            
            });
        }
}
        

