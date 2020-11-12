package com.opstty.reducer;

import org.apache.commons.lang.ObjectUtils;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;

public class SortTreesReducer extends Reducer<DoubleWritable, NullWritable, DoubleWritable, NullWritable> {

    public void reduce(Text speciesKey, Iterable<NullWritable> values, Reducer.Context context) throws IOException, InterruptedException
    {
        context.write(speciesKey, NullWritable.get());
    }
}

