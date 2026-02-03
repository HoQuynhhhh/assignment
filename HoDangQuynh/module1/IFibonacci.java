package com.ksstudents.math;

import java.util.List;

public interface IFibonacci {
    /**
     * @param n Số lượng phần tử trong dãy
     * @param flag true: Trả về cả danh sách, false: Chỉ trả về số cuối cùng
     * @return Danh sách các số Fibonacci
     */
    List<Long> calculate(int n, boolean flag);
}