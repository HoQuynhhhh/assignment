package com.ksstudents.math;

import java.util.ArrayList;
import java.util.List;

public class FibonacciLoopOptimized implements IFibonacci {
    // Mảng để lưu trữ các giá trị đã tính (Memoization)
    private long[] memo;

    @Override
    public List<Long> calculate(int n, boolean flag) {
        List<Long> sequence = new ArrayList<>();
        if (n <= 0) return sequence;

        // Khởi tạo mảng ghi nhớ với kích thước n
        memo = new long[n];
        
        // Tính toán số thứ n (việc này sẽ tự động lấp đầy mảng memo nhờ đệ quy)
        getFib(n - 1);

        if (flag) {
            // Trả về cả dãy từ mảng memo
            for (int i = 0; i < n; i++) {
                sequence.add(memo[i]);
            }
        } else {
            // Chỉ lấy số cuối cùng
            sequence.add(memo[n - 1]);
        }
        return sequence;
    }

    private long getFib(int i) {
        if (i <= 0) return 0;
        if (i == 1) return 1;

        // Nếu đã tính rồi thì lấy trong mảng ra luôn, không tính lại
        if (memo[i] != 0) return memo[i];

        // Tính và lưu vào mảng ghi nhớ
        memo[i] = getFib(i - 1) + getFib(i - 2);
        return memo[i];
    }
}