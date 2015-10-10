package zockerr.util;
/**
 * A very simple implementation of a mutable pair.
 * 
 * @author Marian Stein
 *
 * @param <L> The type of the left field in the pair.
 * @param <R> The type of the right field in the pair.
 *
 */
public class Pair<L,R> {
	
	private L l;
	private R r;
	/**
	 * 
	 * @param l The left element
	 * @param r The right element
	 */
	public Pair(L l, R r){
		this.l = l;
		this.r = r;
	}
	/**
	 * 
	 * @return The left element
	 */
	public L getLeft(){return l;}
	/**
	 * 
	 * @return The right element
	 */
	public R getRight(){return r;}

}
