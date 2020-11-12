package com.opstty.mapper;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class SortTreesMapper extends Mapper<LongWritable, Text, DoubleWritable, NullWritable> {
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        if (!value.toString().contains("ARRONDISSEMENT")) { // delete the first line of trees.csv
            String speciesheight = value.toString().split(";")[6];

            double t_height = 0;

            if (speciesheight!=null && speciesheight.length()>0){
                t_height = Double.parseDouble(speciesheight);
            }
            DoubleWritable height = new DoubleWritable(t_height);
            context.write(height, NullWritable.get());
        }

    }
}