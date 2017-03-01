package com.cxy;

import javax.crypto.AEADBadTagException;

/*
 * 
    * @ClassName: ArraySel
    * @Description: TODO(选择排序/简单排序)
    * @author cxy
    * @date 2017年3月1日
    *
 */
public class ArraySel {
	private long[] a;
	private int nElems;//现有数量
	
	public ArraySel(int max){
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
	
	//简单排序 --第一轮循环找到所有最小的值放在第一个位置，第二轮循环找到剩下最小的放在第二个位置.......
	public void selectionSort(){
		int out;//外层循环
		int in;//内层循环
		int min;//记录最小值的位置
		for(out=0;out<nElems;out++){
			min=out;
			for(in=out+1;in<nElems;in++){
				if(a[in]<a[min]){
					min=in;
				}  
			}
			long temp =a[out];
			a[out]=a[min];
			a[min]=temp;
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
