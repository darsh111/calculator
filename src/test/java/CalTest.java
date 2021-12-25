
import junit.framework.TestCase;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
public class CalTest extends TestCase {
//  private calculating cl;
   
//@Before
//   public void setup() {
//	 cl = new calculating();
//   }
//	
   calculating cl= new calculating();
   @Test
   public void testtAdd() {
      double a = 25;
      double b = 5;
      double expect = 30;
      cl.setAdd(a, b);
      double result=cl.getAdd();
      assertEquals(expect, result);

   }
   @Test
   public void testMult() {
      double a = 30;
      double b = 10;
      double expect = 300;
      cl.setMul(a, b);
      double result=cl.getMul();
      assertEquals(expect, result);

   }
   @Test
   public void testSub() {
      double a = 25;
      double b = 5;
      double expect = 20;
      cl.setSub(a, b);
      double result=cl.getSub();
      assertEquals(expect, result);

   }
   @Test
   public void testMod() {
      double a = 10;
      double b = 20;
      double expect = 10;
      cl.setMod(a, b);
      double result=cl.getMod();
      assertEquals(expect, result);

   }
   @Test
   public void testDiv() {
      double a = 50;
      double b = 10;
      double expect = 5;
      cl.setDiv(a,b);
      double result=cl.getDiv();
      assertEquals(expect, result);

   }
   @Test(expected = IllegalArgumentException.class)
   public void testgetDivzero() {
      double a = 5;
      double b = 0;
      cl.setDiv(a,b);
      cl.getDiv();
     
   }
}