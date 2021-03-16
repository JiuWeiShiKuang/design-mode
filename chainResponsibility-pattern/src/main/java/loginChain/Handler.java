package loginChain;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/16 10:40
 */
public abstract class Handler<T> {
    protected Handler chain;

    public void next(Handler handler){
        this.chain = handler;
    }

    public abstract void doHandler(Member member);

   public static class Builder<T>{
       private Handler<T> head;
       private Handler<T> tail;

       public Builder<T> addBuilder(Handler<T> handler){
           if (this.head == null){
               this.head = this.tail = handler;
               return this;
           }
           this.tail.next(handler);
           this.tail = handler;
           return this;
       }

       public Handler<T> build(){
           return this.head;
       }
   }

}
