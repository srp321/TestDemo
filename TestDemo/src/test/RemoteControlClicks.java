package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoteControlClicks {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String startEnd = br.readLine();
			String channelsString = br.readLine();
			System.out.println(getMinimumClicks(startEnd, channelsString));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int getMinimumClicks(String startEnd, String channelsString) {
		int minClickCount = 0;
		int i = 0;
		String range[] = startEnd.split(",");
		int start = Integer.parseInt(range[0]);
		int end = Integer.parseInt(range[1]);
		String channelString[] = channelsString.split(",");
		int[] channels = new int[channelString.length];
		for (String str : channelString) {
			channels[i] = Integer.parseInt(str);
			i++;
		}
		minClickCount += minimum(Math.abs(channels[0] - start), digitCount(channels[0]), Math.abs(channels[0] - end));
		int previousChannel = start;
		for (i = 1; i < channels.length; i++) {
			minClickCount += minimum(Math.abs(channels[i] - channels[i - 1]), digitCount(channels[i]),
					Math.abs(channels[i] - previousChannel) + 1);
			previousChannel = channels[i - 1];
		}
		return minClickCount;
	}

	public static int minimum(int item1, int item2, int item3) {
		if (item1 < item2) {
			if (item1 < item3) {
				return item1;
			} else {
				return item3;
			}
		} else {
			if (item2 < item3) {
				return item2;
			} else {
				return item3;
			}
		}
	}

	public static int digitCount(int num) {
		int digCount = 0;
		for (int i = num; i > 0; i /= 10) {
			digCount++;
		}
		return digCount;
	}
}