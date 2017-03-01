package com.cxy.array;

public class ArrayIns {
	private long[] a;
	private int nElems;//现有数量
	
	public ArrayIns(int max){
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
	
	public void showAll(){
		for(int j=0;j<nElems;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
	
	//把第一个元素当初有序元素 把第二个元素放入temp区 和第一个元素比较 插入第一个元素的左边或者右边
	//把第3个元素放入临时区 和前2个元素进行比较 插入合适的位置
	public void insertSort(){  
		int out;//外层循环
		int in;//内层循环
		for(out=1;out<nElems;out++){
			long temp=a[out];
			in=out;
			while(in>0&&a[in-1]>=temp){
				a[in]=a[in-1];
				in--;
			}
			a[in]=temp;
		}
	}
	
	public static void main(String[] args) {
		ArraySel arraySel = new ArraySel(10);
		arraySel.insert(77);
		arraySel.insert(22);
		arraySel.insert(11);
		arraySel.insert(33);
		arraySel.insert(44);
		arraySel.insert(88);
		arraySel.insert(99);
		arraySel.insert(123);
		arraySel.insert(12);
		arraySel.insert(14);
		arraySel.showAll();
		arraySel.selectionSort();
		arraySel.showAll();
		
		
		
	}
	
}
