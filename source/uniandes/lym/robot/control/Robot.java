/* Generated By:JavaCC: Do not edit this line. Robot.java */
package uniandes.lym.robot.control;
import uniandes.lym.robot.kernel.*;
import java.awt.Point;
import java.io.*;
import java.util.*;
@ SuppressWarnings("serial")
public class Robot implements RobotConstants {
  private RobotWorldDec world;

  void setWorld(RobotWorld w)
  {
    world = (RobotWorldDec) w;
  }
  String salida = new String();

  final public boolean command(StringBuffer sistema) throws ParseException {
  salida = new String();
    if (jj_2_7(2)) {
      if (jj_2_1(2)) {
        jj_consume_token(LPAREN);
        move();
        jj_consume_token(RPAREN);
      } else if (jj_2_2(2)) {
        jj_consume_token(LPAREN);
        jj_consume_token(PUT);
        putItem();
        jj_consume_token(RPAREN);
      } else if (jj_2_3(2)) {
        jj_consume_token(LPAREN);
        jj_consume_token(PICK);
        pickItem();
        jj_consume_token(RPAREN);
      } else if (jj_2_4(2)) {
        jj_consume_token(LPAREN);
        turn();
        jj_consume_token(RPAREN);
      } else if (jj_2_5(2)) {
        jj_consume_token(LPAREN);
        face();
        jj_consume_token(RPAREN);
      } else if (jj_2_6(2)) {
        jj_consume_token(LPAREN);
        parseConstant();
        jj_consume_token(RPAREN);
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(31);
    //  try {
    //		 Thread.sleep(1);
    //   } catch (InterruptedException e) {
    //	        System.err.format("IOException: %s%n", e);
    //	    }
    sistema.append(salida);
    {if (true) return true;}
    } else if (jj_2_8(2)) {
      jj_consume_token(31);
    {if (true) return true;}
    } else if (jj_2_9(2)) {
      jj_consume_token(0);
    {if (true) return false;}
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public void putItem() throws ParseException {
  int f = 1;
    if (jj_2_10(2)) {
      jj_consume_token(CHIPS);
      f = numero();
      world.putChips(f);
    } else if (jj_2_11(2)) {
      jj_consume_token(BALLOONS);
      f = numero();
      world.putBalloons(f);
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void pickItem() throws ParseException {
  int f = 1;
    if (jj_2_12(2)) {
      jj_consume_token(CHIPS);
      f = numero();
      world.pickChips(f);
    } else if (jj_2_13(2)) {
      jj_consume_token(BALLOONS);
      f = numero();
      world.grabBalloons(f);
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void move() throws ParseException {
  int x = 1;
    jj_consume_token(MOVE);
    x = numero();
      world.moveForward(x);
      salida = "Command: Moveforward ";
  }

  final public void turn() throws ParseException {
  Map < String, Integer > directions = Map.of(
  ":right", 1,
  ":around", 2,
  ":left", 3
  );
  String c;
    jj_consume_token(TURN);
    c = constant();
      int giros = directions.get(c);
      salida = "Numero de giros: " + giros;
      for (int i = 1; i <= giros; i++)
      {
        world.turnRight();
      }
  }

  final public void face() throws ParseException {
    jj_consume_token(FACE);
    int directions = world.getFacing();
    String d = "";
    switch (directions)
    {
      case 0 :
      d = "North";
      break;
      case 1 :
      d = "South";
      break;
      case 2 :
      d = "East";
      break;
      case 3 :
      d = "West";
      break;
    }
    salida = "The robot direction is: " + d;
    /* Estaba mirando si obtener el facing estaba funcionando y en efecto funciona! */

  }

  final public void parseConstant() throws ParseException {
  String text;
    jj_consume_token(DEFVAR);
    text = constant();
      salida = "constante: " + text;
  }

/**
	 *  reconoce un numero entero sin signo
	 * @return el valor entero correspondiente al valor reconocido
	 */
  final public int numero() throws ParseException, Error {
  int total = 1;
    jj_consume_token(NUMERO);
    try
    {
      total = Integer.parseInt(token.image);
    }
    catch (NumberFormatException ee)
    {
      // Dada la forma de NUMERO, sabemos que solo puede tener d�gitos
      // Por lo tanto, lo unico que podria pasar es que el numero sea muy grande
      {if (true) throw new Error("Number out of bounds: " + token.image + "!!");}
    }
    {if (true) return total;}
    throw new Error("Missing return statement in function");
  }

/**
	 * reconoce una constante
	 * @return el valor string correspondiente al valor reconocido
	 */
  final public String constant() throws ParseException, Error {
  Token token;
    label_1:
    while (true) {
      token = jj_consume_token(CONSTANT);
      if (jj_2_14(2)) {
        ;
      } else {
        break label_1;
      }
    }
    {if (true) return token.image;}
    throw new Error("Missing return statement in function");
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  private boolean jj_2_7(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  private boolean jj_2_8(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  private boolean jj_2_9(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  private boolean jj_2_10(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  private boolean jj_2_11(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_11(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  private boolean jj_2_12(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_12(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  private boolean jj_2_13(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_13(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  private boolean jj_2_14(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_14(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  private boolean jj_3_9() {
    if (jj_scan_token(0)) return true;
    return false;
  }

  private boolean jj_3_8() {
    if (jj_scan_token(31)) return true;
    return false;
  }

  private boolean jj_3R_6() {
    if (jj_scan_token(NUMERO)) return true;
    return false;
  }

  private boolean jj_3R_4() {
    if (jj_scan_token(FACE)) return true;
    return false;
  }

  private boolean jj_3_13() {
    if (jj_scan_token(BALLOONS)) return true;
    if (jj_3R_6()) return true;
    return false;
  }

  private boolean jj_3_6() {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_5()) return true;
    return false;
  }

  private boolean jj_3_5() {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_4()) return true;
    return false;
  }

  private boolean jj_3_4() {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_12() {
    if (jj_scan_token(CHIPS)) return true;
    if (jj_3R_6()) return true;
    return false;
  }

  private boolean jj_3_3() {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_scan_token(PICK)) return true;
    return false;
  }

  private boolean jj_3_2() {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_scan_token(PUT)) return true;
    return false;
  }

  private boolean jj_3_1() {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_2()) return true;
    return false;
  }

  private boolean jj_3_7() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_1()) {
    jj_scanpos = xsp;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3_3()) {
    jj_scanpos = xsp;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_3_5()) {
    jj_scanpos = xsp;
    if (jj_3_6()) return true;
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_3() {
    if (jj_scan_token(TURN)) return true;
    return false;
  }

  private boolean jj_3R_5() {
    if (jj_scan_token(DEFVAR)) return true;
    return false;
  }

  private boolean jj_3_14() {
    if (jj_scan_token(CONSTANT)) return true;
    return false;
  }

  private boolean jj_3_11() {
    if (jj_scan_token(BALLOONS)) return true;
    if (jj_3R_6()) return true;
    return false;
  }

  private boolean jj_3_10() {
    if (jj_scan_token(CHIPS)) return true;
    if (jj_3R_6()) return true;
    return false;
  }

  private boolean jj_3R_2() {
    if (jj_scan_token(MOVE)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public RobotTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[14];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Robot(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Robot(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new RobotTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Robot(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new RobotTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Robot(RobotTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(RobotTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[32];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 0; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 32; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 14; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
            case 7: jj_3_8(); break;
            case 8: jj_3_9(); break;
            case 9: jj_3_10(); break;
            case 10: jj_3_11(); break;
            case 11: jj_3_12(); break;
            case 12: jj_3_13(); break;
            case 13: jj_3_14(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
