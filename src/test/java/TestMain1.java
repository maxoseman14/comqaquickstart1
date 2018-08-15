import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class TestMain1 {

    BlackJack blackjack;

    @Before
    public void before(){
        blackjack = new BlackJack();
        System.out.println("Before Test");
    }

    @Test
    public void test1 () {
        System.out.println("Test 1");
        assertEquals(10, blackjack.play(10,22));
    }

    @Ignore
    @Test
    public void test2 () {
        System.out.println("Test 2");
        assertEquals(8, blackjack.play(22,9));  //This test will fail because the result is not equal to 8
    }

    @Test
    public void test3 () {
        System.out.println("Test 3");
        assertTrue(blackjack.play(20,18)==20);
    }

    @Test
    public void test4 (){
        System.out.println("Test 4");
        Author author = new Author();
        assertNull(author.getName());
    }

    @Test
    public void test5(){
        System.out.println("Test 5");
        Author author = new Author();
        author.setName("Max");
        assertEquals("Max", author.getName());
    }

    @Test
    public void test6(){
        System.out.println("Test 6");
        System.out.println(blackjack.play(5,21));
    }



    }
