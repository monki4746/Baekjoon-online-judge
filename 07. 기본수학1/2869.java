import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long V = Long.parseLong(st.nextToken());

		long destination = V - B;
		long dist = A - B;

		long div = destination / dist;
		long mod = destination % dist;

		long day = div;
		if(mod != 0) {
			day = day + 1;
			System.out.println(day);
		}
		else {
			System.out.println(day);
		}

	}
}
