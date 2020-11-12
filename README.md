# hadoop-examples-mapreduce


# BACHACHA Hassan  -  BERTIN Emeric - TP2-Data-Frameworks

## 1.8 Remarkable trees of Paris
wget -O trees.csv "https://raw.githubusercontent.com/makayel/hadoop-examples-mapreduce/main/src/test/resources/data/trees.csv"

hdfs dfs -put /home/hbachacha/trees.csv /user/hbachacha


yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar wordcount trees.csv /user/hbachacha/output


                20/11/11 23:48:42 INFO mapreduce.Job: Running job: job_1603290159664_4294
                20/11/11 23:48:52 INFO mapreduce.Job: Job job_1603290159664_4294 running in uber mode : false
                20/11/11 23:48:52 INFO mapreduce.Job:  map 0% reduce 0%
                20/11/11 23:49:01 INFO mapreduce.Job:  map 100% reduce 0%
                20/11/11 23:49:11 INFO mapreduce.Job:  map 100% reduce 100%
                20/11/11 23:49:12 INFO mapreduce.Job: Job job_1603290159664_4294 completed successfully
                20/11/11 23:49:12 INFO mapreduce.Job: Counters: 53
                File System Counters
                        FILE: Number of bytes read=16561
                        FILE: Number of bytes written=526299
                        FILE: Number of read operations=0
                        FILE: Number of large read operations=0
                        FILE: Number of write operations=0
                        HDFS: Number of bytes read=16880
                        HDFS: Number of bytes written=14251
                        HDFS: Number of read operations=8
                        HDFS: Number of large read operations=0
                        HDFS: Number of write operations=2
                Job Counters
                        Launched map tasks=1
                        Launched reduce tasks=1
                        Data-local map tasks=1
                        Total time spent by all maps in occupied slots (ms)=21246
                        Total time spent by all reduces in occupied slots (ms)=29600
                        Total time spent by all map tasks (ms)=7082
                        Total time spent by all reduce tasks (ms)=7400
                        Total vcore-milliseconds taken by all map tasks=7082
                        Total vcore-milliseconds taken by all reduce tasks=7400
                        Total megabyte-milliseconds taken by all map tasks=10877952
                        Total megabyte-milliseconds taken by all reduce tasks=15155200
                            ...........

