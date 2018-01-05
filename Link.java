package th.ac.utcc.cpe.khridtaphas;

/**@Khridtaphas_UChang 5907101004
 */


public class Link {
	 public long data;
	  public Link next;

	  public Link(long val) {
	    data = val;
	    next = null;
	  }

	  public void displayLink() {
	    System.out.print(data + " ");
	  }

	}  // end class

