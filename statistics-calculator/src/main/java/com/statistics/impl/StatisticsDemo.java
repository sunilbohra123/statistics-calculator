package com.statistics.impl;

import com.statistics.stats.Statistics;

public class StatisticsDemo {

    public static void main(String[] args){
        Statistics statistics = new Statistics();
        double[] dataList = {4, 2, 5};
        statistics.data = dataList;
        StatisticImplement impl = new StatisticImplement(statistics);
        System.out.println("Min:" + impl.minimum());
        System.out.println("Max:" + impl.maximum());
        System.out.println("Variance:" + impl.variance());
        System.out.println("Mean:" + impl.mean());
        impl.event(1);
        System.out.println("New Min after adding event:" + impl.minimum());

    }
}
