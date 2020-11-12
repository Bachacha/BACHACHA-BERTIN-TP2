package com.opstty;

import com.opstty.job.*;
import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");

            programDriver.addClass("districts", District.class,
                    "A map/reduce program that counts the words in the input files.");

            programDriver.addClass("SpeciesTree", SpeciesTree.class,
                    "A map/reduce program that counts the words in the input files.");

            programDriver.addClass("nbtrees", NbTrees.class,
                    "A map/reduce program that counts the words in the input files.");

            programDriver.addClass("max_height", Max_Height.class,
                    "A map/reduce program that displays the maximum height of each species.");

            programDriver.addClass("sorttrees", SortTrees.class,
                    "A map/reduce program that sort the height of the trees.");


            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
