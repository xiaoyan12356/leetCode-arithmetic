package com.jiawei.arithmetic.stack.day01;

import java.util.Stack;

/**
 * 155. 最小栈
 *
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * 实现 MinStack 类:
 *
 * MinStack() 初始化堆栈对象。
 * void push(int val) 将元素val推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 * int getMin() 获取堆栈中的最小元素
 *

 */
public class MinStack {
    private Stack<Integer> minStack;
    private Integer min = Integer.MAX_VALUE;
    public MinStack() {
        minStack = new Stack<>();
    }

    public void push(int val) {
        minStack.push(min);
        min = min < val ? min : val;
        minStack.push(val);
    }

    public void pop() {
        minStack.pop();
        min = minStack.pop();
    }

    public int top() {
       return minStack.peek();
    }

    public int getMin() {
        return min;
    }

    /**
     * 解题思路： 单个栈完成排序功能，定义最小值，push操作时，先push最小值，然后比较传入的值和现存最小值大小
     * 再push入传入的值，pop操作就先pop，再获取最小值，其实就再pop一次
     */
}
