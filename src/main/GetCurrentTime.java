/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

public class GetCurrentTime implements Runnable {

    private boolean r;
    private JLabel txtDate = new JLabel();
    Thread t1 = null;

    public GetCurrentTime(JLabel txtDate, boolean r) {
        this.r = r;
        this.txtDate = txtDate;
    }

    public void setR(boolean r) {
        this.r = r;
    }
    
    public JLabel getTxtDate(){
        t1 = new Thread(this);
        t1.start();
        return txtDate;
    }

    @Override
    public void run() {
        while (r) {
            this.txtDate = dateCreate(txtDate);
        }
    }

    static JLabel dateCreate(JLabel txtDate) {
        Calendar cld = new GregorianCalendar();
        int date = cld.get(Calendar.DAY_OF_MONTH);
        int month = cld.get(Calendar.MONTH);
        int year = cld.get(Calendar.YEAR);

        ////time 
        int sc = cld.get(Calendar.SECOND);
        int mnt = cld.get(Calendar.MINUTE);
        int hr = cld.get(Calendar.HOUR);
        txtDate.setText(date + "/" + (month + 1) + "/" + year + "  |  " + hr + ":" + mnt + ":" + ((sc < 10) ? "0" + sc : sc));
        return txtDate;
    }

}
