package com.cxy.array;


/**
    * @ClassName: OrdArray
    * @Description: TODO(有序数组)
    * @author cxy
    * @date 2017年2月28日
    *
 */
public class OrdArray {

	private long[] a;   //数组
	private int nElems; //数据个数
	
	public OrdArray(int max){
		this.a=new long[max];
		this.nElems=0;
	}
	
	/**
	 * 返回元素个数
	 */
	public int size(){
		return this.nElems;
	}
	
	//二分查找后方法
	public int find(long value){
		int lowerBound =0;
		int upperBound=nElems-1;
		int curIn;
		while(true){
			curIn=(lowerBound+upperBound)/2;//出现除不尽的情况会舍去小数点
			if(a[curIn]==value){
				return curIn;
			}else if(lowerBound>upperBound){//说明没有找到
				return nElems;//返回大于索引的整数
			}else{//还要继续查找
				if(a[curIn]<value){//往后查询
					lowerBound=curIn+1;
				}else{//往前查询
					upperBound=curIn+1;
				}
			}
		}
		
	}
	
	
	
	
	//插入方法（线性查找后添加）
	public void insert(long value){
		int j;
		//先找到插入位置
		for(j=0;j<nElems;j++){
			if(a[j]>value){
				break;
			}
		}
		//将插入位置后面的数据往后移动
		for(int k=nElems;k>j;k++){
			a[k]=a[k-1];
		}
		//插入
		a[j]=value;
		nElems++;
	}
	
	//删除（二分查找）
	public boolean delete(long value){
		int j =find(value);
		if(j==nElems){
			return false;
		}else{
			for(int k=j;k<nElems;k++){
				a[k]=a[k+1];
			}
			nElems--;
			return true;
		}
	}
	
}
