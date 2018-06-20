/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author kawatsu
 */
public class CalculatorTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of multiply method, of class Calculator.
     * @throws java.lang.Exception
     */
    
    /**
     * 2引数とも正の整数の場合のテスト <br/>
     *  対象；multiply(int, int) <br/>
     * 条件；引数 10,20 <br/>
     * 期待する戻り値； 200 <br/>
     * 
     * @throws Exception 
     */
    @Test
    public void testMultiply01()  throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 200; // 期待する戻り値
        int actual = calc.multiply(10, 20); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }

    
    /**
     * 引数に正の整数と負の整数がある場合のテスト <br/>
     *  対象；multiply(int, int) <br/>
     * 条件；引数 -10,20 <br/>
     * 期待する戻り値； -200 <br/>
     * 
     * @throws Exception 
     */
    
    @Test
    public void testMultiply02()  throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = -200; // 期待する戻り値
        int actual = calc.multiply(-10, 20); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    
    /**
     * 引数に0を含む場合のテスト <br/>
     *  対象；multiply(int, int) <br/>
     * 条件；引数 0,-20 <br/>
     * 期待する戻り値； 0 <br/>
     * 
     * @throws Exception 
     */
    
    @Test
    public void testMultiply03()  throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 0; // 期待する戻り値
        int actual = calc.multiply(0, -20); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    /**
     * Test of max method, of class Calculator.
     * @throws java.lang.Exception
     */
    
    /**
     * c &gt; b &gt; a <br/>
     * 対象；max(int, int,int) <br/>
     * 条件；引数 10,20,30 <br/>
     * 期待する戻り値； 30 <br/>
     * @throws Exception 
     */
    
    @Test
    public void testMax01() throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(10, 20, 30); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    /**
     * a &gt; b &gt; c <br/>
     * 対象；max(int, int,int) <br/>
     * 条件；引数 30,20,10 <br/>
     * 期待する戻り値； 30 <br/>
     * @throws Exception 
     */
    
    @Test
    public void testMax02() throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(30, 20, 10); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    /**
     * b &gt; a &gt; c <br/>
     * 対象；max(int, int,int) <br/>
     * 条件；引数 20,30,10 <br/>
     * 期待する戻り値； 30 <br/>
     * @throws Exception 
     */
    
    @Test
    public void testMax03() throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(20, 30, 10); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    /**
     * c &ge; b &ge; a <br/>
     * 対象；max(int, int,int) <br/>
     * 条件；引数 30,30,30 <br/>
     * 期待する戻り値； 30 <br/>
     * @throws Exception 
     */
    
    @Test
    public void testMax04() throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(30, 30, 30); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    /**
     * a &ge; b &gt; c <br/>
     * 対象；max(int, int,int) <br/>
     * 条件；引数 30,30,20 <br/>
     * 期待する戻り値； 30 <br/>
     * @throws Exception 
     */
    
    @Test
    public void testMax05() throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(30, 30, 20); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    /**
     * a &gt; b &ge; c <br/>
     * 対象；max(int, int,int) <br/>
     * 条件；引数 30,20,20 <br/>
     * 期待する戻り値； 30 <br/>
     * @throws Exception 
     */
    
    @Test
    public void testMax06() throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(30, 20, 20); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    /**
     * c &ge; b &gt; a <br/>
     * 対象；max(int, int,int) <br/>
     * 条件；引数 20,20,30 <br/>
     * 期待する戻り値； 30 <br/>
     * @throws Exception 
     */
    
    @Test
    public void testMax07() throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(20, 30, 30); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    /**
     * c &ge; a &gt; b <br/>
     * 対象；max(int, int,int) <br/>
     * 条件；引数 30,20,30 <br/>
     * 期待する戻り値； 30 <br/>
     * @throws Exception 
     */
    
    @Test
    public void testMax08() throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(30, 20, 30); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }

    /**
     * b &gt; c &ge; a <br/>
     * 対象；max(int, int,int) <br/>
     * 条件；引数 20,30,30 <br/>
     * 期待する戻り値； 30 <br/>
     * @throws Exception 
     */
    
    @Test
    public void testMax09() throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(20, 30, 20); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    /**
     * c &gt; b &ge; a <br/>
     * 対象；max(int, int,int) <br/>
     * 条件；引数 20,20,30 <br/>
     * 期待する戻り値； 30 <br/>
     * @throws Exception 
     */
    
    @Test
    public void testMax10() throws Exception{
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(20, 20, 30); // テスト対象実⾏
        assertEquals(expected, actual); // 実⾏結果の検証
    }
    
    
}
