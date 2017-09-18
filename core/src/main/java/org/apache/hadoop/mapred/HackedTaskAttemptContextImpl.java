package org.apache.hadoop.mapred;

public class HackedTaskAttemptContextImpl extends TaskAttemptContextImpl {

    public HackedTaskAttemptContextImpl(JobConf conf, TaskAttemptID taskid) {
        super(conf, taskid);
    }
}
