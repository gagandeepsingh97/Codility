import java.util.*;
class Solution {
    public static boolean checkBF(int a[], int b[], int c[], int mid)
	{
		int n = a.length;
		boolean planksBool[] = new boolean[n];
		for(int i=0; i<=mid; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(c[i]>=a[j] && c[i]<=b[j]) planksBool[j]=true;
			}
		}
		for(boolean i : planksBool) if(i==false) return false;
		return true;
	}
	public static boolean lower_bound(int []nails, int s, int e)
	{
		int lb = 0;
		int ub = nails.length-1;
		while(lb<=ub)
		{
			int mid = lb + (ub-lb)/2;
			if(nails[mid]>=s && nails[mid]<=e) return true;
			else if(nails[mid]<s) lb = mid + 1;
			else ub = mid -1;
			
		}
		return false;
	}
	public static boolean checkRE(int a[], int b[], int c[], int mid)
	{
		int n = a.length;
		int nails[] = new int[mid+1];
		for(int i=0; i<=mid; i++) nails[i]=c[i];
		Arrays.sort(nails);
		for(int i=0; i<n; i++)
		{
			if(!lower_bound(nails,a[i],b[i])) return false;
		}
		return true;
	}
	public int solution(int[] A, int[] B, int[] C)
	{
		int s = 0;
		int e = C.length-1;
		int ans = 0;
		boolean flag = false;
		while(s<=e)
		{
			int mid=s+(e-s)/2;
			if(checkRE(A,B,C,mid)==true)
			{
				flag = true;
				ans = mid;
				e   = mid-1;
			}
			else s = mid+1;
		}
		if(ans==C.length && flag) return -1;
		else if(ans==0 && !flag ) return -1;
		return ans+1;
	}
}