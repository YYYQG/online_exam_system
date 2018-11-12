package com.xxx.util.mybatisgenerator;

import java.util.Random;

/**
 * @ClassName: test
 * @Description:
 * @Auther: Owenb
 * @Date: 11/12/18 9:55
 * @Version: 1.0
 */
public class test {
    public static void main(String[] args) {


        Random random = new Random();
        int i = random.nextInt(4) + 1;


        System.out.println(i);
    }
}
