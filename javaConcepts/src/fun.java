import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Consumer;
import java.util.stream.Stream;
class fun implements Cloneable{
   int a;
   fun(int a){
       this.a=a;
   }
   public static void k(Integer k){
   }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
           PriorityQueue<Integer> w=new PriorityQueue<Integer>();
           w.add(78);
        w.add(8);

        w.add(84);

        w.add(23);
        System.out.println(w);

    }
}