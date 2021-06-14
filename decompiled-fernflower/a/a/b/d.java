package a.a.b;

import a.ab;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d {
   private final Set a = new LinkedHashSet();

   public final void a(ab var1) {
      synchronized(this){}

      try {
         this.a.add(var1);
      } finally {
         ;
      }

   }

   public final void b(ab var1) {
      synchronized(this){}

      try {
         this.a.remove(var1);
      } finally {
         ;
      }

   }

   public final boolean c(ab var1) {
      synchronized(this){}

      boolean var2;
      try {
         var2 = this.a.contains(var1);
      } finally {
         ;
      }

      return var2;
   }
}
