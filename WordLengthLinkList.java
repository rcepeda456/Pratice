
/*
 * given a linked list which represents a word, return the length of the word
 * for example the word "string" can be represented by a linked list like so ['s'] -> ['t'] -> ['r'] -> ['i'] -> ['n'] -> ['g']
 * the word "string" has a length of 6 so you're function should return 6
*/

class Node {
  char c;
  Node next;

  public Node(char input) {
    this.c = input;
  }

}


class Solution {

  public static void main(String[] args) {
    Node s = Node('s');
    Node t = Node('t');
    Node r = Node('r');
    Node i = Node('i');
    Node n = Node('n');
    Node g = Node('g');
    Node b = Node('');
    Node x = Node('x');
    Node y = Node('y');
    Node z = Node('z');
    Node b2 = Node('');

    s.next = t;
    t.next = r;
    r.next = i;
    i.next = n;
    n.next = g; // "string" s -> t -> r -> i -> n -> g
    g.next = b;
    b.next = x;
    x.next = y;
    y.next = z;
    z.next = b2; // "string xyz " s -> t -> r -> i -> n -> g ->  -> x -> y -> z ->  ->

    System.out.println(getLengthOfListWord(s));
  }

  public static int getLengthOfListWord(Node word) {
    // code here ...

    int count = 0;

    while(word != null){
      	// Sring xyz " s -> t -> r -> i -> n -> g -> '' -> x -> y -> z -> '' ->
      	// count = 4
      if(word.c != '') {
        count ++;
      }
      word = word.next;
  	}

    return count;

  }
}
