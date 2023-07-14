/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh4.baitap3;

/**
 *
 * @author Admin
 */
public class Thread2 extends Thread {
    private SharedData sharedData;
    
    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    
    @Override
    public void run() {
        while (true) {
            synchronized (sharedData) {
                // Kiểm tra xem Thread 1 có dừng hay không
                if (sharedData.isStopped())
                    break;
                
                // Chờ Thread 1 sinh số ngẫu nhiên
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                // Lấy số ngẫu nhiên và hiển thị bình phương
                int randomNumber = sharedData.getRandomNumber();
                int square = randomNumber * randomNumber;
                System.out.println("Square of " + randomNumber + " is " + square);
                
                // Thông báo cho Thread 1 tiếp tục
                sharedData.notify();
            }
        }
    }
}