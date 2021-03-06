package test.tencent.com.offlineDemo.jobmanger;


import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.config.Configuration;

import test.tencent.com.offlineDemo.App;
import test.tencent.com.offlineDemo.job.BaseJob;
import test.tencent.com.offlineDemo.job.PostJob;

/**
 * Created by hoollyzhang on 16/9/28.
 * Description :
 */

public class PostJobManger {

    private JobManager mJobManager;

    public PostJobManger() {
        Configuration configuration = new Configuration.Builder(App.ApplicationContext()).build();
        this.mJobManager = new JobManager(configuration);
    }

    public void newPost(String content,String localId) {
        mJobManager.addJobInBackground(new PostJob(BaseJob.BACKGROUND, content,localId));
    }
}
