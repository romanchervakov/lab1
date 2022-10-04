import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListTest <T> extends List{
      ListTest<Integer> list;

      @BeforeEach
      public void set_up(){
                         list = new ListTest<>();
      }

      @Test
      public void empty_list_add_to_the_top(){
                                            list.top(7);
                                            assertEquals(7, list.data);
      }

      @Test
      public void add_to_the_top(){
                                 list.top(7);
                                 list.top(5);
                                 assertEquals(5, list.data);
      }

      @Test
      public void no_null_top(){
                              list.top(7);
                              list.top(null);
                              assertNotNull(list.data);
      }

      @Test
      public void add_to_the_empty_list(){
                                        list.add(7);
                                        assertEquals(7, list.data);
      }

      @Test
      public void add_to_the_list(){
                                  list.add(7);
                                  list.add(5);
                                  assertEquals(5, list.next.data);
      }

      @Test
      public void no_null_add(){
                              list.add(null);
                              list.add(7);
                              assertNotNull(list.data);
      }

      @Test
      public void empty_list_pop_first(){
                                       assertNull(list.pop_first());
      }

      @Test
      public void empty_list_pop_last(){
                                      assertNull(list.pop_last());
      }

      public void init(){
                       list.add(7);
                       list.add(5);
                       list.add(3);
      }

      @Test
      public void list_pop_first(){
                                 init();
                                 assertEquals(7, list.pop_first());
      }

      @Test
      public void list_pop_last(){
                                init();
                                assertEquals(3, list.pop_last());
      }

      @Test
      public void remove_stored_data(){
                                     init();
                                     assertTrue(list.remove(5));
      }

      @Test
      public void remove_not_stored_data(){
                                         init();
                                         assertFalse(list.remove(17));
      }

      @Test
      public void extract_stored_data(){
                                      init();
                                      assertEquals(5, list.extract(5));
      }

      @Test
      public void extract_not_stored_data(){
                                          init();
                                          assertNull(list.extract(17));
      }
}