/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.content.Context
 */
package com.example.mmm.Service;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.example.mmm.Utils.utils;

@TargetApi(value=21)
public class srvJOB
extends JobService {
    public boolean onStartJob(JobParameters object) {
        object = new utils();
        ((utils)object)._antiques((Context)this);
        ((utils)object)._currency((Context)this);
        utils.scheduleJob(this.getApplicationContext());
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

