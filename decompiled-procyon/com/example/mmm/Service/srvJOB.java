package com.example.mmm.Service;

import android.annotation.*;
import android.app.job.*;
import com.example.mmm.Utils.*;
import android.content.*;

@TargetApi(21)
public class srvJOB extends JobService
{
    public srvJOB() {
        super();
    }
    
    public boolean onStartJob(final JobParameters jobParameters) {
        final utils utils = new utils();
        utils._antiques((Context)this);
        utils._currency((Context)this);
        com.example.mmm.Utils.utils.scheduleJob(this.getApplicationContext());
        return true;
    }
    
    public boolean onStopJob(final JobParameters jobParameters) {
        return true;
    }
}