$ hdfs dfs -cat /user/hbachacha/output/part-r-00000



            (48.8183933679, 1
            (48.8201249835, 1
            (48.8204495642, 1
            (48.8210086122, 1
            (48.8213214388, 1
            (48.8215800145, 1
            (48.8220238534, 1
            (48.8224956954, 1
            ......
            .....
            .....
            (lac    4
            (pelouse        1
            (pente  1
            (petite 1
            (réservoir      2
            (square 3
            (île    1
            1       4


## 1.8.1 Districts containing trees
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar districts trees.csv /user/hbachacha/outputdistrict

        20/11/11 23:50:24 INFO mapreduce.Job: Running job: job_1603290159664_4295
        20/11/11 23:50:34 INFO mapreduce.Job: Job job_1603290159664_4295 running in uber mode : false
        20/11/11 23:50:34 INFO mapreduce.Job:  map 0% reduce 0%
        20/11/11 23:50:43 INFO mapreduce.Job:  map 100% reduce 0%
        20/11/11 23:50:48 INFO mapreduce.Job:  map 100% reduce 100%
        20/11/11 23:50:48 INFO mapreduce.Job: Job job_1603290159664_4295 completed successfully
        20/11/11 23:50:49 INFO mapreduce.Job: Counters: 53
                File System Counters
                        FILE: Number of bytes read=84
                        FILE: Number of bytes written=493367
                        FILE: Number of read operations=0
                        FILE: Number of large read operations=0
                        .........


$ hdfs dfs -cat /user/hbachacha/outputdistrict/part-r-00000

                11
                12
                13
                14
                15
                16
                17
                18
                19
                20
                3
                4
                5
                6
                7
                8
                9

## 1.8.2 Show all existing species

$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar SpeciesTree trees.csv /user/hbachacha/outputSpecies

        20/11/12 00:12:58 INFO mapreduce.Job: Running job: job_1603290159664_4307
        20/11/12 00:13:08 INFO mapreduce.Job: Job job_1603290159664_4307 running in uber mode : false
        20/11/12 00:13:08 INFO mapreduce.Job:  map 0% reduce 0%
        20/11/12 00:13:17 INFO mapreduce.Job:  map 100% reduce 0%
        20/11/12 00:13:27 INFO mapreduce.Job:  map 100% reduce 100%
        20/11/12 00:13:27 INFO mapreduce.Job: Job job_1603290159664_4307 completed successfully
        20/11/12 00:13:28 INFO mapreduce.Job: Counters: 53
                File System Counters
                        FILE: Number of bytes read=477
                        FILE: Number of bytes written=494167
                        FILE: Number of read operations=0
                        FILE: Number of large read operations=0
                        FILE: Number of write operations=0
                        HDFS: Number of bytes read=16880
                        HDFS: Number of bytes written=277



-sh-4.2$ hdfs dfs -cat /user/hbachacha/outputSpecies/part-r-00000

            11
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            12
            13
            13
            14
            14
            14
            15
            16
            16
            16
            16
            16
            16
            16
            16
            .......
            .......
            20
            3
            4
            5
            5
            6
            7
            7
            7
            8
            8
            8
            8
            8
            9

## 1.8.3 Number of trees by species

yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar nbtrees trees.csv /user/hbachacha/outputnbtrees


            20/11/12 01:16:43 INFO mapreduce.Job: Running job: job_1603290159664_4328
        20/11/12 01:16:53 INFO mapreduce.Job: Job job_1603290159664_4328 running in uber mode : false
        20/11/12 01:16:53 INFO mapreduce.Job:  map 0% reduce 0%
        20/11/12 01:17:02 INFO mapreduce.Job:  map 100% reduce 0%
        20/11/12 01:17:07 INFO mapreduce.Job:  map 100% reduce 100%
        20/11/12 01:17:07 INFO mapreduce.Job: Job job_1603290159664_4328 completed successfully
        20/11/12 01:17:08 INFO mapreduce.Job: Counters: 53
                File System Counters
                        FILE: Number of bytes read=727
                        FILE: Number of bytes written=494641
                        FILE: Number of read operations=0
                        FILE: Number of large read operations=0
                        FILE: Number of write operations=0
                        HDFS: Number of bytes read=16880
                        HDFS: Number of bytes written=542
                        HDFS: Number of read operations=8
                        HDFS: Number of large read operations=0
                        HDFS: Number of write operations=2



$ hdfs dfs -cat /user/hbachacha/outputnbtrees/part-r-00000


                araucana        1
                atlantica       2
                australis       1
                baccata 2
                bignonioides    1
                biloba  5
                bungeana        1
                cappadocicum    1
                carpinifolia    4
                colurna 3
                coulteri        1
                decurrens       1
                dioicus 1
                ......
                ......
                suber   1
                sylvatica       8
                tomentosa       2
                tulipifera      2
                ulmoides        1
                virginiana      2
                x acerifolia    11


## 1.8.4 Maximum height per specie of tree

$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar max_height trees.csv /user/hbachacha/outputmax_height


                                20/11/12 21:29:16 INFO mapreduce.Job: Running job: job_1603290159664_4990
                20/11/12 21:29:26 INFO mapreduce.Job: Job job_1603290159664_4990 running in uber mode : false
                20/11/12 21:29:26 INFO mapreduce.Job:  map 0% reduce 0%
                20/11/12 21:29:35 INFO mapreduce.Job:  map 100% reduce 0%
                20/11/12 21:29:45 INFO mapreduce.Job:  map 100% reduce 100%
                20/11/12 21:29:45 INFO mapreduce.Job: Job job_1603290159664_4990 completed successfully
                20/11/12 21:29:45 INFO mapreduce.Job: Counters: 53
                        File System Counters
                                FILE: Number of bytes read=683
                                FILE: Number of bytes written=494589
                                FILE: Number of read operations=0
                                FILE: Number of large read operations=0
                                FILE: Number of write operations=0
                                HDFS: Number of bytes read=16880
                                HDFS: Number of bytes written=496
                                HDFS: Number of read operations=8
                                HDFS: Number of large read operations=0
                                HDFS: Number of write operations=2

$ hdfs dfs -cat /user/hbachacha/outputmax_height/part-r-00000


                                Acer    16.0
                Aesculus        30.0
                Ailanthus       35.0
                Alnus   16.0
                Araucaria       9.0
                Broussonetia    12.0
                Calocedrus      20.0
                Catalpa 15.0
                Cedrus  30.0
                Celtis  16.0
                Corylus 20.0
                Davidia 12.0
                Diospyros       14.0
                Eucommia        12.0
                Fagus   30.0
                Fraxinus        30.0
                .......
                .......
                Sequoia 30.0
                Sequoiadendron  35.0
                Styphnolobium   10.0
                Taxodium        35.0
                Taxus   13.0
                Tilia   20.0


## 1.8.5 Sort the trees height from smallest to largest 

$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar sorttrees trees.csv /user/hbachacha/outputsorttrees


                        20/11/12 22:03:52 INFO mapreduce.Job: Running job: job_1603290159664_5008
                20/11/12 22:04:02 INFO mapreduce.Job: Job job_1603290159664_5008 running in uber mode : false
                20/11/12 22:04:02 INFO mapreduce.Job:  map 0% reduce 0%
                20/11/12 22:04:11 INFO mapreduce.Job:  map 100% reduce 0%
                20/11/12 22:04:21 INFO mapreduce.Job:  map 100% reduce 100%
                20/11/12 22:04:22 INFO mapreduce.Job: Job job_1603290159664_5008 completed successfully
                20/11/12 22:04:22 INFO mapreduce.Job: Counters: 53
                        File System Counters
                                FILE: Number of bytes read=976
                                FILE: Number of bytes written=495181
                                FILE: Number of read operations=0
                                FILE: Number of large read operations=0
                                FILE: Number of write operations=0
                                HDFS: Number of bytes read=16880

$ hdfs dfs -cat /user/hbachacha/outputsorttrees/part-r-00000

                        0.0
                        2.0
                        5.0
                        6.0
                        9.0
                        10.0
                        10.0
                        10.0
                        10.0
                        10.0
                        11.0
                        12.0
                        12.0
                        12.0
                        12.0
                        12.0
                        12.0
                        12.0
                        ..
                        ..
                        ..       
                        35.0
                        35.0
                        40.0
                        40.0
                        40.0
                        42.0
                        45.0











