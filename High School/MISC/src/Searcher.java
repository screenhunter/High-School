import java.io.IOException;

public class Searcher {

	public static void main(String[] args) throws IOException {

		for (int i = 0; i < 60; i++) {
			String[] temp = {
					"open",
					"-a",
					"safari",
					"http://www.bing.com/search?q="
							+ i
							+ "&go=Submit&qs=n&form=QBRE&pq=word&sc=8-3&sp=-1&sk=&cvid=386ca864cf124a3baa6028e2bce6d519" };
			Runtime.getRuntime().exec(temp);
			Runtime.getRuntime().exec(new String[]{"kill", "safari"});

		}

	}

}
