package com.jiawei.arithmetic.stack;

import java.util.Stack;

/**
 * @author xiaoyan
 *定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.min();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.min();   --> 返回 -2
 *
 *
 * 以辅助栈的方式进行实现
 */
public class StackMin {
    private Stack<Integer> stack;
    private Stack<Integer> stackMin;
        /** initialize your data structure here. */
        public StackMin() {
            stack = new Stack<>();
            stackMin = new Stack<>();
        }

        public void push(int x) {
            // 如果stackMin为空或者x 小于 stackMin.peek()的元素，
            // 那么都加入到stackMin中
            if (stackMin.isEmpty() || x < stackMin.peek()){
                stackMin.push(x);
            }else {
                // 再压一次当前最小值元素
                stackMin.push(min());
            }
            // push 入stack中
            stack.push(x);
        }

        public void pop() {
            stack.pop();
            stackMin.pop();
        }

        public int top() {
            return  stack.peek();
        }

        public int min() {
            return  stackMin.peek();
        }



}
