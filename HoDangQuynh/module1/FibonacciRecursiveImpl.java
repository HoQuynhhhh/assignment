package com.ksstudents.math;

import java.util.ArrayList;
import java.util.List;

public class FibonacciRecursiveImpl implements IFibonacci {

    @Override
    public List<Long> calculate(int n, boolean flag) {
        List<Long> sequence = new ArrayList<>();
        
        if (flag) {
            // Trường hợp flag = true: Tính toàn bộ dãy
            for (int i = 0; i < n; i++) {
                sequence.add(getFibonacci(i));
            }
        } else {
            // Trường hợp flag = false: Chỉ lấy số cuối cùng
            if (n > 0) {
                sequence.add(getFibonacci(n - 1));
            }
        }
        return sequence;
    }

    // Hàm đệ quy thuần túy
    private long getFibonacci(int i) {
        if (i <= 0) return 0;
        if (i == 1) return 1;
        return getFibonacci(i - 1) + getFibonacci(i - 2);
    }
}