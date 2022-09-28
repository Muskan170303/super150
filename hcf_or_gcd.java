package super150_A;

public class hcf_or_gcd {
	public static void main(String args[]) {
		int divd=60;
		int divr=36;		//doesn't matter what is divd and divr;
		int rem;
		while(divd % divr !=0) {
			rem=divd % divr;
			divd=divr;
			divr=rem;
		}
		System.out.println("HCF or GCD="+divr);
	}
}
