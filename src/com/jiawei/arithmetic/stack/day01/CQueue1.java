package com.jiawei.arithmetic.stack.day01;

import java.util.LinkedList;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *示例 1：
 *
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead","deleteHead"]
 * [[],[3],[],[],[]]
 * 输出：[null,null,3,-1,-1]
 * 示例 2：
 *
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 *
 * @author xiaoyan
 */
public class CQueue1 {
    private LinkedList<Integer> a, b;

    public CQueue1() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void appendTail(int value) {
        a.add(value);
    }
    public int deleteHead() {
        if (a.isEmpty()) return  -1;
        while (!a.isEmpty()){
            a.add(b.removeLast());
        }
        return b.removeLast();

    }

}
