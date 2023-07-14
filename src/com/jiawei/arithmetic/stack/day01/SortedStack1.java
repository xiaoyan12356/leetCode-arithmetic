package com.jiawei.arithmetic.stack.day01;

import java.util.Stack;

/**
 * 栈排序
 * 栈排序。 编写程序，对栈进行排序使最小元素位于栈顶。最多只能使用一个其他的临时栈存放数据，但不得将元素复制到别的数据结构（如数组）中。该栈支持如下操作：push、pop、peek 和 isEmpty。当栈为空时，peek 返回 -1。
 *
 *
 * 辅助栈实现
 *
 * @author xiaoyan*/
public class SortedStack1 {
    private Stack<Integer> stack ;
    private  Stack<Integer> tmp;

    public SortedStack1() {
        stack = new Stack<>();
        tmp = new Stack<>();
    }

    public void push(int val) {
        while (!stack.isEmpty() && val < stack.peek()){
            tmp.push(stack.pop());
        }
        stack.push(val);
        while (!tmp.isEmpty()){
            stack.push(tmp.pop());
        }


    }

    public void pop() {
        if (stack.isEmpty()) return;
        stack.pop();
    }

    public int peek() {
        return stack.isEmpty() ? -1 :stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }


    /**
     * 解题思路： 在push操作时，如果stack不为null，并且push的元素小于栈顶元素
     * 需要将将小于待push的元素都push到tmp Stack中，然后push入stack中，最后再将
     * tmpStack中的元素都push回stack中
     */


}
