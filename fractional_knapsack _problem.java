import java.util.Arrays;
import java.util.Comparator;
public class FractionalKnapSack {
	private static double getMaxValue(ItemValue[] arr,
									int capacity)
	{
		Arrays.sort(arr, new Comparator<ItemValue>() {
			@Override
			public int compare(ItemValue item1,
							ItemValue item2)
			{
				double cpr1
					= new Double((double)item1.value
								/ (double)item1.weight);
				double cpr2
					= new Double((double)item2.value
								/ (double)item2.weight);
				if (cpr1 < cpr2)
					return 1;
				else
					return -1;
			}
		});

		double totalValue = 0d;
		for (ItemValue i : arr) {
			int curWt = (int)i.weight;
			int curVal = (int)i.value;
			if (capacity - curWt >= 0) {
				capacity = capacity - curWt;
				totalValue += curVal;
			}
			else {
				double fraction
					= ((double)capacity / (double)curWt);
				totalValue += (curVal * fraction);
				capacity
					= (int)(capacity - (curWt * fraction));
				break;
			}
		}

		return totalValue;
	}
	static class ItemValue {

		int value, weight;
		public ItemValue(int val, int wt)
		{
			this.weight = wt;
			this.value = val;
		}
	}
	public static void main(String[] args)
	{

		ItemValue[] arr = { new ItemValue(60, 10),
							new ItemValue(100, 20),
							new ItemValue(120, 30) };
		int capacity = 50;
		double maxValue = getMaxValue(arr, capacity);
		System.out.println("Maximum value we can obtain = "
						+ maxValue);
	}
}
