package com.example.mmm.Service;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.example.mmm.Utils.utils;

@TargetApi(21)
public class srvJOB extends JobService {
   public boolean onStartJob(JobParameters var1) {
      utils var2 = new utils();
      var2._antiques(this);
      var2._currency(this);
      utils.scheduleJob(this.getApplicationContext());
      return true;
   }

   public boolean onStopJob(JobParameters var1) {
      return true;
   }
}
