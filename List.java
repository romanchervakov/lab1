public class List <T> {
                   private T data = null;
                   private List<T> next = null, p;

                   public void  top(T data) {
                                    if (data == null) return;
                                    if (this.data != null) {
                                        p = new List<>();
                                        p.data = this.data;
                                        p.next = this.next;
                                        this.next = p;
                                    }
                                    this.data = data;
                   }

                   public void add(T data) {
                                   if (data == null) return;
                                   if (this.data == null)
                                       this.data = data;
                                   else {
                                       p = this;
                                       while (p.next != null)
                                              p = p.next;
                                       p.next = new List<>();
                                       p.next.data = data;
                                   }
                   }

                   public T pop_first() {
                                      T data = this.data;
                                      if (this.next != null) {
                                          this.data = this.next.data;
                                          this.next = this.next.next;
                                      } else this.data = null;
                                      return data;
                   }

                   public T pop_last() {
                                     if (this.next == null)
                                         return pop_first();
                                     else {
                                         p = this;
                                         while (p.next.next != null)
                                                p = p.next;
                                         T data = p.next.data;
                                         p.next = new List<>();
                                         p.next = null;
                                         return data;
                                     }
                   }

                   public boolean remove(T data) {
                                         if (data == null) return false;
                                         boolean found = false;
                                         if (this.data == data) {
                                             found = true;
                                             pop_first();
                                         }
                                         else {
                                             p = this;
                                             List<T> prev = p;
                                             while (!found && p.next != null) {
                                                    found = p.next.data == data;
                                                    prev = p;
                                                    p = p.next;
                                             }
                                             if (found) {
                                                 prev.next = p.next;
                                                 p = new List<>();
                                                 p = null;
                                             }
                                         }
                                         return found;
                   }

                   public T extract(T data) {
                                    if (remove(data))
                                        return data;
                                    return null;
                   }

                   public void print() {
                                     p = this;
                                     for (int i = 0; p != null; i++) {
                                          if (p.data != null)
                                              System.out.println(i+1 + ". " + p.data);
                                          p = p.next;
                                     }
                   }
}


