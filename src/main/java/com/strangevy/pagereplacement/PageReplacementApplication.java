package com.strangevy.pagereplacement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PageReplacementApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 输入物理内存块总数
        String inputString;
        int pageSize;
        for(;;){
            try {
                System.out.print("请输入物理内存块总数：");
                inputString = scanner.nextLine();
                pageSize = Integer.parseInt(inputString);
                break;
            } catch (NumberFormatException ignored) {
            }
        }
        // 输入请求页面号
        List<Integer> requestPageList = new ArrayList<>();
        for(;;){
            System.out.print("请输入请求页面号(输入非整数数字结束输入)：");
            inputString = scanner.nextLine();
            if (!isInteger(inputString)) {
                break;
            }
            requestPageList.add(Integer.valueOf(inputString));
        }

        System.out.print("内存块数：" + pageSize + "，页面号请求序列：" + requestPageList.toString());

        // 最佳置换算法
        optimal(pageSize, requestPageList);
        // 先进先出
        fifo(pageSize, requestPageList);
        // 最近最少使用
        lru(pageSize, requestPageList);
    }


    /**
     * 最佳置换算法(Optimal)
     * @param pageSize
     * @param requestPageList
     */
    private static void optimal(int pageSize, List<Integer> requestPageList) {
        System.out.println("Optimal start");
        System.out.println("Optimal end");
    }


    /**
     * 先进先出(FIFO)
     * @param pageSize
     * @param requestPageList
     */
    private static void fifo(int pageSize, List<Integer> requestPageList) {
        System.out.println("FIFO start");
        int[] page = new int[pageSize];

        System.out.println("FIFO end");
    }

    /**
     * 最近最少使用(LRU)
     * @param pageSize
     * @param requestPageList
     */
    private static void lru(int pageSize, List<Integer> requestPageList) {
        System.out.println("LRU start");
        System.out.println("LRU end");
    }


    private static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[0-9]*$");
        return pattern.matcher(str).matches();
    }

}
