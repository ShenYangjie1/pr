package com.shen.test;

class Test1{
    public static void main(String[] args) {
        Weekday nowday = Weekday.SUN;
        Weekday.printNowDay(nowday);
        Weekday nextDay = Weekday.getNextDay(nowday);
        System.out.print("nextday ====> ");
        Weekday.printNowDay(nextDay);
    }
}       
//测试结果：
//sunday
//nextday ====> monday