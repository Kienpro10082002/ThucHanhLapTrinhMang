/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh4.baitap3;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Thread1 extends Thread {
    private SharedData sharedData;
    
    public Thread1(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    
    @Override
    public void run() {
        Random random = new Random();
        int count = 0;
        
        while (count < 10) {
            synchronized (sharedData) {
                // Sinh số ngẫu nhiên từ 1 đến 100
                int randomNumber = random.nextInt(100) + 1;
                
                // Đưa số ngẫu nhiên vào sharedData
                sharedData.setRandomNumber(randomNumber);
                
                // Chờ Thread 2 hiển thị bình phương
                try {
                    sharedData.notify();
                    sharedData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            count++;
        }
        
        // Khi kết thúc, thông báo cho Thread 2 dừng
        synchronized (sharedData) {
            sharedData.setStopped(true);
            sharedData.notify();
        }
    }
}
