/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author huncho
 */
public class Quavo {
    private int hour;
    private int minute;
    private int second;
    
    public Quavo(){
        this(0,0,0);
    }
    public Quavo(int h){
        this(h,0,0);
    }
    public Quavo(int h,int m){
        this(h,m,0);
    }
    public Quavo(int h, int m,int s){
        setTime(h,m,s);
    }
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    
    public void setHour(int h){
        hour = ((h>0 && h<24) ? h:0);
    }
    public void setMinute(int m){
        minute = ((m>0 && m<60) ? m:0);
    }
    public void setSecond(int s){
        second = ((s>0 && s<60) ? s:0);
    }
    
    public int getHour(){
        return hour;
    }
    public int getminute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public String tomilitary(){
        return String.format("%02d:%02d:%02d",getHour(),getminute(),getSecond());
    }
}
