package com.statistics.impl;


import com.statistics.stats.Statistics;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.Arrays;

public class StatisticImplement implements StatisticInterface {

   Statistics statistics;

    public StatisticImplement(Statistics statistics) {
        this.statistics = statistics;
    }

    public void event(int value) {
        double[] destArray = Arrays.copyOf(statistics.data, statistics.data.length + 1);
        destArray[destArray.length - 1] = value;
        this.statistics.data = destArray;

    }

    public float mean() {
         DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(statistics.data);
         return (float) descriptiveStatistics.getMean();
    }

    public int minimum() {
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(statistics.data);
        return (int) descriptiveStatistics.getMin();
    }

    public int maximum() {
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(statistics.data);
        return (int) descriptiveStatistics.getMax();
    }

    public float variance() {
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(statistics.data);
        return (float) descriptiveStatistics.getPopulationVariance();
    }



}