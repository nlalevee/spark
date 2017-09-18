package org.apache.hadoop.mapred;

public class HackedJobContextImpl extends JobContextImpl {

    public HackedJobContextImpl(JobConf conf, org.apache.hadoop.mapreduce.JobID jobId) {
        super(conf, jobId);
    }
}
