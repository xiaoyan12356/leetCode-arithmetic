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
public class MinStack1 {
    private  Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack1() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if (minStack.isEmpty() || val < minStack.peek()) {
            minStack.push(val);
        }else {
            minStack.push(minStack.peek());
        }
        stack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
       return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    /**
     * 解题思路： 借助辅助栈获取最小值，其实就push的时候正常push到stack中，如果minstack中没有元素
     * 也push进入，但如果已经有元素，要将minStack peek出一个值与将要push值进行比较，如果小于peek值，就可以push，
     * 如果不是，再push一次minStack peek的值。
     */
}
