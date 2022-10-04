 /**
 * Класс-контейнер на основе списочной структуры данных, также может рассматриваться как стек или очередь.
 * @param <T> тип хранимых данных
 * @author Роман Черваков
 */
public class List <T> {
             protected T data = null;
             protected List<T> next = null, p;

             /**
             *Метод для добавления данных перед самым первым элементом
             * @param data добавляемые данные
             */
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

             /**
             *Метод для добавления данных после самого последнего элемента
             * @param data добавляемые данные
             */
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

             /**
             *Метод для извлечения самого первого элемента
             * @return хранимые в самом первом элементе данные
             */
             public T pop_first() {
                                T data = this.data;
                                if (this.next != null) {
                                    this.data = this.next.data;
                                    this.next = this.next.next;
                                }
                                else this.data = null;
                                return data;
             }

             /**
             *Метод для извлечения самого последнего элемента
             * @return хранимые в самом последнем элементе данные
             */
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

             /**
             * Метод для удаления данных
             * @param data удаляемые данные
             * @return false, если контейнер не содержит удаляемые данные; true, если удаление прошло успешно
             */
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

             /**
             * Метод для извлечения данных
             * @param data извлекаемые данные
             * @return извлекаемые данные или null, если контейнер не содержит извлекаемые данные
             */
             public T extract(T data) {
                              if (remove(data))
                                  return data;
                              return null;
             }

             /**
             * Метод для выведения на экран нумеровонного списка хранимых данных
             */
             public void print() {
                               p = this;
                               for (int i = 0; p != null; p = p.next, i++)
                                    if (p.data != null)
                                        System.out.println(i+1 + ". " + p.data);
             }
}


