package fr.thomas.control.bo;


public class MyTuple {
	 public final String origin; 
	  public final String dest; 
	  public MyTuple(String x, String y) { 
	    origin = x; 
	    dest = y; 
	  }
	public MyTuple(MyTuple o) {
	origin=o.origin;
		dest=o.dest;
	}
	public boolean isDestination(String id) {
		if(id==null || dest==null)
			return false;
		return id.compareTo(dest)==0;
	}
	public boolean isOrigin(String id) {
		if(id==null || origin==null)
			return false;
		return id.compareTo(origin)==0;
	}
	
	public boolean contains(String id) {
		if(id==null || dest==null|| origin==null)
			return false;
		return id.compareTo(dest)==0 || id.compareTo(origin)==0;
	}
	public String other(String id) {
		
		String lResult=origin;
		if(id.compareTo(lResult)!=0){
			lResult=dest;
		}
		return lResult;
	}
	public boolean match(String id, String found_id) { 
		System.err.println("le meme tuple?"+id+"/"+found_id+"?"+origin+"/"+dest);
		System.err.println("id est origine"+id.compareTo(origin));
		System.err.println("found_id est origine"+found_id.compareTo(origin));
		System.err.println("id est dest"+id.compareTo(dest));
		System.err.println("found_id est dest"+found_id.compareTo(dest));
		//if(id==null || found_id==null || origin==null || dest==null)
			//return false;
		return((id.compareTo(origin)==0 && found_id.compareTo(dest)==0)||(id.compareTo(dest)==0 && found_id.compareTo(origin)==0));
		
	}
	
}
