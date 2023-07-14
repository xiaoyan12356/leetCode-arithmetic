package com.jiawei.arithmetic.stack.day01;

import java.util.Stack;

/**
 * 栈排序
 * 栈排序。 编写程序，对栈进行排序使最小元素位于栈顶。最多只能使用一个其他的临时栈存放数据，但不得将元素复制到别的数据结构（如数组）中。该栈支持如下操作：push、pop、peek 和 isEmpty。当栈为空时，peek 返回 -1。
 *
 *
 * 递归实现
 *
 * @author xiaoyan*/
public class SortedStack {
    private Stack<Integer> stack ;

    public SortedStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        if(stack.isEmpty()) return;
        sort(stack);

        stack.pop();
    }

    public int peek() {
        if(stack.isEmpty()) return -1;
        sort(stack);

        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void sort(Stack<Integer> stack){
        if (!stack.isEmpty()){
            int pop = stack.pop();
            sort(stack);
            sortStack(stack,pop);
        }
    }

    private void sortStack(Stack<Integer> stack, int pop) {
        if (stack.isEmpty() || pop < stack.peek()){
            stack.push(pop);
        }else {
            int tmp = stack.pop();
            sortStack(stack,pop);
            stack.push(tmp);
        }
    }

    /**
     * 递归实现排序，原则就是 递归获取从栈低到栈顶元素，每次获取都执行一次排序操作，而排序
     * 操作如果stack为空或者 获取的元素小于当前栈中的peek，直接push，否则获取pop（）元素，直到找到满足条件的
     * 最后再push会stack中
     */
}
