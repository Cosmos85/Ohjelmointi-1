package Demo9;
// Generated by ComTest BEGIN
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;
import static Demo9.DynaamisetTietorakenteet4.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.01.07 00:01:33 // Generated by ComTest
 *
 */
public class DynaamisetTietorakenteet4Test {


  // Generated by ComTest BEGIN
  /** testEtsiEniten22 */
  @Test
  public void testEtsiEniten22() {    // DynaamisetTietorakenteet4: 22
    String[] sanat = { "koira", "syö", "muonaa", "ja", "tavaa", "javaa"} ; 
    assertEquals("From: DynaamisetTietorakenteet4 line: 24", "tavaa", etsiEniten(sanat, 'a')); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 25", "", etsiEniten(sanat, 'z')); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 26", "koira", etsiEniten(sanat, 'r')); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 27", "tavaa", etsiEniten(sanat, 'v')); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testEtsiEniten50 */
  @Test
  public void testEtsiEniten50() {    // DynaamisetTietorakenteet4: 50
    List<String> sanat2 = new ArrayList<String>(); 
    sanat2.add("koira"); 
    sanat2.add("syö"); 
    sanat2.add("muonaa"); 
    sanat2.add("ja"); 
    sanat2.add("tavaa"); 
    sanat2.add("javaa"); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 60", "tavaa", etsiEniten(sanat2, 'a')); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 61", "", etsiEniten(sanat2, 'z')); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 62", "koira", etsiEniten(sanat2, 'r')); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 63", "tavaa", etsiEniten(sanat2, 'v')); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testEtsiEnitenPaikka87 */
  @Test
  public void testEtsiEnitenPaikka87() {    // DynaamisetTietorakenteet4: 87
    List<String> sanat2 = new ArrayList<String>(); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 91", -1, etsiEnitenPaikka(sanat2, 'a')); 
    sanat2.add("koira"); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 93", 0, etsiEnitenPaikka(sanat2, 'a')); 
    sanat2.add("syö"); 
    sanat2.add("muonaa"); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 96", 2, etsiEnitenPaikka(sanat2, 'a')); 
    sanat2.add("ja"); 
    assertEquals("From: DynaamisetTietorakenteet4 line: 98", 1, etsiEnitenPaikka(sanat2, 's')); 
    sanat2.add("tavaa"); 
    sanat2.add("javaa"); 
  } // Generated by ComTest END
}