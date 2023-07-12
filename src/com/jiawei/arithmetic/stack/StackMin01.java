package com.jiawei.arithmetic.stack;

import java.util.Stack;

/**
 *  @author xiaoyan
 *  *定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *  * 示例:
 *  *
 *  * MinStack minStack = new MinStack();
 *  * minStack.push(-2);
 *  * minStack.push(0);
 *  * minStack.push(-3);
 *  * minStack.min();   --> 返回 -3.
 *  * minStack.pop();
 *  * minStack.top();      --> 返回 0.
 *  * minStack.min();   --> 返回 -2
 *  *
 *
 *  不借助辅助栈的方式进行实现
 */
public class StackMin01 {
    private Stack<Integer> stackMin;
    private  Integer min = Integer.MAX_VALUE;
    public StackMin01() {
        stackMin = new Stack<>();
    }

    //先push 一下最小值 ，再获取最新的最小值
    public void push(int x) {
        stackMin.push(min);
        min = x < min ? x:min;
        stackMin.push(x);
    }

    public void pop() {
        stackMin.pop();
        min = stackMin.pop();
    }

    public int top() {
       return stackMin.peek();
    }

    public int min() {
        return min;
    }

}
