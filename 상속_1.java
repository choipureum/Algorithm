package Traning;
import java.util.*;

abstract class Converter {
	   abstract protected double convert(double src); // 추상 메소드
	   abstract protected String getSrcString(); // 추상 메소드
	   abstract protected String getDestString(); // 추상 메소드
	   protected double ratio; // 비율
	   public double run(double val) {
	      System.out.println("convert " + val + " " + getSrcString()+" to "+getDestString());
	      double res = convert(val);
	      System.out.println(res + " " + getDestString());
	      return res; 
	   }
	}

	class Won2Dollar extends Converter {
		public Won2Dollar(double val ) {
		this.ratio=val;
			 }	 

		@Override
		protected double convert(double src) {
			// TODO Auto-generated method stub
			
			return src/ratio;
		}

		@Override
		protected String getSrcString() {
			// TODO Auto-generated method stub
			return "won";
		}

		@Override
		protected String getDestString() {
			// TODO Auto-generated method stub
			return "dollar";
		}
	}

	class Km2Mile extends Converter {
		public Km2Mile(double val) {
			this.ratio=val;
		}

		@Override
		protected double convert(double src) {
			// TODO Auto-generated method stub
			
			return src/ratio;
		}

		@Override
		protected String getSrcString() {
			// TODO Auto-generated method stub
			return "km";
		}

		@Override
		protected String getDestString() {
			// TODO Auto-generated method stub
			return "mile";
		}

	}

	class Bakjoon {
	  public static void main(String[] args) {
	    Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
	    toDollar.run(2400);
	    Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
	    toMile.run(3.2);
	  }
	
	  
		  
	}


/*
추상 클래스 Converter는 단위를 변환하는데 필요한 것들을 구성하고 있다. 

Converter 클래스를 상속받아 
원화를 달러로 변환하는 Won2Dollar 클래스
km를 mile(마일)로 변환하는 Km2Mile 클래스를 작성하세요. 
 */
 