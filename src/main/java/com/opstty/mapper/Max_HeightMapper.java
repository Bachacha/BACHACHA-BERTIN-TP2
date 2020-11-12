package com.opstty.mapper;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


import java.io.IOException;

public class Max_HeightMapper extends Mapper<LongWritable, Text, Text, DoubleWritable> {
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (!value.toString().contains("ARRONDISSEMENT")) { // delete the first line of trees.csv

            Text species = new Text(value.toString().split(";")[2]);
            String heightspecies = value.toString().split(";")[6];

            double t_height = 0;

            if (heightspecies!=null && heightspecies.length()>0){
                t_height = Double.parseDouble(heightspecies);
            }

            DoubleWritable height = new DoubleWritable(t_height);
            context.write(species,height);
        }

    }
}
