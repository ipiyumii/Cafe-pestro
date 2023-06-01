/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cafex;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author piyumiimalka
 */
public class CafeX {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Constants.Populate();
        
        var dashboard = new Dashboard();
        dashboard.setTitle("Dashboard Main");
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);
        
        dashboard.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Perform any necessary cleanup or actions when the new frame is closed
            }
            
        });
    
    }
}
