package java_2015_B;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
public class Main007_牌型总数 {
	static int ans,lastSize;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<String>() ;
		for(int i1=1;i1<=13;i1++) {
		for(int i2=1;i2<=13;i2++) {
		for(int i3=1;i3<=13;i3++) {
		for(int i4=1;i4<=13;i4++) {
		for(int i5=1;i5<=13;i5++) {
		for(int i6=1;i6<=13;i6++) {
		for(int i7=1;i7<=13;i7++) {
		for(int i8=1;i8<=13;i8++) {
		for(int j1=1;j1<=13;j1++) {
		for(int j2=1;j2<=13;j2++) {
		for(int j3=1;j3<=13;j3++) {
		for(int j4=1;j4<=13;j4++) {
		for(int j5=1;j5<=13;j5++) {
		for(int j6=1;j6<=13;j6++) {


			StringBuffer sb = new StringBuffer();
			HashMap<Integer, Integer> map = new HashMap<>();
			map.put(i1,0);  map.put(i2,0);  map.put(i3,0);
			map.put(i4,0);  map.put(i5,0);  map.put(i6,0);
			map.put(i7,0);  map.put(i8,0);  map.put(j1,0);
			map.put(j2,0);  map.put(j3,0);  map.put(j4,0);
			map.put(j5,0);  map.put(j6,0);

			if(map.get(i1)!=4)  {sb.append(i1).append("_"); map.put(i1,map.get(i1)+1);}
			else   continue;
			if(map.get(i2)!=4)  {sb.append(i2).append("_"); map.put(i2,map.get(i2)+1);}
			else   continue;
			if(map.get(i3)!=4)  {sb.append(i3).append("_").append("_"); map.put(i3,map.get(i3)+1);}
			else   continue;
			if(map.get(i4)!=4)  {sb.append(i4).append("_"); map.put(i4,map.get(i4)+1);}
			else   continue;
			if(map.get(i5)!=4)  {sb.append(i5).append("_"); map.put(i5,map.get(i5)+1);}
			else   continue;
			if(map.get(i6)!=4)  {sb.append(i6).append("_"); map.put(i6,map.get(i6)+1);}
			else   continue;
			if(map.get(i7)!=4)  {sb.append(i7).append("_"); map.put(i7,map.get(i7)+1);}
			else   continue;
			if(map.get(i8)!=4)  {sb.append(i8).append("_"); map.put(i8,map.get(i8)+1);}
			else   continue;
			if(map.get(j1)!=4)  {sb.append(j1).append("_"); map.put(j1,map.get(j1)+1);}
			else   continue;
			if(map.get(j2)!=4)  {sb.append(j2).append("_"); map.put(j2,map.get(j2)+1);}
			else   continue;
			if(map.get(j3)!=4)  {sb.append(j3).append("_"); map.put(j3,map.get(j3)+1);}
			else   continue;
			if(map.get(j4)!=4)  {sb.append(j4).append("_"); map.put(j4,map.get(j4)+1);}
			else   continue;
			if(map.get(j5)!=4)  {sb.append(j5).append("_"); map.put(j5,map.get(j5)+1);}
			else   continue;
			if(map.get(j6)!=4)  {sb.append(j6).append("_"); map.put(j6,map.get(j6)+1);}
			else   continue;
			set.add(sb.toString());
		}}}}}}}}}}}}}}
		//System.out.println(ans);
		System.out.println(set.size());
		}}
