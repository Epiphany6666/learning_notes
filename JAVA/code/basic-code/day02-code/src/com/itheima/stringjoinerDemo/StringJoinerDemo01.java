package com.itheima.stringjoinerDemo;

import java.util.StringJoiner;

public class StringJoinerDemo01 {
}

class stringdemo {
    StringJoiner sj = new StringJoiner(",", "[", "]");
    int[] arr = {1, 2, 3};
	for (int i = 0; i < arr.length(); i++) {
        sj.add(arr[i]);
    }
}