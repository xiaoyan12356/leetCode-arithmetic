package com.jiawei.arithmetic.stack.day01;

import java.util.Stack;

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
 *
 * 两个栈实现队列   要保证 stack push 到temStack中一次执行，temStack中有元素，不可以进行push
 */
public class CQueue {
    private Stack<Integer> stack ;
    private  Stack<Integer> temStack;

    public CQueue() {
        stack = new Stack<>();
        temStack = new Stack<>();
    }

    public void appendTail(int value) {
        // stack push  元素
        stack.push(value);
        pushPop();
    }
    public int deleteHead() {
        if (temStack.isEmpty())
            return  -1;
        return temStack.pop();
    }

    public void pushPop(){
        if (temStack.isEmpty()){
          // 将stack 中的所有元素都压入到temStack中
          while (!temStack.isEmpty()){
              temStack.push(stack.pop());
          }
        }
    }

    /**
     * 解题思路： 利用辅助栈，当stack栈push入一个元素，执行一次从stack 依次push到tmpStack中的操作
     * 但前提是得保证tmp中为空，pop操作时，直接从tmp栈中获取
     */
}
