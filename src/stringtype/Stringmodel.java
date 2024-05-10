package stringtype;

public class Stringmodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Welcome to singara chennai";
		int lt = st.length();
		System.out.println(lt);
		
		
		boolean bn = st.equals("Welcome to singara chennAI");
		System.out.println(bn);
		
		boolean b2 = st.equals("Welcome to singara chennai");
		System.out.println(b2);
		
		boolean yy = st.equalsIgnoreCase("WELCOME to singara chennai");
		System.out.println(yy);
		
		String yt = st.toUpperCase();
		System.out.println(yt);
		
		String dd = st.toLowerCase();
		System.out.println(dd);
		
		boolean ee = st.startsWith("We");
		System.out.println(ee);
		
		boolean ss = st.endsWith("i"); // Only last letter of the word.
		System.out.println(ss);
		
		boolean ww = st.contains("nai"); // continue word enter it will accept. incase enter 1th and 5th letter
		System.out.println(ww);          // then will not accept
		                              
		String ff = st.replace("chennai", "Madurai");
		System.out.println(ff);
		
		int dt = st.lastIndexOf("c");
		System.out.println(dt);
		
		String r = "";
		boolean fi = r.isEmpty();
		System.out.println(fi);
		
		String wq=st.substring(3);  // By giving on index value, we can print from what we have entered
		System.out.println(wq);
		
		System.out.println(st.substring(3, 7)); //first letter will mentioned but last letter won't be mentioned
	    
		String rt=st.concat(" have a fun");
		System.out.println(rt);
		
		char di=st.charAt(0);
		System.out.println("what"+di);
		
		int dx=st.indexOf("t");
		System.out.println(dx);
		
		int xx=st.indexOf("n", 14);
		System.out.println(xx);
		
		String uu="  Good Morning     ";
		String aa=uu.trim();
		System.out.println(aa);
		
		
		
		//System.out.println(String.valueOf(st));
		
		String jj="Am,I,Teaching,Nice";
		String[] cx=jj.split(",");
		for (String string : cx) {
			System.out.println(string);
		}
		
		System.out.println(st);
		
		String hp=st.substring(6);
		System.out.println(hp);
		
		String dr=st.substring(8, 15);
		System.out.println(dr);
		
		
		
		
		
		
	}

}
