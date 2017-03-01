package com.cxy.array;

public class ArrayBub {

	private long[] a;
	private int nElems;
	
	public ArrayBub(int max){
		this.a=new long[max];
		this.nElems=0;
	}
	
	/**
	 * 返回元素个数
	 */
	public int size(){
		return this.nElems;
	}
	
	public void insert(long value){
		a[nElems]=value;
		nElems++;
	} 
	
	//冒泡排序
	public void bubbleSort(){
		int out;//out是最大值的位置，即一轮比较的终点
		int in;//
		for(out=nElems-1;out>1;out--){
			for(in=0;in<out;in++){
				if(a[in]>a[in+1]){//如果左边大于右边，交换左右位置
					long temp=a[in];
					a[in]=a[in+1];
					a[in+1]=temp;
				}
			}
		}
	}

	
	
	
	
}
