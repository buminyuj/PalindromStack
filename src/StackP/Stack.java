package StackP;

public class Stack {
	int size;
	int top;
	char [] veriler;
	Stack(int sizeP) {
		this.size=sizeP;
		this.top=-1;
		veriler=new char[size];
	}
	
	void push(char data) {
		if(isFull()) {
			System.out.println("Stack dolu!");
		}
		else {
			this.top++;
			this.veriler[this.top]=data;
		}
	}
	
	
	void print() {
		if(isEmpty()) {
			System.out.println("Stack Bos!");
		}
		else {
			for(int i=this.top;i>-1;i--) {
				System.out.println(veriler[i]+" ");
			}
		}	
	}
	
	public void palindromCheck() {
		int esitlik=0;
		int sayac=0;
		int top3=this.top;
		int orta=(0+top3)/2;
		int top2=this.top;
		for(int m=0;m<=orta;m++) {
			for(int t=top2;t>orta;t--) {
				//while(sayac<=size)
				if(veriler[m]==veriler[t]) {
					esitlik++;
					sayac++;
				}
			}
		}
		if(esitlik==size/2 || size-(2*esitlik)==1 ) {
			System.out.println(" Girdiginiz kelime palindromdur");
		}
		else 
			System.out.println(" Girdiginiz kelime palindrom degildir!! ");	
	}

	boolean isFull() {
		if(this.top==(this.size-1))
			return true;
		else 
			return false;
		
	}
	
	boolean isEmpty() {
		if(this.top==-1) 
			return true;
		else 
			return false;
	}

}
