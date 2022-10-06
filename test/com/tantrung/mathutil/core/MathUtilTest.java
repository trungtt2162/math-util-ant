/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tantrung.mathutil.core;


import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class MathUtilTest {

    //@Test là 1 đánh dấu = annotation để báo với JVM
    //biết rằng hàm này là hàm main() và chạy code trong hàm này
    //Nếu thiếu @Test trước cái hàm thì JUnit k vận hành!!!
    @Test
    //TEST CASE 1: n = 0, expected = 1
    //TEST CASE 2: n = 1, expected = 1
    //TEST CASE 3: n = 3, expected = 6
    public void testFactorialGivenRightArgumentReturnsWell() {
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);

        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
    }

    @Test
    //TEST CASE 4: n = 4, 4! = 24, expected = 24, actual = ? đoán xem
    //TEST CASE 5: n = 5, 5! = 120, expected = 120, actual = ?
    public void testFactorialGivenRightArgumentReturnsWell2() {

        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    /* @Test
    public void testGreen(){
        Assert.assertEquals(10, 10);
    }
    @Test
    public void testRed(){
        Assert.assertEquals(10, 100);
    }*/
    //bắt Exception thì sao??
    //TEST CASE 5: n = -5, -5! expected: hy vọng thấy NGOẠI LỆ NÉM RA
    //Nếu -5 đưa vào hàm, thì phải thấy ngoại lệ xuất hiện
    //Nếu ngoại lệ xuất hiện khi tính -5!, NGHĨA LÀ HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ
    //TUI MUỐN ĐO, CÓ NGOẠI LỆ XUẤT HIỆN HAY K KHI CHƠI -5
    //DO NGOẠI LỆ K PHẢI LÀ VALUE KIỂU LONG ĐỂ SO SÁNH
    //CÁCH VIẾT KHÁC 1 TÍ: KHI CHẠY -5! EXPECTED = IllegalArgumentException
    //nghĩa là có sự xuất hiện của 1 object thuộc class IllegalArgEx
    //@Test(expected = Exception.class) k tốt, vì chung chung Exception
    @Test(expected = IllegalArgumentException.class) //bắt lớp con
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
}
