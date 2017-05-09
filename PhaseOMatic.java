import java.io.*;

public class PhaseOMatic{
	public static void main(String[] args) {
		String[] wordListOne = {"24/7","multi-tier","30000 feet","B to B","win-win","front-end","web-based",
								"pervasive","smart","six-sigma","critical-path","dynamic"};

		String[] wordListTwo = {"sticky","value-added","oriented", "centric", "distributed","clustered", "branded", 
								"outaide-the-box", "positioned","networked", "focused" , "leveraged", "aligned",
								"targeted", "shared" ,"cooperative", "accelerated"};

		String[] wordListThree = {"process", "tippingpoint","solution", "architecture", "core competency" ,"strategy",
								 "mindshare", "portal" , "apace" , "vision","paradigm", "mission"};

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		String phrase = wordListOne[rand1] +" "+wordListTwo[rand2]+" "+wordListThree[rand3];

		System.out.println("What we need is a "+phrase);
	}
}