package com.gzbz.war.redcliff;

public class RedCliffEvent {
   public int id;
   public int time;
   public boolean receive;

   public RedCliffEvent() {
   }

   public RedCliffEvent(int id, int time) {
      this.id = id;
      this.time = time;
      this.receive = false;
   }
}
