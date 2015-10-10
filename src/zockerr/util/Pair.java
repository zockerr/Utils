package zockerr.util;

public class Pair<L,R> {
	
	private L l;
	private R r;
	public Pair(L l, R r){
		this.l = l;
		this.r = r;
	}
	public L getLeft(){return l;}
	public R getRight(){return r;}

}
